public class rotate{
    public static void display(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
    }
    public static void rotate_array(int arr[],int d){
        
        for(int i=0;i<d;i++){
           int one = arr[0];
            for (int j = 0; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[arr.length - 1] = one;
        }
        
    }
    public static void main(String[] args) {
        int arr[]={1, 2, 3,4,5};
        int d=2;
        display(arr);
        rotate_array(arr,d);
        display(arr);
    }
}
