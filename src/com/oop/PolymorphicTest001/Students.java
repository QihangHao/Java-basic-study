package com.oop.PolymorphicTest001;

/**
 * @author 郝启航
 */
public class Students extends  Person {
    public Students() {
    }

    public Students(String name, int account, int passWord) {
        super(name, account, passWord);
    }

    @Override
    public void work() {
        System.out.println("学生的工作是学习");
    }
}
