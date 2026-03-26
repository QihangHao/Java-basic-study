package com.oop.PolymorphicTest001;

/**
 * @author 郝启航
 */
public class Admin extends Person{
    public Admin() {
    }

    public Admin(String name, int account, int passWord) {
        super(name, account, passWord);
    }

    @Override
    public void work() {
        System.out.println("管理员的工作是管理网站");
    }
}
