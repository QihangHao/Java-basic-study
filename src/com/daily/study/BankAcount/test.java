package com.daily.study.BankAcount;

/**
 * @author 郝启航
 */
public class test {
    static void main() {
        BankAccount ba = new BankAccount(1000);
        ba.deposit(500);
        System.out.println(ba.getBalance());
        BankAccount ba2 = new BankAccount(2000);
        System.out.println(ba2.getBalance());
        System.out.println(BankAccount.getTotal());
    }
}
