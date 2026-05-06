package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class DFSGraph {
    int vertices;
    ArrayList<ArrayList<Integer>> adj ; 

    DFSGraph(int v){
        vertices = v;
        adj = new ArrayList<>();

        for(int i=0;i<v;i++){
            adj.add(new ArrayList<>());
        }
    }

    void addEdge(int u ,int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    
   public void dfs(int node, boolean[] visited) {
    visited[node] = true;
    System.out.print(node + " "); // process node

    for (int neigh : adj.get(node)) {
        if (!visited[neigh]) {
            dfs(neigh, visited);
        }
    }
}
   public static void main(String[] args) {
    DFSGraph g = new DFSGraph(4);

    g.addEdge(0, 2);
    g.addEdge(0, 1);
    g.addEdge(0, 3);
    g.addEdge(2, 3);

    boolean[] visited = new boolean[g.vertices];

    g.dfs(0, visited); // start DFS from node 0
}
}
