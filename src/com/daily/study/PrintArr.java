package com.daily.study;

/**
 * @author 郝启航
 */
public class PrintArr {
    public static void printArr(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
                break;
            }
            else{
            System.out.print(arr[i] + ", ");}
        }
        System.out.print("]");
    }
    static void main() {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        printArr(arr);

    }
}
