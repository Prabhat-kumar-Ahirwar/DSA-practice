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
    

    
/* private static void union(int[] arr1, int[] arr2) {

        int i = 0;
        int j = 0;

        while(i < arr1.length && j < arr2.length){

            if(arr1[i] < arr2[j]){
                System.out.print(arr1[i] + " ");
                i++;
            }
            else if(arr1[i] > arr2[j]){
                System.out.print(arr2[j] + " ");
                j++;
            }
            else{
                System.out.print(arr1[i] + " ");
                i++;
                j++;
            }
        }

        while(i < arr1.length){
            System.out.print(arr1[i] + " ");
            i++;
        }

        while(j < arr2.length){
            System.out.print(arr2[j] + " ");
            j++;
        }
    } */