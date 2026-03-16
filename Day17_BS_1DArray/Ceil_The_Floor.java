package Day17_BS_1DArray;

import java.util.Arrays;

public class Ceil_The_Floor {
      public static void main(String[] args) {

        int arr[]  = {12,3,8,21,5,2};
        int x = 21;

        Arrays.sort(arr);

        int floor = findFloor(arr, x);
        int ceil = findCeil(arr, x);

        System.out.println("Sorted Array: " + Arrays.toString(arr));
        System.out.println("Floor of " + x + " = " + floor);
        System.out.println("Ceil of " + x + " = " + ceil);
    }

    private static int findCeil(int[] arr, int x) {
        int left = 0, right = arr.length - 1;
        int ceil = -1; 
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] >= x) {
                ceil = arr[mid];
                right = mid - 1;
            } else {
                left = mid + 1;             }
        }
        return ceil;
    }

    private static int findFloor(int[] arr, int x) {
        int left = 0, right = arr.length - 1;
        int floor = -1; 
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] <= x) {
                floor = arr[mid]; 
                left = mid + 1;   
            } else {
                right = mid - 1;               
                
            }
            
        }
        return floor;
    }
}
