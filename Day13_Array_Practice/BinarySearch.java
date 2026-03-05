package Day13_Array_Practice;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] ={1,3,6,8,9,12};
        int target = 10;
        Search(arr,target);
    }

    private static void Search(int[] arr, int target) {
       int low=0;
       int high=arr.length-1;
       while (low<=high) {
        int mid = low +(high-low)/2;
        if(target == arr[mid]){
            System.out.println("Target Found at index : "+mid );
            return;
        }
        else if(target<arr[mid]){
            high = mid-1;
        }
        else if(target>arr[mid]){
            low=mid+1;
        }
       }
        System.out.println("Target not found");
    }
    
}
