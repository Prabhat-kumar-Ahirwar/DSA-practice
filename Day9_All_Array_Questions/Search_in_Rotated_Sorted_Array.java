package Day9_All_Array_Questions;

public class Search_in_Rotated_Sorted_Array {
    

    public static void main(String[] args) {
        int arr[]  = {4,5,6,7,0,1,2};
        int target = 6;
        System.out.println("index : "+ Search(arr, target));
    }
    public static int Search(int arr[] , int target){
        int low = 0 ;
        int high = arr.length;
       
        while (low <= high){
             int mid = low + (high - low)/2;
            if(arr[low] == arr[mid]){
                return mid;
            }

            else if (arr[low]<= arr[mid]) {
                if(target >= arr[low] && target <= arr[mid] ){
                    high = mid -1;
                }
                else{
                    low = mid + 1;
                }
            }
           else {

                if (target > arr[mid] && target <= arr[high])
                    low = mid + 1;
                else
                    high = mid - 1;
            }
        }
        return -1;
    }
}
