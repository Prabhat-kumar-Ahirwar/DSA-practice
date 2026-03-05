package Day13_Array_Practice;

public class SumOfElements {
    public static void main(String[] args) {
        int arr[] ={1,2,3};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum = sum+arr[i];
        }
        System.out.println(sum + " Sum of all elements");
    }
}
