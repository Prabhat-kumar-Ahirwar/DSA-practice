package Day5_Array_Three_pointer;

public class Dutch_National_Flag {
    
    public static void main(String[] args) {
      int arr[]={2,1,0,2,1,1,0,0,1};
      sortA(arr);

    }
    public static void sortA(int arr[]){
        int i=0;
        int j=arr.length-1;
        int k=0;
        while(k<=j){
            if(arr[k]==2){
                int temp = arr[j];
                arr[j] = arr[k];
                arr[k] = temp;
                j--;
            }
            else if(arr[k]==0){
                int temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
                k++;
                i++;
            }
            else if(arr[k]==1){
                k++;
            }
        }
        for(int q=0;q<arr.length;q++){
            System.out.print(arr[q]+",");
        }
    }
}
