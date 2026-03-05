package Day13_Array_Practice;
// Check if an array is sorted
public class SortedOrNot {
    
    public static void main(String[] args) {
    int arr[] = {1,3,6,8};
    if(IsSorted(arr)){
        System.out.println("Sorted");
    }
    else{
        System.out.println("Not Sorted");
    }
        
    }

    private static boolean IsSorted(int[] arr) {
      for(int i=0;i<arr.length-1 ;i++){
        if(arr[i]>arr[i+1]){
            return false;
        }
      }
        return true;
    }
    
}
