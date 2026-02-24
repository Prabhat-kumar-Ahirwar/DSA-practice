package Day6_Prefix_Sum_Ques;

import java.util.HashMap;

//Find number of subarrays whose sum equals k.
public class Subarray_Sum_Equals_K {
    public static void main(String[] args) {
        int arr[] = {2,4,7,3,6};
        int k = 6;
        Sum(arr, k);
    }
    public static void Sum(int arr[] , int k){
        HashMap<Integer , Integer> map= new HashMap<>();
        map.put(0, 1);  //  means prefix sum 0 occurred once
        int sum=0;
        int count=0;

        for(int n : arr){
            sum = sum + n;
            if(map.containsKey(sum-k)){
                count+= map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0) +1);
        }
        System.out.println(count); 
    }
}
