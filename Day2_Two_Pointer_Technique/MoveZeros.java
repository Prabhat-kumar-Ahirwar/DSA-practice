package Day2_Two_Pointer_Technique;

public class MoveZeros {
    
    public static void main(String[] args) {
        int arr[]={0,1,0,3,12};
        MoveZerosAtEnd(arr);
    }
    public static void MoveZerosAtEnd(int arr[]){
       int j=0;
       for(int i=0;i<arr.length;i++){
        if(arr[i]!=0){
            int temp= arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            j++;
        }
       }
         for(int p =0 ;p<arr.length; p++){
        System.out.print(arr[p]+",");
    }
    }
   
}
