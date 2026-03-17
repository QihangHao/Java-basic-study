package com.daily.study;

import java.util.Scanner;

/**
 * @author 郝启航
 */
/*public class ScoreCalculator {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入五个成绩：");
        int []scores = new int[5];
        int max =0;
        int min =0;
        int sum = 0;
        for(int i = 0; i < 5; i++){
            int score = sc.nextInt();
            if(score >= 0&& score <= 100){
                scores[i] = score;
                sum += scores[i];
                if(i == 0){
                    max = scores[i];
                    min = scores[i];
                }
                if(scores[i]> max){
                    max = scores[i];
                }
                if(scores[i] < min){
                    min = scores[i];
                }
            }
            else{
                System.out.println("输入的数字有误！");
                i--;
            }
        }
        int avg = (sum-max-min) / 3;
        System.out.println("平均分是：" + avg);
        System.out.println("最高分是：" + max);
        System.out.println("最低分是：" + min);
    }
}这是我最初写的虽然不符合题目要求但是我感觉执行效率挺高的*/
public class ScoreCalculator {
    public static int[] getStatsInOnePass(int[] scores) {
        int max = scores[0];
        int min = scores[0];
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];

            if (scores[i] > max) {
                max = scores[i];
            }
            if (scores[i] < min) {
                min = scores[i];
            }
        }
        return new int[]{sum, max, min};
    }

    static void main() {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入五个成绩：");
        int[] scores = new int[5];
        for (int i = 0; i < 5; i++) {
            int score = sc.nextInt();
            if (score >= 0 && score <= 100) {
                scores[i] = score;
            } else {
                System.out.println("输入的数字有误！");
                i--;
            }
        }
        int[] stats = getStatsInOnePass(scores);
        System.out.println("平均分是：" + (stats[0]-stats[1]-stats[2]) / 3.0);
        System.out.println("最高分是：" + stats[1]);
        System.out.println("最低分是：" + stats[2]);
    }
}