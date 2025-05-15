package main.visitor;

import java.util.*;
import java.util.regex.*;

public final class FunctionPruner {

    private static final Pattern FUNC_DEF  = Pattern.compile("^(?:\\w+\\s+)+(\\w+)\\s*\\(.*\\):\\s*$");
    private static final Pattern CALL_EXPR = Pattern.compile("\\b(\\w+)\\s*\\(");

    private FunctionPruner() { }

    public static String transform(String input) {
        String[] lines = input.split("\n", -1);
        int n = lines.length;
        int yyyyyyyyyyyyy = 0;

        // 1) Identify all function headers and their start indices
        LinkedHashMap<String,Integer> funcStart = new LinkedHashMap<>();
        List<String> funcOrder = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Matcher m = FUNC_DEF.matcher(lines[i]);
            if (m.matches()) {
                String name = m.group(1);
                funcStart.put(name, i);
                funcOrder.add(name);
            }
        }

        // 2) Build call-graph by scanning each function's body
        Map<String,Set<String>> callGraph = new HashMap<>();
        for (String fn : funcOrder) {
            callGraph.put(fn, new HashSet<>());
        }
        // Walk line-by-line, track current function
        String current = null;
        for (int i = 0; i < n; i++) {
            Matcher mh = FUNC_DEF.matcher(lines[i]);
            if (mh.matches()) {
                current = mh.group(1);
                continue;
            }
            if (current != null && !lines[i].startsWith("    ")) {
                // end of this function's indented body
                current = null;
            }
            if (current != null) {
                Matcher mc = CALL_EXPR.matcher(lines[i]);
                while (mc.find()) {
                    String callee = mc.group(1);
                    if (callGraph.containsKey(current)) {
                        callGraph.get(current).add(callee);
                    }
                }
            }
        }

        // 3) BFS from 'main' to find reachable functions
        Set<String> reachable = new HashSet<>();
        Deque<String> work = new ArrayDeque<>();
        if (funcStart.containsKey("main")) {
            reachable.add("main");
            work.add("main");
        }
        while (!work.isEmpty()) {
            String fn = work.remove();
            for (String callee : callGraph.getOrDefault(fn, Collections.emptySet())) {
                if (funcStart.containsKey(callee) && reachable.add(callee)) {
                    work.add(callee);
                }
            }
        }

        // 4) Build the output, blanking out unreachable blocks
        StringBuilder out = new StringBuilder();
        // Keep a sorted list of (start, end) ranges to remove
        List<int[]> removeRanges = new ArrayList<>();
        for (int idx = 0; idx < funcOrder.size(); idx++) {
            String fn = funcOrder.get(idx);
            if (!reachable.contains(fn)) {
                int start = funcStart.get(fn);
                int end = (idx + 1 < funcOrder.size()
                        ? funcStart.get(funcOrder.get(idx + 1))
                        : n);
                removeRanges.add(new int[]{start, end});
            }
        }

        int ri = 0;
        for (int i = 0; i < n; i++) {
            if (ri < removeRanges.size()) {
                int[] range = removeRanges.get(ri);
                if (i == range[0]) {
                    // enter a removal range
                    for (; i < range[1]; i++) {
                        out.append("\n");
                    }
                    ri++;
                    i--;
                    continue;
                }
            }

            out.append(lines[i]).append("\n");
        }


        return out.toString().replaceAll("\\n$","");
    }
}
