package Day17_BS_1DArray;

import java.util.Arrays;

public class first_and_last_position {
    public static void main(String[] args) {
        int arr[] ={5,7,7,8,8,10};
        int target = 8;
        System.out.println(Arrays.toString(searchRange(arr, target)));
        
    }
     public static int[] searchRange(int[] nums, int target) {
        int first = findFirst(nums, target);
        int last = findLast(nums, target);
        return new int[] {first, last};
    }
     private static int findFirst(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        int ans=-1;
        while (low<=high) {
            int mid = low+ (high-low) /2;
            if(nums[mid] == target){
                ans = mid;
                high = mid-1;
            }
            else if(nums[mid] < target){
                low = mid+1;
            }
            else{
                high = mid -1;
            }
            
        }
        return ans;
    }
    private static int findLast(int[] nums, int target) {
    int low = 0;
    int high = nums.length - 1;
    int ans = -1;

    while (low <= high) {
        int mid = low + (high - low) / 2;

        if (nums[mid] == target) {
            ans = mid;
            low = mid + 1;   // move right to find last
        }
        else if (nums[mid] < target) {
            low = mid + 1;
        }
        else {
            high = mid - 1;
        }
    }

    return ans;
}
}
