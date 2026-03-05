package Day13_Array_Practice;

public class SecondSmallest {
    
    public static void main(String[] args) {
        int arr[] = {1,3,5,7};
        smallestSecond(arr);
    }

    private static void smallestSecond(int[] arr) {
     int min = Integer.MAX_VALUE;
     int secondmin = Integer.MAX_VALUE;
     for(int i=0;i<arr.length;i++){
        if(arr[i]<min){
            secondmin = min;
            min =arr[i];
        }
        else if(arr[i]<secondmin && arr[i]!=min){
            secondmin = arr[i];
        }
     }   
     System.out.println(secondmin + " : second smallest element in array");
    }
}

