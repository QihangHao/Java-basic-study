package com.daily.study.ArrayUtilTest;

/**
 * @author 郝启航
 */
public class ArrayUtil {
   private  ArrayUtil() {}
    public static int getMax(int[] arr) {
       int max=arr[0];
       for(int i=1;i<arr.length;i++){
           if(max<arr[i]){
               max=arr[i];
           }
       }
       return max;
    }
    public static void printArray(int[] arr) {
       for(int i=0;i<arr.length;i++){
           System.out.print(arr[i]+" ");
       }
    }
}
