package main.visitor;

import java.util.*;

public final class CtoCPYConvertor {

    private static final int SPACE_UNIT = 4;

    private CtoCPYConvertor() {}

    public static String transform(String input) {
        String[] rawLines = input.split("\n", -1);
        List<String> resultLines = new ArrayList<>(rawLines.length);
        Deque<Integer> indentStack = new ArrayDeque<>();
        boolean insideBlockComment = false;
        int lastCodeLine = -1;

        for (String currentLine : rawLines) {
            String cleanLine = currentLine.trim();

            if (insideBlockComment) {
                if (cleanLine.contains("*/")) insideBlockComment = false;
                resultLines.add(currentLine);
                continue;
            }

            if (cleanLine.startsWith("/*")) {
                if (!cleanLine.contains("*/")) insideBlockComment = true;
                resultLines.add(currentLine);
                continue;
            }

            if (cleanLine.isEmpty() || cleanLine.startsWith("//")) {
                resultLines.add(currentLine);
                continue;
            }

            int commentIndex = locateComment(currentLine);
            String codeSegment = currentLine;
            String commentSegment = "";

            if (commentIndex >= 0) {
                commentSegment = currentLine.substring(commentIndex);
                codeSegment = currentLine.substring(0, commentIndex);
            }

            if (!commentSegment.isEmpty() && commentSegment.contains("/*") && !commentSegment.contains("*/")) {
                insideBlockComment = true;
            }

            String trimmedCode = codeSegment.trim();
            int currentIndent = countLeadingSpaces(currentLine) / SPACE_UNIT;
            boolean endsWithEnd = trimmedCode.equals("end");
            boolean hasBlockStart = trimmedCode.endsWith(":");

            if (!endsWithEnd) {
                while (!indentStack.isEmpty() && currentIndent < indentStack.peek()) {
                    if (lastCodeLine >= 0) {
                        String updated = resultLines.get(lastCodeLine) + "}";
                        resultLines.set(lastCodeLine, updated);
                    }
                    indentStack.pop();
                }
            }

            StringBuilder lineBuilder = new StringBuilder(" ".repeat(currentIndent * SPACE_UNIT));

            if (hasBlockStart) {
                String blockStart = removeTrailingSpaces(trimmedCode.substring(0, trimmedCode.length() - 1));
                lineBuilder.append(blockStart).append(" {");
                indentStack.push(currentIndent + 1);
            } else if (endsWithEnd) {
                if (!indentStack.isEmpty()) {
                    lineBuilder.append("}");
                    indentStack.pop();
                }
                lineBuilder.append("end;");
            } else {
                lineBuilder.append(trimmedCode);
                if (!trimmedCode.endsWith(";") && !trimmedCode.endsWith("{") && !trimmedCode.endsWith("}")) {
                    lineBuilder.append(";");
                }
            }

            if (!commentSegment.isEmpty()) {
                if (!Character.isWhitespace(commentSegment.charAt(0))) {
                    lineBuilder.append(" ");
                }
                lineBuilder.append(commentSegment);
            }

            resultLines.add(lineBuilder.toString());
            lastCodeLine = resultLines.size() - 1;
        }

        while (!indentStack.isEmpty() && lastCodeLine >= 0) {
            String closed = resultLines.get(lastCodeLine) + "}";
            resultLines.set(lastCodeLine, closed);
            indentStack.pop();
        }

        return String.join("\n", resultLines);
    }

    private static int countLeadingSpaces(String line) {
        int index = 0;
        while (index < line.length() && line.charAt(index) == ' ') {
            index++;
        }
        return index;
    }

    private static String removeTrailingSpaces(String input) {
        int position = input.length();
        while (position > 0 && Character.isWhitespace(input.charAt(position - 1))) {
            position--;
        }
        return input.substring(0, position);
    }

    private static int locateComment(String codeLine) {
        boolean singleQuoteOpen = false;
        boolean doubleQuoteOpen = false;

        for (int i = 0; i < codeLine.length(); i++) {
            char ch = codeLine.charAt(i);

            if (ch == '\\' && (singleQuoteOpen || doubleQuoteOpen)) {
                i++; // Skip escaped char
                continue;
            }

            if (!doubleQuoteOpen && ch == '\'') {
                singleQuoteOpen = !singleQuoteOpen;
            } else if (!singleQuoteOpen && ch == '"') {
                doubleQuoteOpen = !doubleQuoteOpen;
            }

            if (singleQuoteOpen || doubleQuoteOpen) continue;

            if (ch == '/' && i + 1 < codeLine.length()) {
                char nextChar = codeLine.charAt(i + 1);
                if (nextChar == '/' || nextChar == '*') return i;
            }
        }
        return -1;
    }
}
