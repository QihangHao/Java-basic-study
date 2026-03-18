package com.daily.study;

import java.util.Scanner;

/**
 * @author 郝启航
 */
public class RedPacketGenerator {
    public static void redPacketGenerator(double money, int people) {

        double min = 0.01;
        double redMoney ;
        for (int i = 0; i < people; i++){
            if(i == people - 1){
                redMoney = (double)Math.round(money*100)/100;
            }
            else{
                double max =money - (people - 1-i) * 0.01;
                redMoney = (Math.random() * (max - min) + min);
                redMoney = (double)Math.round(redMoney * 100) / 100;
                money = money - redMoney;

            }
            System.out.println("第" + (i + 1) + "个人抢到的红包为：" + redMoney);
        }
    }

    static void main() {
        System.out.println("请输入红包金额和总共人数");
        Scanner sc = new Scanner(System.in);
        double money = sc.nextInt();
        int people = sc.nextInt();
        redPacketGenerator(money, people);
    }
}
