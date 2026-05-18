import java.util.Arrays;

public class InsertionSort{

    // Method to display the array
    public static void display(int[] arr, int n) {
        System.out.println(Arrays.toString(arr));
        System.out.println();
    }

    // Method to perform insertion sort
    public static void insertionSort(int[] arr, int n) {
        int card, j;
        for (int i = 1; i < n; i++) {
            card = arr[i];
            j = i - 1;
            while (j >= 0 && arr[j] > card) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = card;
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 3, 5};
        // To find the number of elements present in the array
        int n = arr.length;
        
        System.out.println("Before sorting....");
        display(arr, n);
        
        insertionSort(arr, n);
        
        System.out.println("\nAfter sorting....");
        display(arr, n);

        
    }
}
