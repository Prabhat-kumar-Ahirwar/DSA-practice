package Day1_Basic_Traversal_Pattern;
public class Maximum {
    public static void main(String[] args) {
        int arr[] = {2,6,15,3,2};
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max =arr[i];
            }
        }
        System.out.print(" maximum element : " +max );
    }
}
