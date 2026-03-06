package Day14_Array_Practice;

import java.util.HashSet;

public class Union_of_two_arrays {
    public static void main(String[] args) {
        int arr1[] = {1,2,4,5};
        int arr2[] = {1,3,5,6};
        Union(arr1 , arr2);
    }

    private static void Union(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();
        for (Integer integer : arr1) {
            set.add(integer);
        }
        for (Integer integer : arr2) {
            set.add(integer);       
        }      
            System.out.println(set);
            
    }


    }
    
