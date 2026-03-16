package Day17_BS_1DArray;
// Given a sorted array arr[] and an integer x, find the index (0-based) of
// the largest element in arr[] that is less than or equal to x. 
// This element is called the floor of x.
//  If such an element does not exist, return -1.
public class Floor_in_a_Sorted_Array {
    public static void main(String[] args) {
        int arr[]= {1, 2, 8, 10, 10, 12, 19};
        int x=5;
        System.out.println("index : "+FindFloor(arr,x));

    }

    private static int FindFloor(int[] arr, int x) {
        int floorIndex = -1;

        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
                if (arr[mid] <= x) {
                floorIndex = mid; 
                left = mid + 1;   
            } else {
                
                right = mid - 1;
            }
        }
        return floorIndex;
    }
    
}
