package com.leetcode;

import java.util.Scanner;

/**
 * @author 郝启航
 */
public class LeetCode088 {
    static void main() {
        /*Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[] num1 = new int[n + m];
        for (int i = 0; i < m; i++) {
            num1[i] = sc.nextInt();
        }
        int[] num2 = new int[n];
        for (int i = 0; i < n; i++) {
            num2[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            num1[m + i] = num2[i];
        }
        for (int i = 0; i < num1.length; i++) {
            for (int j = i + 1; j < num1.length; j++) {
                if (num1[i] > num1[j]) {
                    int temp = num1[i];
                    num1[i] = num1[j];
                    num1[j] = temp;
                }
            }
        }
        for(int i = 0; i < num1.length; i++){
            System.out.print(num1[i] + " ");
        }
        这是我自己最初的想法，我知道他很麻烦但是也是最暴力的吧.
        */


        /*Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[] num1 = new int[m + n];
        for (int i = 0; i < m; i++) {
            num1[i] = sc.nextInt();
        }
        int[] num2 = new int[n];
        for (int i = 0; i < n; i++) {
            num2[i] = sc.nextInt();
        }
        int p = m - 1;
        int p1 = n - 1;
        while (p1 >= 0) {
            if (num1[p] < num2[p1]) {
                for (int i = num1.length - 1; i > p; i--) {
                    num1[i] = num1[i - 1];
                }
                num1[p + 1] = num2[p1];
                p1--;
                p--;
            } else {
                p--;
            }

        }
        这是我大致看了一眼答案写的非常离谱*/


        //LeetCode的答案不过也是我自己写的
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[] num1 = new int[m + n];
        for (int i = 0; i < m; i++) {
            num1[i] = sc.nextInt();
        }
        int[] num2 = new int[n];
        for (int i = 0; i < n; i++) {
            num2[i] = sc.nextInt();
        }
        int p = m - 1;
        int p1 = n - 1;
        int pMax = m + n - 1;
        while (p1 >= 0) {
            if (p < 0 || num1[p] < num2[p1]) {
                num1[pMax--] = num2[p1--];
            } else {
                num1[pMax--] = num1[p--];
            }
        }


    }


}
