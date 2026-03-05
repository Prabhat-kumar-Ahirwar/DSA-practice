package Day13_Array_Practice;

import java.util.HashMap;

public class Find_duplicate_elements {

    public static void main(String[] args) {

        int arr[] ={1,2,3,4};
        Duplicate(arr);

    }

    private static void Duplicate(int[] arr) {

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int n : arr){
            map.put(n, map.getOrDefault(n,0) + 1);
        }

        boolean found = false;

        for(int k : map.keySet()){
            if(map.get(k) > 1){
                found = true;
                break;
            }
        }

        if(found){
            System.out.println("Duplicate exists");
        }else{
            System.out.println("No Duplicate exists");
        }
    }
}