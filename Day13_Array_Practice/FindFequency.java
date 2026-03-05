package Day13_Array_Practice;

import java.util.Arrays;
import java.util.HashMap;

public class FindFequency {
    
    public static void main(String[] args) {
        int arr[] = {2,2,4,7,1,7,8,7,9};
        Frequency(arr);
    }

    private static void Frequency(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int n : arr){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        for(int key : map.keySet()){
         System.out.println(key + " : " + map.get(key) );   
        }
        
    }

    

    // private static void Frequency(int[] arr) {
    //     Arrays.sort(arr);
    //    for(int i=0;i<arr.length-1;i++){
    //     int count = 1;
    //     while(i < arr.length - 1 && arr[i] == arr[i+1]){
    //             count++;
    //             i++;
    //         }
    //         System.out.println(arr[i] + " : " +count);
    //    }
        
    // }
}
