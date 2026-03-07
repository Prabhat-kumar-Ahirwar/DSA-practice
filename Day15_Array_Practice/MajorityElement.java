package Day15_Array_Practice;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public static void main(String[] args) {
        int arr[] = {1,1,2,5,2,3,4,5,5};
        Majority(arr);    
    }

    private static int Majority(int[] arr) {
        int n = arr.length;
        int maj = n / 2;

        Map<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            int count = map.getOrDefault(num, 0) + 1;
            if (count > maj) {System.out.println(num); return num;}
            map.put(num, count);
        }

        return -1;
    }
}