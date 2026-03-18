package com.daily.study;

/**
 * @author 郝启航
 */
public class MedianOfTwoSortedArrays {
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


    static void main() {
        int[] nums1 = new int[]{1, 3};
        int[] nums2 = new int[]{2};
        double median = findMedianSortedArrays(nums1, nums2);
        System.out.println(median);
    }
}

