package com.review;

import java.util.Scanner;

/**
 * @author 郝启航
 */
public class NumericSplittingExercise {
    public static void main(String[] args) {
        int number = 358;
        int hundredsPlace = number / 100;
        int tensPlace = (number %100)/10;
        int onesPlace = number % 10;
        System.out.println(" hundredsPlace = " + hundredsPlace+ " tensPlace = " + tensPlace+ " onesPlace = " + onesPlace);
    }
}
