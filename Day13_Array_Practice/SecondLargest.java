package Day13_Array_Practice;

public class SecondLargest {
    
    public static void main(String[] args) {
        int arr[] = {1,9,8,3,8};
        Second(arr);
    }

    private static void Second(int[] arr) {
       int max=0;
       int Secondmax=0;
       for(int i=0;i<arr.length;i++){
        if(arr[i]>max){
            Secondmax=max;
            max = arr[i];
        }
        else if(arr[i]>Secondmax && arr[i]!=max){
            Secondmax = arr[i];
        }
       }
       System.out.println(Secondmax + " : is second largest element ");
    }
}
