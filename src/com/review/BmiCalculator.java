package com.review;

import java.util.Scanner;

/**
 * @author 郝启航
 */
public class BmiCalculator {
    public static void main(String[] args) {
        System.out.println("BMI Calculator");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.next();
        System.out.print("Enter your height in meters: ");
        double height = scanner.nextDouble();
        System.out.print("Enter your weight in kilograms: ");
        float weight = scanner.nextFloat();
        double bmi = weight / (height * height);
        System.out.println("姓名"+name+" BMI为: " + bmi);
    }
}
