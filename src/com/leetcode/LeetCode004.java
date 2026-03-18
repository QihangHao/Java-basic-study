package com.leetcode;

/**
 * @author 郝启航
 */
public class LeetCode004 {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int i = 0, j = 0, k = 0;
        int[] arr = new int[m + n];
        while (i < m && j < n) {
            if (nums1[i] >= nums2[j]) {
                arr[k] = nums2[j];
                j++;
            } else {
                arr[k] = nums1[i];
                i++;
            }
            k++;
        }
        while (i < m) {
            arr[k] = nums1[i];
            i++;
            k++;
        }
        while (j < n) {
            arr[k] = nums2[j];
            j++;
            k++;
        }
        return (m + n) % 2 == 0 ? (arr[(m + n) / 2] + arr[(m + n) / 2 - 1]) / 2.0 : arr[(m + n) / 2];
    }
}
