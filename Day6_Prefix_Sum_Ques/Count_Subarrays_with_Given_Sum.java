package Day6_Prefix_Sum_Ques;

import java.util.HashMap;

public class Count_Subarrays_with_Given_Sum {
    public static void main(String[] args) {
       int arr[] = {2, 4, 7, 3, 6};
        int k = 6;
        CountSubarray(arr, k);
    }
    public static void CountSubarray(int arr[] , int k ){
        
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int count=0;
        int sum=0;
        for(int n: arr){
            sum = sum+n;
            if(map.containsKey(sum-k)){
                count = count + map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        System.out.println(count);



    }
}
