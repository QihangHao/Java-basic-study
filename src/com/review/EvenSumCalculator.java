package com.review;

/**
 * @author 郝启航
 */
public class EvenSumCalculator {
    static void main() {
        int sum =0;
        for(int i=0;i<=100;i++){
            if(i%2==0){
                sum+=i;
            }
        }
        System.out.println("1到100的偶数和为："+sum);
    }
}
