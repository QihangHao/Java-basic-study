package com.daily.study;

import java.util.Scanner;

/**
 * @author 郝启航
 *
 */

public class Sum {
    static int getSum(int a,int b) {
        return a+b;
    }
    static void main() {
        System.out.println("请输入两个数");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(getSum(a,b));
    }
}
