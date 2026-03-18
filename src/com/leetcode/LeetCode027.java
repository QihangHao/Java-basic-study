package com.leetcode;

/**
 * @author 郝启航
 */
public class LeetCode027 {
    public static int removeElement(int[] nums, int val) {
        int slow = 0;
        int fast = 0;
        while (fast < nums.length) {
            if (nums[fast] != val) {
                nums[slow] = nums[fast];
                slow++;
            }
        }
        return slow;
    }
}
