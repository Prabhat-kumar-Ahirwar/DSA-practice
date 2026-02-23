package Day5_Array_Three_pointer;

public class Smallest_Subarray_with_Sum_Equal_Target {
    public static void main(String[] args) {
        int arr[]= {2,3,1,2,4};
        Smallest(arr, 7);
    }

    public static void Smallest(int arr[] , int target){
        int n =arr.length;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            
            int sum=0;
            for(int j=i;j<n;j++){
                sum = sum+arr[j];
                if(sum>=target){
                    min = Integer.min(min,j-i+1);
                    break;
                }
            }
        }
        System.out.println( min);
    }
}
