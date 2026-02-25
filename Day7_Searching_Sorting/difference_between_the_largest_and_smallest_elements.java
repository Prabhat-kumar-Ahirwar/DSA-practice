package Day7_Searching_Sorting;

public class difference_between_the_largest_and_smallest_elements {
    public static void main(String[] args) {
        int arr[] = {8, 3, 1, 7, 2};
        Difference(arr);
    }
    public static void Difference(int arr[]){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]> max){
                max = arr[i];
            }
            if(arr[i]< min){
                min = arr[i];
            }
        }

        int diff = max - min;
        System.out.println(" difference between the largest and smallest elements "+diff);
    }
}
