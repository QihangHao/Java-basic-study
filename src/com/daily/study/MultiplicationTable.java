package com.daily.study;

import java.util.Scanner;

/**
 * @author 郝启航
 */
public class MultiplicationTable {
    public static void printMultiplicationTable(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + i * j + " ");
            }
            System.out.println();
        }
    }
    static void main() {
        System.out.println("请输入一个数：");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printMultiplicationTable(n);
    }
}
