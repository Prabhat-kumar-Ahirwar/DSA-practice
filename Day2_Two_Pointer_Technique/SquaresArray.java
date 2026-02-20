package Day2_Two_Pointer_Technique;

import java.util.Arrays;

public class SquaresArray {

    public static void main(String[] args) {

        int arr[] = {-4,-1,0,3,10};

        System.out.println(Arrays.toString(squares(arr)));
    }

    public static int[] squares(int arr[]) {

        int n = arr.length;
        int left = 0;
        int right = n - 1;

        int result[] = new int[n];
        int index = n - 1;

        while(left <= right) {

            int leftSquare = arr[left] * arr[left];
            int rightSquare = arr[right] * arr[right];

            if(leftSquare > rightSquare) {
                result[index] = leftSquare;
                left++;
            } else {
                result[index] = rightSquare;
                right--;
            }

            index--;
        }

        return result;
    }
}/* 
Not Optimal solution it will give O(N logn) comnplexity
 int arr[] = {-4,-1,0,3,10};
    for(int i=0;i<arr.length;i++){
        arr[i] = arr[i]*arr[i];
    }
    Arrays.sort(arr);
    for(int j=0;j<arr.length;j++){
        System.out.print(arr[j]+" ");
    } 
 */