package main.visitor;

import java.util.*;
import java.util.regex.*;
public final class Replacer {

    private static final int SPACE_UNIT = 4;
    private static final Pattern DEFINE_PATTERN = Pattern.compile("#define\\s+(\\w+)\\s+(.+)");
    private static final Pattern TYPEDEF_PATTERN = Pattern.compile("typedef\\s+(\\S+)\\s+(\\w+);\\s*");
    private static final Pattern CONST_PATTERN = Pattern.compile("\\bconst\\b\\s*");

    private Replacer() { }

    public static String transform(String input) {
        String[] rawLines = input.split("\n", -1);
        List<String> workingLines = new ArrayList<>();
        Map<String,String> defines = new LinkedHashMap<>();
        Map<String,String> typedefs = new LinkedHashMap<>();

        // First pass: collect defines, typedefs, and copy other lines
        boolean inBlockComment = false;
        for (String line : rawLines) {
            String trimmed = line.trim();
            if (inBlockComment) {
                if (trimmed.contains("*/")) inBlockComment = false;
                workingLines.add(line);
                continue;
            }
            if (trimmed.startsWith("/*")) {
                if (!trimmed.contains("*/")) inBlockComment = true;
                workingLines.add(line);
                continue;
            }
            Matcher defM = DEFINE_PATTERN.matcher(trimmed);
            Matcher tdM = TYPEDEF_PATTERN.matcher(trimmed);
            if (defM.matches()) {
                defines.put(defM.group(1), defM.group(2).trim());
                workingLines.add(""); // preserve newline
            } else if (tdM.matches()) {
                typedefs.put(tdM.group(2), tdM.group(1));
                workingLines.add(""); // preserve newline
            } else {
                workingLines.add(line);
            }

        }

        // Prepare ordered replacement keys
        List<String> keys = new ArrayList<>(defines.keySet());
        keys.addAll(typedefs.keySet());
        keys.sort((a,b) -> Integer.compare(b.length(), a.length()));

        // Expand and adjust syntax
        List<String> resultLines = new ArrayList<>();
        Deque<Integer> indentStack = new ArrayDeque<>();
        boolean insideBlockComment = false;
        int lastCodeLine = -1;

        for (String currentLine : workingLines) {
            String clean = currentLine.trim();
            // comments handling
            if (insideBlockComment) {
                if (clean.contains("*/")) insideBlockComment = false;
                resultLines.add(currentLine);
                continue;
            }
            if (clean.startsWith("/*")) {
                if (!clean.contains("*/")) insideBlockComment = true;
                resultLines.add(currentLine);
                continue;
            }
            if (clean.isEmpty() || clean.startsWith("//")) {
                resultLines.add(currentLine);
                continue;
            }

            // split code and comment
            int commentIdx = locateComment(currentLine);
            String codeSeg = commentIdx >= 0 ? currentLine.substring(0, commentIdx) : currentLine;
            String commentSeg = commentIdx >= 0 ? currentLine.substring(commentIdx) : "";
            if (commentSeg.contains("/*") && !commentSeg.contains("*/")) {
                insideBlockComment = true;
            }

            // replace macros, typedefs, const
            String processed = codeSeg;
            for (String key : keys) {
                String value = defines.containsKey(key) ? defines.get(key) : typedefs.get(key);
                processed = processed.replaceAll("\\b" + Pattern.quote(key) + "\\b", Matcher.quoteReplacement(value));
            }
            // remove const
            processed = CONST_PATTERN.matcher(processed).replaceAll("");

            // indentation logic
            int indent = countLeadingSpaces(currentLine) / SPACE_UNIT;
            boolean blockStart = processed.trim().endsWith(":");
            boolean blockEnd = processed.trim().equals("end");

            if (!blockEnd) {
                while (!indentStack.isEmpty() && indent < indentStack.peek()) {
                    if (lastCodeLine >= 0) {
                        resultLines.set(lastCodeLine, resultLines.get(lastCodeLine) + " }");
                    }
                    indentStack.pop();
                }
            }

            StringBuilder sb = new StringBuilder(" ".repeat(indent * SPACE_UNIT));
            String codeTrim = processed.trim();
            if (blockStart) {
                String header = codeTrim.substring(0, codeTrim.length()-1).trim();
                sb.append(header).append(" {");
                indentStack.push(indent+1);
            } else if (blockEnd) {
                if (!indentStack.isEmpty()) {
                    sb.append("}");
                    indentStack.pop();
                }
                sb.append("end;");
            } else {
                sb.append(codeTrim);
                if (!codeTrim.endsWith(";") && !codeTrim.endsWith("{") && !codeTrim.endsWith("}")) {
                    sb.append(";");
                }
            }
            if (!commentSeg.isEmpty()) {
                if (!Character.isWhitespace(commentSeg.charAt(0))) sb.append(' ');
                sb.append(commentSeg);
            }

            resultLines.add(sb.toString());
            lastCodeLine = resultLines.size()-1;
        }

        while (!indentStack.isEmpty() && lastCodeLine >= 0) {
            resultLines.set(lastCodeLine, resultLines.get(lastCodeLine) + " }");
            indentStack.pop();
        }

        return String.join("\n", resultLines);
    }

    private static int countLeadingSpaces(String line) {
        int i = 0;
        while (i < line.length() && line.charAt(i) == ' ') i++;
        return i;
    }

    private static int locateComment(String line) {
        boolean sq = false, dq = false;
        for (int i = 0; i < line.length()-1; i++) {
            char c = line.charAt(i);
            if ((sq || dq) && c == '\\') { i++; continue; }
            if (!dq && c == '\'') sq = !sq;
            else if (!sq && c == '"') dq = !dq;
            if (!sq && !dq && c == '/' && (line.charAt(i+1)=='/'||line.charAt(i+1)=='*')) return i;
        }
        return -1;
    }
}
