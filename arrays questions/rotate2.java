public class rotate2 {

    // Function to reverse a portion of the array
    public static void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            // Swap arr[start] and arr[end]
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Function to rotate the array by d positions
    public static void rotateArray(int[] arr, int d) {
        int n = arr.length;

        d = d % n;  // In case d >= n

        // Step 1: Reverse the first part (0 to n-d-1)
        reverseArray(arr, 0, n - d - 1);

        // Step 2: Reverse the second part (n-d to n-1)
        reverseArray(arr, n - d, n - 1);

        // Step 3: Reverse the entire array (0 to n-1)
        reverseArray(arr, 0, n - 1);
    }

    // Function to print the array
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int d = 3; // Number of positions to rotate

        System.out.print("Original Array: ");
        printArray(arr);

        rotateArray(arr, d);

        System.out.print("Array after rotation: ");
        printArray(arr);
    }
}