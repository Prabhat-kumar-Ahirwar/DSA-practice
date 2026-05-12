package Graph;

import java.util.ArrayList;

public class UnDirected {

    public static void display(int v,ArrayList<ArrayList<Integer>> graph){
         // print graph
        for(int i = 0; i < v; i++) {

            System.out.print(i + " -> ");

            for(int neighbor : graph.get(i)) {
                System.out.print(neighbor + " ");
            }

            System.out.println();
        }
    }
    public static void main(String[] args) {

        int v = 4;

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for(int i = 0; i < v; i++) {
            graph.add(new ArrayList<>());
        }

        // add edges
        graph.get(0).add(1);
        graph.get(1).add(0);

        graph.get(0).add(2);
        graph.get(2).add(0);

        graph.get(1).add(3);
        graph.get(3).add(1);

        graph.get(2).add(3);
        graph.get(3).add(2);
        System.out.println("before : ");
display(v,graph);
        // REMOVE EDGE 0-1
        graph.get(0).remove(Integer.valueOf(1));
        graph.get(1).remove(Integer.valueOf(0));
        System.out.println("After : ");
        display(v,graph);
       
    }
}