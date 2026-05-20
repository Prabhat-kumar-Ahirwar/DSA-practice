package Graph;
import java.util.*;

public class NumberOfPro {
    



    // DFS Function
    static void dfs(int node, int[][] graph, boolean[] visited) {

        visited[node] = true;

        for (int neighbor = 0; neighbor < graph.length; neighbor++) {

            // If connected and not visited
            if (graph[node][neighbor] == 1 && !visited[neighbor]) {
                dfs(neighbor, graph, visited);
            }
        }
    }

    // Function to count provinces
    static int findCircleNum(int[][] graph) {

        int n = graph.length;

        boolean[] visited = new boolean[n];

        int provinces = 0;

        for (int i = 0; i < n; i++) {

            if (!visited[i]) {

                dfs(i, graph, visited);

                provinces++;
            }
        }

        return provinces;
    }

    public static void main(String[] args) {

        int[][] isConnected = {
                {1, 1, 0},
                {1, 1, 0},
                {0, 0, 1}
        };

        int ans = findCircleNum(isConnected);

        System.out.println("Number of Provinces: " + ans);
    }
}

