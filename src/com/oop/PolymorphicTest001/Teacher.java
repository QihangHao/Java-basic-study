package com.oop.PolymorphicTest001;

/**
 * @author 郝启航
 */
public class Teacher extends  Person{
    public Teacher() {
    }

    public Teacher(String name, int account, int passWord) {
        super(name, account, passWord);
    }
    @Override
    public void work() {
        System.out.println("老师的工作是教书");
    }
}
