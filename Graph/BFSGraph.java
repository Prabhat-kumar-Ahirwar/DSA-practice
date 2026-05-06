package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFSGraph {

    int vertices;
    ArrayList<ArrayList<Integer>> adj ; 

    BFSGraph(int v){
        vertices = v;
        adj = new ArrayList<>();

        for(int i=0;i<v;i++){
            adj.add(new ArrayList<>());
        }
    }

    void addEdge(int u , int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    
    void bfsTraversal(int start){
        int v =vertices;
        Queue<Integer> q = new LinkedList<>();
        boolean visted[] = new boolean[v]; 

        visted[start] = true;
        q.add(start);

        while (!q.isEmpty()) {
            
            int u = q.poll();
            System.out.println(u + " ");
            for(int neigh : adj.get(u)){
                if(!visted[neigh]){
                    visted[neigh] = true;
                    q.add(neigh);
                }
            }

        }
    }
    public static void main(String[] args) {
        GraphList g = new GraphList(4);
        g.addedge(0,2);
        g.addedge(0,1);
        g.addedge(0,3);
        g.addedge(2,3);
       g.bfs(1);
    }
}
