package Day13_Array_Practice;

import javax.naming.NameClassPair;

public class Count_positive_negative_numbers {
    public static void main(String[] args) {
        int arr[] = {-2 , 5,2,-7,4};
        CountPN(arr);
    }

    private static void CountPN(int[] arr) {
        int Pcount=0;
        int Ncount=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=0){
                Pcount++;
            }
            else{
                Ncount++;
            }
        }
        System.out.println("Positive count : " + Pcount);
        System.out.println("Negative count : " + Ncount);
    }
    
}
