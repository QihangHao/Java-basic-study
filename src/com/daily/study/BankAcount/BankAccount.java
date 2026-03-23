package com.daily.study.BankAcount;

/**
 * @author 郝启航
 */
public class BankAccount {
    private int balance;
    private static int count=0;
    public BankAccount(int balance){
        this.balance=balance;
        count++;
    }

    public void deposit(int amount){
        this.balance+=amount;
    }
    public int getBalance(){
       return balance;
    }
    public static int getTotal(){
        return count;
    }
}
