package Day15_Array_Practice;

public class Rotate_array_by_K_positions {

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int k=2;
        Rotate(arr,k);
    }

    private static void Rotate(int[] arr, int k) {
        int n=arr.length;
        k= k%n;  // if k>n
        int temp[] = new int[n];
        for(int i=0 ; i<n;i++){
           temp[(i+k)%n] = arr[i];
        }
        for (int i =0;i<arr.length;i++) {
            System.out.print(temp[i]+ " ");
        }
    }
    
}
