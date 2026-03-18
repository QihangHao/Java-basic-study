package com.leetcode;

/**
 * @author 郝启航
 */
public class LeetCode042 {
    public static int []trap(int[] height) {
        int aspect =0;
        int []rightSum=new int[height.length];
        for(int i =0; i < height.length; i++){
            if(height[i] > aspect){
                aspect = height[i];
            }
            rightSum[i]+= aspect;
        }
        aspect = 0;
        int []leftSum=new int[height.length];
        for(int i = height.length-1; i >=0; i--){
            if(height[i]>aspect){
                aspect = height[i];
            }
            leftSum[i]+=aspect;
        }
        int []sum = new int[height.length];
        for(int i =0; i < height.length; i++){
            sum[i]=Math.min(leftSum[i],rightSum[i])-height[i];
        }
        return sum;
    }
}

