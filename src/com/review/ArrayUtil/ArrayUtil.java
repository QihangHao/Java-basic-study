package com.review.ArrayUtil;

/**
 * @author 郝启航
 */
public class ArrayUtil {
    private ArrayUtil() {
    }

    public static int getMax(int[] arr){
        if(arr==null||arr.length == 0){
            return -1;
        }
        int max =arr[0];
        for(int i =1;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
}
