/**
 * 풀이 02 : dfs
 */

import java.util.*;

public class Solution02 {

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] visited = new boolean[rooms.size()];
        dfs(rooms, visited, 0);

        return checkAllVisited(visited);
    }

    private void dfs(List<List<Integer>> rooms, boolean[] visited, Integer current) {
        visited[current] = true;

        List<Integer> edges = rooms.get(current);
        for (Integer next : edges) {
            if (visited[next]) {
                continue;
            }
            
            dfs(rooms, visited, next);
        }
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
