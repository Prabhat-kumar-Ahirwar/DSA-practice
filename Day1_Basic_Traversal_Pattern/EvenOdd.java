package Day1_Basic_Traversal_Pattern;

public class EvenOdd {
    public static void main(String[] args) {
        int arr[] = {2,4,3,8,10,11,0};
        System.out.println("Even "+ Even(arr));
        System.out.println("Odd "+ Odd(arr));
        
    }
    public static int Even(int arr[]){
        int count=0;
        for(int i =0 ; i<arr.length; i++){
            if(arr[i]%2 == 0){
                count++;
            }
        }
        return count;
    }
    
    public static int Odd(int arr[]){
        int count=0;
        for(int i =0 ; i<arr.length; i++){
            if(arr[i]%2 != 0){
                count++;
            }
        }
        return count;
    }
}

