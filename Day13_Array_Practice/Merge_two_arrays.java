package Day13_Array_Practice;

public class Merge_two_arrays {

    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5};
        int arr2[] = {6,7,8};

        int size = arr.length + arr2.length;

        int arr3[] = new int[size];

        // copy first array
        for(int i = 0; i < arr.length; i++){
            arr3[i] = arr[i];
        }

        // copy second array
        for(int i = 0; i < arr2.length; i++){
            arr3[arr.length + i] = arr2[i];
        }

        // print merged array
        for(int n : arr3){
            System.out.print(n + " ");
        }
    }
}