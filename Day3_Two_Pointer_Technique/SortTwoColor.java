package Day3_Two_Pointer_Technique;

public class SortTwoColor {
    public static void main(String[] args) {
        int arr[] ={1,1,0,0};
        sortcolor(arr);
    }
    public static void sortcolor(int arr[]){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            if(arr[i]==0){
                i++;
            }
            else if(arr[j]==1){
                j--;
            }
            else{
                int temp = arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                j--;
                i++;
            }       
        }
        for(int q=0;q<arr.length;q++){
            System.out.println(arr[q]+" ");
        }
    }
    
}
