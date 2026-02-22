package Day4_Two_Pointer_Technique;

public class MaxSubarray {
    
    public static void main(String[] args) {
        int ar[] = {3,5,1,2,4,6};
        subarraymax(ar, 2);
    }
    public static void subarraymax(int arr[],int k ){
        int max=0;
        int current = 0;
        int n=arr.length;
        for(int i=0;i<k;i++){
            current = current + arr[i];
        }
        for(int i=1; i<=n-k;i++){
            current= current-arr[i-1]+arr[i+k-1];
        }
        if(current>max){
            max=current;
        }
        System.out.println(max+" Maximum sum of all subarrays of "+ k+" size");
    }
}
