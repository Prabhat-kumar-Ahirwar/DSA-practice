package Graph;

import java.util.ArrayList;

public class BasicGraph {

    public static void main(String[] args) {
     int n=3;
     ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
     for(int i=0;i<=n;i++){
        adj.add(new ArrayList<>());
     }

     adj.get(1).add(2);
     adj.get(2).add(1);
      adj.get(1).add(3);
     adj.get(3).add(1);

     for(int i=1;i<=n;i++){
        System.out.println(i+" -> " + adj.get(i));
     }


    }
}