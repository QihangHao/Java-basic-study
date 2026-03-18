package com.daily.study;

/**
 * @author 郝启航
 */
public class ElectionSimulator {
    static void main() {
        int people = 1000;
        int[] votes = new int[6];
        for (int i = 0; i < people; i++) {
            int vote = (int) (Math.random() * 6);
            votes[vote]++;
        }
        int max = votes[1];
        int index = 0;
        for (int i = 1; i < 6; i++) {
            if (votes[i] > max) {
                max = votes[i];
                index = i;
            }
        }
        System.out.println("第" + (index) + "号候选人获得最多票数为" + max + "得票率为" + (max * 1.0 / people) * 100);
        for (int i = 0; i < 6; i++) {
            if (i == 0) {
                System.out.println("共有" + votes[i] + "人弃票，弃票率为" + (votes[i] * 1.0 / people) * 100);
            } else {
                System.out.println("第" + (i) + "号候选人得票数为" + votes[i] + "，得票率为" + (votes[i] * 1.0 / people) * 100);
            }
        }

    }
}
