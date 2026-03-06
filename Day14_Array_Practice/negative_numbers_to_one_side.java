package Day14_Array_Practice;

public class negative_numbers_to_one_side {

    public static void main(String[] args) {

        int arr[] = {1,-2,3,-4,5};
        MoveNegative(arr);

    }

    private static void MoveNegative(int[] arr) {

        int i = 0;
        int j = arr.length - 1;

        while(i < j){

            if(arr[i] < 0){
                i++;
            }
            else if(arr[j] > 0){
                j--;
            }
            else{
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        for(int q : arr){
            System.out.print(q + " ");
        }
    }
}