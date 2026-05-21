import java.util.Arrays;

public class reverse2 {
    
    public static void rev(int arr[]){
    for (int i = 0; i < arr.length / 2; i++) {
            int t = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = t;
        }
        System.out.println("" + Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int arr[]={1,2,31};
        rev(arr);
    }
}
