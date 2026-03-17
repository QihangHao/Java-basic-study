package com.daily.study;

import java.util.Scanner;

/**
 * @author 郝启航
 */
public class ClassScoreCalculator {
    public static int passnumber (int[] scores){
        int count = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >= 60) {
                count++;
            }
        }
        return count;
    }
    public static int sum(int[] scores){
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        return sum;
    }
    public static int max(int []scores){
        int max = scores[0];
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > max) {
                max = scores[i];
            }
        }
        return max;
    }
    static void main() {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入班级人数：");
        int n = sc.nextInt();
        int []scores = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("请输入第" + (i + 1) + "个同学的分数：");
            int current = sc.nextInt();
            if (current >= 0 && current <= 100) {
                scores[i] = current;
            } else {
                System.out.println("输入的数字有误！");
                i--;
            }
        }
        System.out.println("通过人数是：" + passnumber(scores));
        System.out.println("总分是：" + sum(scores));
        System.out.println("最高分是：" + max(scores));
        System.out.println("及格率是：" + passnumber(scores)*100.0/n);
        System.out.println("平均分是：" + sum(scores)*1.0/n);


    }
}
