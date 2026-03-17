package com.daily.study;

import java.util.Scanner;

/**
 * @author 郝启航
 */
public class ExpressFeeCalculator {
    static double calcFeeUnderOne(double kg) {
        return kg * 10;
    }

    static double calcFeeOneToFive(double kg) {
        return 10 + (kg - 1) * 2;
    }

    static double calcFeeOverFive(double kg) {
        return 18 + (kg - 5) * 1.5;
    }

    static void main() {
        System.out.println("请输入货物Kg数：");
        Scanner sc = new Scanner(System.in);
        double kg = sc.nextDouble();
        double fee ;
        while (kg <= 0) {
            System.out.println("请输入正确的货物Kg数：");
            kg = sc.nextDouble();
        }
        kg=Math.ceil(kg);
        if (kg <= 1) {
            fee = calcFeeUnderOne(kg);
        } else if (kg > 1 && kg <= 5) {
            fee = calcFeeOneToFive(kg);
        } else {
            fee = calcFeeOverFive(kg);
        }
        System.out.println("运费是：" + fee);
    }
}
