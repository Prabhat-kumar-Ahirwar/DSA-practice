package Day2_Two_Pointer_Technique;

import java.util.HashMap;

public class ContainDuplicate {

    public static void main(String[] args) {

        int arr[] = {1,2,2,3};

        if(found(arr)){
            System.out.println("Contain Duplicates");
        }
        else{
            System.out.println("Not Contain Duplicates");
        }
    }

    public static boolean found(int arr[]){

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++){

            if(map.containsKey(arr[i])){
                return true;
            }
            else{
                map.put(arr[i], i);
            }
        }

        return false;
    }
}