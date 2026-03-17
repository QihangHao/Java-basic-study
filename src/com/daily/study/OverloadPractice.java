package com.daily.study;

/**
 * @author 郝启航
 */
public class OverloadPractice {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b,int c) {
        return a + b+c;
    }
    public static int sum(int a, int b,int c,int d) {
        return a + b+c+d;
    }
    public static double sum(double a, double b) {
        return a + b;
    }
    static void main() {
        int a =1;
        int b =2;
        int c =3;
        int d =4;
        double a1 =0.5;
        double b1 =0.5;
        System.out.println(sum(a,b));
        System.out.println(sum(a,b,c));
        System.out.println(sum(a,b,c,d));
        System.out.println(sum(a1,b1));
    }
}
