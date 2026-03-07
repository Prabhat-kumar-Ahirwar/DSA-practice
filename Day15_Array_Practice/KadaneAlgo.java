package Day15_Array_Practice;

public class KadaneAlgo {

    public static void main(String[] args) {
        int arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        MaxSubarray(arr);
    }

    private static void MaxSubarray(int[] arr) {
      int maxSum = arr[0];
      int currentSum= 0 ;
      for(int i=0;i<arr.length ; i++){
        currentSum = currentSum +arr[i];
        if(currentSum>maxSum){
            maxSum=currentSum;
        }
        if (currentSum<0) {
            currentSum =0 ;
        }
      }
      System.out.println(maxSum);
    }
}