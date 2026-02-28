package Day10_Array_Practice;

public class Rotate_array {
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n; // k>n
        int temp[] = new int[n];
        for(int i=0;i<n;i++){
            temp[(i+k)%n] = nums[i];
        }
        for (int i = 0; i < n; i++) {
            nums[i] = temp[i];
        }
        for(int i =0;i<nums.length;i++){
            System.out.print(nums[i] + " " );
        }
        }
        public static void main(String[] args) {
            int arr[] = {1,2,3,4,5,6,7};
            int k = 3;
            System.out.print("Before rotate : " );
            for(int i =0;i<arr.length;i++){
            System.out.print(arr[i] + " " );
        }
        System.out.println("");
        System.out.print("After Rotate :  " );
            rotate(arr,k); 
        }
    
}
