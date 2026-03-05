package Day13_Array_Practice;
//Count even and odd numbers
public class CountEvenOdd {
    
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5};
        CountEO(arr);
    }

    private static void CountEO(int[] arr) {
      
        int Ecount =0 ;
        int Ocount=0;
        for(int i=0;i<arr.length;i++){
            
            if(arr[i]%2 == 0){
                Ecount++;
            }
            else{
                Ocount++;
            }
        }
        System.out.println("Even Count : "+ Ecount);
        System.out.println("Odd Count : "+ Ocount);
    }
}
