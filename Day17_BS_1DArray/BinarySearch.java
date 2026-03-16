package  Day17_BS_1DArray;

public class BinarySearch{

    public static void main(String[] args) {
        int arr [] = {2};
        int target = 5;
        System.out.println("Index : "+searchX(arr,target));
    }

    private static int searchX(int[] arr, int target) {
       int low = 0 ;
       int high= arr.length-1;
       while (low<=high) {
        int mid = low + (high-low )/2;
        if(target == arr[mid]){
            return mid;
        }
        else if(target < arr[mid]){
            high = mid-1;
        }
        else if(target> arr[mid]){
            low = mid +1;
        }
       }
       return -1;
    }
}