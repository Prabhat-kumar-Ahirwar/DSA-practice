package Day14_Array_Practice;

public class subarray_with_given_sum {
    
    public static void main(String[] args) {
        int arr[] = {1,4,20,3,10,5};
        int target=33;
        Subarray(arr,target);
    }

    private static void Subarray(int[] arr, int target) {
     int i=0;
     int CurrentSum=0;
     for(int j=0;j<arr.length;j++){
        CurrentSum = CurrentSum + arr[j];
        while (CurrentSum>target) {
            CurrentSum = CurrentSum - arr[i];
            i++;
        }
        if(CurrentSum == target){
            System.out.println("index : " +i + " to " + j);
           return;
        }
     }
     System.out.println("Not Found");

    }

}
