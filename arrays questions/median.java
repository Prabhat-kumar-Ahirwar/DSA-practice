public class median {
    public static void med(int arr[]){
        int n=arr.length;
       if(n%2==0){
        int len=arr.length-1;
        int val1=len/2;
        int val2=val1+1;
        int sum=arr[val1]+arr[val2];
        int av=sum/2;
        System.out.println("Median : "+ av);
       }
       else{
        int len=arr.length-1;
        int val3=(len+1)/2;
        int avg=arr[val3];
        System.out.println("Median : "+avg);
       }
    }
    public static void main(String[] args) {
        int arr[]={10, 12, 14, 16, 18, 20};
        med(arr);
    }
}
