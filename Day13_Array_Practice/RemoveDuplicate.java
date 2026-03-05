package Day13_Array_Practice;

import java.util.HashSet;

public class RemoveDuplicate {
    public static void main(String[] args) {
    int arr[] = {1,6,2,4,8};
    HashSet<Integer> set = new HashSet<>();
    for(int n : arr){
        set.add(n);
    }
    System.out.println(set);

}
}