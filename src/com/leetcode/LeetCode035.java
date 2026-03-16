package com.leetcode;

import java.util.Scanner;


/**
 * @author 郝启航
 */
public class LeetCode035 {
    static void main() {
        /*Scanner sc = new Scanner(System.in);
        Map<Integer, Integer> map = new HashMap<>();
        System.out.println("请输入目标值：");
        int target = sc.nextInt();
        int i =0;
        while (sc.hasNextInt()) {
            int currentnum = sc.nextInt();
            if (map.containsKey(target)){
                System.out.println(map.get(target));
            }
            else{
                map.put(currentnum, i++);
            }
        }

        少看了一个条件如果目标值不存在于数组中，返回它将会被按顺序插入的位置。，没有注意到这个但是确实是也可以给出目标位置 */


        Scanner sc = new Scanner(System.in);
        System.out.println("请输入目标值：");
        int target = sc.nextInt();
        int[] num1 = new int[10];
        int i = 0;
        while (sc.hasNextInt()) {
            num1[i++] = sc.nextInt();
        }
        int left = 0;
        int right = num1.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (num1[mid] == target) {
                System.out.println(mid);
                break;
            } else if (num1[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println(left);
    }
}
