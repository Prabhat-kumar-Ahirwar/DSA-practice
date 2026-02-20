package Day1_Basic_Traversal_Pattern;
public class Minimum {
    public static void main(String[] args) {
        int min = Integer.MAX_VALUE;
        int arr[] = {2,9,3,0,8,34};
        for(int i =0 ;i<arr.length ; i++ ){
            if (arr[i]<min) {
                min = arr[i];
            }
        }
        System.out.print("Minimum element : "+ min);
    }
}
