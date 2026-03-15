package com.leetcode;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

/**
 * @author 郝启航
 */
public class LeetCode001 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Map<Integer, Integer> map = new HashMap<>();
        System.out.println("请输入目标值：");
        int target = sc.nextInt();
        System.out.println("请输入数组数值用空格间隔：");
        int i = 0;
        while(sc.hasNextInt()){
            int currentnum = sc.nextInt();
            if(map.containsKey(target - currentnum)){
                System.out.println("[" + map.get(target - currentnum) + "," + i + "]");
                break;
            }else{
                map.put(currentnum, i);
                i++;
            }
        }
    }
}
//测试能否同步上传