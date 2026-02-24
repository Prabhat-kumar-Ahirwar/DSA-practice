package Day5_Array_Three_pointer;

public class Maximum_Sum_of_Distinct_Subarrays_With_Length_K {
 
    public static void main(String[] args) {
        
    }
    public static void MaxSum(int arr[],int target){
        int n=arr.length;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum=sum+arr[j];
                if(sum >=target){
                    max = Integer.max(max, j-i+1);
                    break;
                }
            }
        }
        System.out.println(max);
    }
}
