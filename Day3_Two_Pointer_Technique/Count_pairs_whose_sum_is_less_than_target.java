package Day3_Two_Pointer_Technique;

import java.util.*;

public class Count_pairs_whose_sum_is_less_than_target { 
    
    public static void main(String[] args) {
        Count_pairs_whose_sum_is_less_than_target obj = 
            new Count_pairs_whose_sum_is_less_than_target();
            
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
        int target = 7;
        
        int result = obj.countPairs(nums, target);
        System.out.println("Count = " + result);
    }
    
    public int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums);
        int i = 0;
        int j = nums.size() - 1;
        int count = 0;
        
        while (i < j) {
            int sum = nums.get(i) + nums.get(j);
            
            if (sum < target) {
                count += (j - i);
                i++;
            } else {
                j--;
            }
        }
        return count;
    }
}