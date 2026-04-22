package com.review;

/**
 * @author 郝启航
 */
public class MaxScoreFinder {
    public static int getMax(int[]arr){
        if(arr.length==0){
            return -1;
        }
        int max =arr[0];
        for(int i=1;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] scores = {33, 5, 22, 44, 55};
        int result=getMax(scores);
        System.out.println("本班最高分为："+result);
    }
}
