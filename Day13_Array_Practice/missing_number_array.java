package Day13_Array_Practice;

public class missing_number_array {
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5,7};
        FindMissing(arr);
    }

    private static void FindMissing(int[] arr) {
        int n=arr.length+1;
        int total = n*(n+1)/2;
       int sum=0;
       for(int i=0;i<n-1;i++){
        sum=sum+arr[i];
       }
       int miss = total - sum; 
       System.out.println(miss + " is missing number");
    }

    
}