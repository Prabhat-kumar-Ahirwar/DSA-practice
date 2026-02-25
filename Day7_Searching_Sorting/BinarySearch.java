package Day7_Searching_Sorting;

public class BinarySearch {
    
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        int target = 9;
        if(!Searching(arr,target)){
            System.out.println("Target not found");
        }
    }

    public static boolean Searching(int arr[] ,int target){
        int n =arr.length;
        int low= 0;
        int high =n-1;
        boolean flag = false;
        while(low<=high){
             int mid= low+ (high - low )/2; 
            if(arr[mid]==target){
                System.out.println("Target found at index : " +mid);
                return true;
            }
            else if(target > arr[mid]){
                low = mid +1;
            }
            else
            {
                high = mid-1; 
            }
        }
        return false;
    }
}
