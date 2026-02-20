package Day2_Two_Pointer_Technique;

public class TwoSum {
    public static void main(String[] args) {
        int arr[]= {2,7,11,15};
        int target = 9;
        int i=0;
        int j =arr.length-1;
        
        while (i<j) {
            int sum = arr[i]+arr[j];
            if(sum==target){
                System.out.print(i+","+j);
                i++;
                j--;
            }
            else if(sum<target){
                i++;
            }
            else{
                j--;
            }
           
        }
    }
}
