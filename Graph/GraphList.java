package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class GraphList {

    int vertices;
    ArrayList<ArrayList<Integer>> adj;

    GraphList(int v){
        vertices = v;
        adj = new ArrayList<>();

        for(int i=0 ;i< v ;i++){
            adj.add(new ArrayList<>());
        }
        
    }

    //add edges
    void addedge(int u ,int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    //print

    void printfun(){
        for(int i=0;i<vertices;i++){
        System.out.print(i+" -> ");
        for(int neig : adj.get(i)){
            System.out.print(neig+" ");
        }
        System.out.println();
    }
    }
    //BFS Traversal
    void bfs(int start){
        Queue<Integer> q = new LinkedList<>();
        boolean[] vis = new boolean[vertices];

        q.add(start);
        vis[start] = true;

        while (!q.isEmpty()) {
            int u = q.poll();
            System.out.print(u + " ");
            for (int neigh : adj.get(u)) {
                if(!vis[neigh]){
                    vis[neigh] = true;
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
       g.bfs(0);
    }
}
