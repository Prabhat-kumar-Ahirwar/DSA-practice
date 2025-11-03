import java.util.HashSet;

public class q1_optimise {

    public static void main(String[] args) {
        int arr[]= {2,3,2,3,4};
        HashSet<Integer> set = new HashSet<>();

        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
    System.out.println("number of distinct element in arr : "+set.size());
    }

}