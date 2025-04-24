package main.visitor;
import java.io.*;
import java.util.*;

public final class Converter {

    private static final int INDENT = 4;

    private Converter() {}

    public static String convert(String src) {
        String[]       lines = src.split("\n", -1);
        List<String>   out   = new ArrayList<>(lines.length);
        Deque<Integer> stack = new ArrayDeque<>();
        int lastCode = -1;

        boolean inBlockComment = false;

        for (String raw : lines) {
            String trimmedRaw = raw.trim();
            if (inBlockComment) {
                if (trimmedRaw.contains("*/"))
                    inBlockComment = false;
                out.add(raw);
                continue;
            }
            if (trimmedRaw.startsWith("/*")) {
                if (!trimmedRaw.contains("*/"))
                    inBlockComment = true;
                out.add(raw);
                continue;
            }
            if (trimmedRaw.startsWith("//") || trimmedRaw.isEmpty()) {
                out.add(raw);
                continue;
            }
            int commentPos   = firstCommentStart(raw);
            String commentPart = "";
            String codePart    = raw;
            if (commentPos >= 0) {
                commentPart = raw.substring(commentPos);
                codePart    = raw.substring(0, commentPos);
            }
            if (!commentPart.isEmpty() &&
                    commentPart.contains("/*") &&
                    !commentPart.contains("*/"))
            {
                inBlockComment = true;
            }

            String trimmed = codePart.trim();

            int indent   = countSpaces(raw) / INDENT;
            boolean isEnd  = trimmed.equals("end");
            boolean isHead = trimmed.endsWith(":");

            if (!isEnd) {
                while (!stack.isEmpty() && indent < stack.peek()) {
                    if (lastCode >= 0)
                        out.set(lastCode, out.get(lastCode) + "}");
                    stack.pop();
                }
            }

            StringBuilder sb = new StringBuilder();
            sb.append(" ".repeat(indent * INDENT));

            if (isHead) {
                String head = rtrim(trimmed.substring(0, trimmed.length() - 1));
                sb.append(head).append(" {");
                stack.push(indent + 1);
            }

            else if (isEnd) {
                if (!stack.isEmpty()) {
                    sb.append('}');
                    stack.pop();
                }
                sb.append("end;");
            }

            else {
                sb.append(trimmed);
                if (!trimmed.endsWith(";") &&
                        !trimmed.endsWith("{") &&
                        !trimmed.endsWith("}"))
                {
                    sb.append(";");
                }
            }

            if (!commentPart.isEmpty()) {
                if (!Character.isWhitespace(commentPart.charAt(0)))
                    sb.append(' ');
                sb.append(commentPart);
            }

            out.add(sb.toString());
            lastCode = out.size() - 1;
        }

        while (!stack.isEmpty() && lastCode >= 0) {
            out.set(lastCode, out.get(lastCode) + "}");
            stack.pop();
        }
        return String.join("\n", out);
    }

    private static int countSpaces(String s) {
        int n = 0; while (n < s.length() && s.charAt(n) == ' ') n++; return n;
    }
    private static String rtrim(String s) {
        int i = s.length(); while (i > 0 && Character.isWhitespace(s.charAt(i-1))) i--;
        return (i == s.length()) ? s : s.substring(0, i);
    }

    private static int firstCommentStart(String line) {
        boolean inS = false;
        boolean inD = false;
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);

            if (c == '\\' && (inS || inD)) {
                i++;
                continue;
            }

            if (!inD && c == '\'') inS = !inS;
            else if (!inS && c == '"') inD = !inD;

            if (inS || inD)
                continue;

            if (c == '/' && i + 1 < line.length()) {
                char nxt = line.charAt(i + 1);
                if (nxt == '/' || nxt == '*')
                    return i;
            }
        }
        return -1;
    }

}