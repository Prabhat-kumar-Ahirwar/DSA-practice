public class plus_one {
    public static void sumarray(int arr[]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum*10 +arr[i];
        }
        System.out.println(sum+1);
    }
    public static void main(String[] args) {
        int arr[]={9,9,9};
        System.out.print("SUM OF ARRAY + 1 = ");
        sumarray(arr);
    }
}