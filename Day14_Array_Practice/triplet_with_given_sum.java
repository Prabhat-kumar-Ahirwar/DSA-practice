package Day14_Array_Practice;

public class triplet_with_given_sum {
    
    public static void main(String[] args) {
        int arr[] = {1,4,5,8,11,15};
        int targetSum = 13;
        Tsum(arr,targetSum);
        
    }

    private static void Tsum(int[] arr, int targetSum) {
       for(int i=0;i<arr.length-2;i++){
        int left=i+1;
        int right = arr.length-1;
        while (left<right) {
            int sum = arr[i]+arr[left]+arr[right];
            if(sum==targetSum){
                System.out.println(arr[i]+ " " + arr[left]+ " " + arr[right]+ " ");
                break;
            }
            else if(sum>targetSum){
                right--;
            }
            else{
                left++;
            }
        }
       }
    }
    

}



/* private static void Tsum(int[] arr, int targetSum) {
       for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            for(int k=j+1;k<arr.length;k++){
                if(arr[i]+arr[j]+arr[k] == targetSum){
                    System.out.println(arr[i]+ " "+ arr[j]+ " "+ arr[k]);
                }
            }
        }

       }
    } */
