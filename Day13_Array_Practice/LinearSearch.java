package Day13_Array_Practice;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[]={1,2,4,7,3};
        int target=0;
        Linear(arr,target);
    }

    private static void Linear(int[] arr, int target) {
        boolean found=false;
      for(int i=0;i<arr.length;i++){
        if(arr[i]==target){
            found=true;
        } 
      }
      if(found){
        System.out.println("Target Founded ");
      }
      else{
        System.out.println("Target not Found ");
      }
    }

}
