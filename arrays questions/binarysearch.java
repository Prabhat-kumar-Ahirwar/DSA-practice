public class binarysearch {
   public static void binarySearch(int arr[], int low, int high, int target){
    int index=-1;
        while(low <= high){
            int mid = (low+high)/2;
            if(arr[mid] == target){

                // // Target last Occurance 
                // index=mid;
                // low=mid+1;

                //  Target first Occurance
                // index=mid;
                // high=mid-1;
                
                System.out.println(target + " found at index " + mid);
                return;
            }
            else if(target < arr[mid]){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        if(index!=-1){
            System.out.println("data found in index "+index);
        }
        else{
            
        System.out.println("Data is not found");
        }
    }


    public static void main(String[] args) {
        int arr[]={2,4,6,8,8,10};
        int n=arr.length;

  
        binarySearch(arr, 0, n-1, 8);
    }
}
