package Day14_Array_Practice;

public class all_zeros_to_end {
   
    public static void main(String[] args) {
        int arr[]  = {1,0,3,2,4,0,6};
        Zeros(arr);
    }

    private static void Zeros(int[] arr) {
        int i=0;
        int j=arr.length-1;
        while (i<j) {
            if(arr[i]!=0){
                i++;
            }
            else if(arr[i]==0){
                int temp=arr[i];
                arr[i]= arr[j];
                arr[j]=temp;
                j--;
            }
        }
        for(int q=0;q<arr.length;q++){
            System.out.print(arr[q] +  " ");
        }
    }
    
}
