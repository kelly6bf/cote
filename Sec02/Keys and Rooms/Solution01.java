/**
 * 풀이 01 : bfs
 */

import java.util.*;

public class Solution01 {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] visited = bfs(rooms);
        return checkAllVisited(visited);
    }

    private boolean[] bfs(List<List<Integer>> rooms) {
        boolean[] visited = new boolean[rooms.size()];
        Deque<Integer> queue = new ArrayDeque<>();
        queue.offer(0);
        visited[0] = true;

        while (!queue.isEmpty()) {
            Integer current = queue.poll();
            for (Integer vertex : rooms.get(current)) {
                if (visited[vertex]) {
                    continue;
                }

                queue.offer(vertex);
                visited[vertex] = true;
            }
        }

        return visited;
    }

    private boolean checkAllVisited(boolean[] visited) {
        for (boolean visit : visited) {
            if (!visit) {
                return false;
            }
        }

        return true;
    }
}
