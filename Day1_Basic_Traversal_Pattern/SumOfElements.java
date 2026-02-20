package Day1_Basic_Traversal_Pattern;
public class SumOfElements{
    public static void main(String[] args){
        int arr[] = {2,4,6,8};
        int sum=0;
        for(int i=0 ;i<arr.length ; i++){
            sum = arr[i] + sum;
        }
        System.out.print(sum);
    }
}

//Q6: Copy elements from one array to another.
// Q7: Print all elements at even indices.
// Q8: Print all elements at odd indices.
// Q9: Reverse the array in-place without using extra space.
// Q10: Merge two arrays into a single array.