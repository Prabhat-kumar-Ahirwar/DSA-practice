package Graph;

import java.util.ArrayList;

public class FirstGraph {

    public static void main(String[] args) {
        int v =5 ; 
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>(); 

         for (int i = 0; i < v; i++) {
            graph.add(new ArrayList<>());
        }
        graph.get(0).add(1);
        graph.get(0).add(2);
        graph.get(1).add(3);
        graph.get(2).add(4);

       for (int i = 0; i < v; i++) {
            System.out.print(i + " -> ");
            for (int neighbor : graph.get(i)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }
}