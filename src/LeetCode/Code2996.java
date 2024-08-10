package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class Code2996 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 2, 5};
        int longestSeqPrefixEnd = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1] + 1) {
                longestSeqPrefixEnd = i;
            } else {
                break;
            }
        }
        int sumSeqPrefixEnd = 0;
        for (int i = 0; i <= longestSeqPrefixEnd; i++) {
            sumSeqPrefixEnd += nums[i];
        }
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }
        int x = sumSeqPrefixEnd;
        while (numSet.contains(x)) {
            x++;
        }
        System.out.println("----" + x);

    }
}
