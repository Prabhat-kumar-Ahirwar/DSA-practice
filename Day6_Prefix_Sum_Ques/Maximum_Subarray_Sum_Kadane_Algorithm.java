package Day6_Prefix_Sum_Ques;

public class Maximum_Subarray_Sum_Kadane_Algorithm {
    public static void main(String[] args) {
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
        SubArray(arr);
    }   
    public static void SubArray(int arr[]){
        int max = arr[0];
        int currentsum=arr[0];

        for(int i=1;i<arr.length;i++){
            currentsum = Integer.max(arr[i], currentsum+arr[i]);
            max = Integer.max(max, currentsum);
        }
        System.out.println("maximum sum of subarray : " + max); 
    }
}
