package com.review;

/**
 * @author 郝启航
 */
public class BankQueuingMachineSimulation {
    public static void main(String[] args) {
        int currentNumber = 100;
        int customerA =currentNumber++;
        int customerB =currentNumber++;
        int vipCustomerC=++currentNumber;
        System.out.println("A的号码是："+customerA+"B的号码是："+customerB+"VIP的号码是："+vipCustomerC+"发号机当前号码是："+currentNumber);
    }
}
