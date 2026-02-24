package Day6_Prefix_Sum_Ques;

import java.util.HashMap;

public class Longest_Subarray_with_Sum_K {
    
    public static void main(String[] args) {
        int arr[] ={1, 2, 3, 1, 1, 1};
        int k =6; 
        LogestSubarrayLength(arr, k);

   }
    public static void LogestSubarrayLength(int arr[] , int  k ){
        HashMap <Integer, Integer> map = new HashMap<>();
        map.put(0,-1);
        int sum=0;
        int length = 0 ;
        for(int i=0;i<arr.length ;i++){
            sum=sum+arr[i];
            if (map.containsKey(sum-k)) {
                length = Math.max(length,i-map.get(sum-k));
            }
            map.put(sum,i);
        }
        System.out.println(length+ " max length");
    }
}