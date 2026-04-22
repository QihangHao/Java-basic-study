package com.review;

import java.util.Random;
import java.util.Scanner;

/**
 * @author 郝启航
 */
public class GuessNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int targetNumber = rd.nextInt(100) + 1;

        while (true) {
            System.out.println("请输入您猜测的数字（1-100）：");
            int guess = sc.nextInt();
            if (guess > targetNumber) {
                System.out.println("您猜的数字太大了！");
            } else if (guess < targetNumber) {
                System.out.println("您猜的数字太小了！");
            } else {
                System.out.println("恭喜您，猜中了！");
                break;
            }

        }
        System.out.println("游戏结束，欢迎下次游玩！");
    }
}

