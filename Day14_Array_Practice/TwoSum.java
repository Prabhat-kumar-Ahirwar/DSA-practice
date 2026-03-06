package Day14_Array_Practice;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int arr[] = {1,2,3,6,8};
        int targetSum = 5;

        SumPair(arr, targetSum);
    }

    private static void SumPair(int[] arr, int targetSum) {
       int i = 0;
        int j = arr.length - 1;

        while (i < j) {

            int sum = arr[i] + arr[j];

            if(sum == targetSum){
                System.out.println(arr[i] + " + " + arr[j] + " = " + targetSum);
                return;
            }
            else if(sum > targetSum){
                j--;
            }
            else{
                i++;
            }
        }

        System.out.println("No pair found");
    }
    

   
}


/*
   
         private static int[] SumPair(int[] arr , int targetSum) {
        HashMap<Integer , Integer> map =new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int toFind = targetSum - arr[i];
            if(map.containsKey(toFind)){
                return new int[]  {i,map.get(toFind)};
            }
            map.put(arr[i],i);
        }
        return null;
       
    }*/