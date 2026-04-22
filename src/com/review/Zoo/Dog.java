package com.review.Zoo;

/**
 * @author 郝启航
 */
public class Dog extends Animal{
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    public void lookHome(){
        System.out.println("狗正在看家护院");
    }

    @Override
    public void eat() {
        System.out.println("狗正在吃东西");
    }
}
