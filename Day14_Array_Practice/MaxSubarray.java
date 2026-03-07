package Day14_Array_Practice;

import java.util.Deque;
import java.util.LinkedList;

public class MaxSubarray {

    public static void main(String[] args) {
        int arr[] = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        maxSubarray(arr, k);
    }
    private static void maxSubarray(int[] arr, int k) {
          Deque<Integer> dq = new LinkedList<>();
        for(int i = 0; i < arr.length; i++) {
            // Remove indices that are out of current window
            if(!dq.isEmpty() && dq.peekFirst() <= i - k)
                dq.pollFirst();

            // Remove all elements smaller than current from the back
            while(!dq.isEmpty() && arr[dq.peekLast()] < arr[i])
                dq.pollLast();

            dq.offerLast(i); // add current index

            // Window reached size k
            if(i >= k - 1)
                System.out.print(arr[dq.peekFirst()] + " ");
        }
    }

   
}



/*
 static void maxSubarray(int[] arr, int k){

        for(int i = 0; i <= arr.length - k; i++){

            int max = arr[i];

            for(int j = i; j < i + k; j++){
                if(arr[j] > max){
                    max = arr[j];
                }
            }

            System.out.print(max + " ");
        }
    } */