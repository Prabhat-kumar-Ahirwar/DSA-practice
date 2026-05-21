public class Insert {
      public static void binarySearch(int arr[], int low, int high, int data){
        int mid=0;
        while(low <= high){
            mid = (low+high)/2;
            
            if(data < arr[mid]){
                high = mid-1;
            }
            else{
                low = mid+1;
            }

        }
        System.out.println(data+" is to be inserted at "+mid+"th index");
        
        
    }
    public static void main(String[] args) {
        int arr[]={1, 1, 1, 1, 1, 1, 2, 2, 3, 4, 6, 7, 9};
        int insert_data=5;
        int n=arr.length;
        binarySearch(arr, 0, n-1, insert_data);
    }
}
