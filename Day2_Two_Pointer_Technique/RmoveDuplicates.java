package Day2_Two_Pointer_Technique;

public class RmoveDuplicates {
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,3};
        int j=0;
    for(int i=1; i<arr.length;i++){
        if(arr[i]!=arr[j]){
            j++;
            arr[j]=arr[i];
        }
    }
    for(int i=0;i<j+1;i++)
        {System.out.print(arr[i]+" ");
        }
        
    System.out.print("Length = "+ (j+1));
    }
        
}
