package com.oop.PolymorphicTest001;

/**
 * @author 郝启航
 */
public class Person {
    private String name;
    private int account;
    private int passWord;

    public Person() {
    }

    public Person(String name, int account, int passWord) {
        this.name = name;
        this.account = account;
        this.passWord = passWord;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public int getPassWord() {
        return passWord;
    }

    public void setPassWord(int passWord) {
        this.passWord = passWord;
    }

    public void work(){
        System.out.println("正在工作");
    }
}
