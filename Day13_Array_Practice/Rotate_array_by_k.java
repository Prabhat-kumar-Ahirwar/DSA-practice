package Day13_Array_Practice;

public class Rotate_array_by_k {

    public static void main(String[] args) {

        int arr[] ={5,1,2,3,4};
        int k = 3;

        rotate(arr,k);

    }

    private static void rotate(int[] arr, int k) {

        int n = arr.length;

        k = k % n;

        int temp[] = new int[n];

        for(int i = 0; i < n; i++){
            temp[(i + k) % n] = arr[i];
        }

        for(int i = 0; i < n; i++){
            arr[i] = temp[i];
        }

        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}