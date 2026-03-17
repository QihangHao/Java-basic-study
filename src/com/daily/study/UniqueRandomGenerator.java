package com.daily.study;

import java.util.*;

/**
 * @author 郝启航
 */
/* Random random = new Random();
        Map<Integer, Integer> map = new HashMap<>();
        int[] arrNum = new int[10];
        for (int i = 0; i < 10; i++) {
            int num = random.nextInt(100)+1;
            if(map.containsKey(num)){
                i--;
            }
            else{
                map.put(num,i);
                arrNum[i]=num;
            }
        }
        for (int i = 0; i < arrNum.length; i++) {
            System.out.print(arrNum[i] + " ");
        }
        这是我只知道HashMap的时候写的看了一下知道了HashSet用这个再写一下*/






        /*Random random = new Random();
        HashSet<Integer> set = new HashSet<>();
        while(set.size() < 10){
            int num = random.nextInt(100)+1;
            set.add(num);
        }
        for(int i : set){
            System.out.print(i + " ");
        }
    }
    这是学习了Hashset之后写的确实是非常简明*/

//但是这是个方法练习所以用方法写一下
public class UniqueRandomGenerator {
    public static LinkedHashSet<Integer> generateUniqueRandoms(int count, int min, int max) {
        Random random = new Random();
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        while(set.size() < count){
            int num = random.nextInt(max - min + 1) + min;
            set.add(num);
        }
        return set;
    }
    static void main() {
        LinkedHashSet<Integer> set =generateUniqueRandoms(10,1,100);
        for(int i : set){
            System.out.print(i + " ");
        }
    }
}
