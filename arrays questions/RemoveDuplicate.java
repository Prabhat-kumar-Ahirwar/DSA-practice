//  Find the element that appears only once in an array.
public class RemoveDuplicate {
    public static int remove(int arr[]){
        int j=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[i-1]){
                arr[j]=arr[i];
                j++;
            }
    }
            return j;
}

    public static void main(String[] args) {
        int arr[]={1,2,2,3,4,5,5};
        int size=remove(arr);
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
-
}
