package Day25;

import java.util.*;

public class Consecutive {

    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();

        // Step 1: Add all elements to set
        for (int num : nums) {
            set.add(num);
        }

        int maxLength = 0;

        // Step 2: Check for sequence start
        for (int num : set) {
            if (!set.contains(num - 1)) { // start of sequence
                int currNum = num;
                int length = 1;

                // Step 3: Expand sequence
                while (set.contains(currNum + 1)) {
                    currNum++;
                    length++;
                }

                maxLength = Math.max(maxLength, length);
            }
        }

        return maxLength;
    }
}