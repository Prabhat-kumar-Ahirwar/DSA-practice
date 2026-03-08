package Day16_Practice;

public class PeekElement {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,3,4,5};
        System.out.println(peek(arr));
    }

    private static int peek(int[] arr) {
        int n=arr.length;
        for(int i=1;i<n-1;i++){
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                return arr[i];
            }
        }
        return -1;
    }
    
}
