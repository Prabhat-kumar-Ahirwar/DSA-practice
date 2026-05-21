
public class prime {
    
   public static boolean isprime(int n){
        for(int i=2;i<=(int)Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
            
        }return true;
    }
     public static void printPrimeNumbers(int[] arr) {
        for (int num : arr) {
            if (isprime(num)) {
                System.out.print(num + " ");
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={2,4,7,6,8,9,3};
        System.out.print("Prime Number in array are: " );
         printPrimeNumbers(arr);
    }
}
