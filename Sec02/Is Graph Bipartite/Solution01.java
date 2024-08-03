/**
 * BFS 풀이
 */

import java.util.*;

class Solution {

    private static final int NO_MARK = -1;
    private static final int A_MARK = 0;
    private static final int B_MARK = 1;

    public boolean isBipartite(int[][] graph) {
        int[] marked = new int[graph.length];
        Arrays.fill(marked, NO_MARK);
        Deque<Integer> queue = new ArrayDeque<>();

        for (int i = 0; i < graph.length; i++) {
            if (marked[i] != NO_MARK) {
                continue;
            }

            marked[i] = A_MARK;
            queue.offer(i);
            while (!queue.isEmpty()) {
                int current = queue.poll();

                for (int next : graph[current]) {
                    if (marked[next] == marked[current]) {
                        return false;
                    }
                    
                    if (marked[next] == NO_MARK) {
                        marked[next] = 1 - marked[current];
                        queue.offer(next);
                    }
                }
            }
        }

        return true;
    }
}
