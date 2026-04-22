package com.review.Zoo;

/**
 * @author 郝启航
 */
public class cat extends Animal{
    public cat() {
    }

    public cat(String name, int age) {
        super(name, age);
    }

    public void catchMouse(){
        System.out.println("猫正在抓老鼠");
    }

    @Override
    public void eat() {
        System.out.println("猫正在吃东西");
    }
}
