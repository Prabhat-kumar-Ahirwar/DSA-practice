public class sumavg {
    public static int sum(int arr[]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        return sum;
    }
    public static int avg(int arr[]){
        int sum=sum(arr);
        int avg=sum/arr.length;
        return avg;
    }
   
    public static void main(String[] args) {
        int arr[]={1,1,1,1,1};
        System.out.println("result : "+sum(arr));
        System.out.println("result : "+avg(arr));
    }
}
