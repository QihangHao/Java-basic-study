package com.oop.PolymorphicTest002;

/**
 * @author 郝启航
 */
public class Car extends Transportation{
    public Car() {
    }

    public Car(String brand, int speed) {
        super(brand, speed);
    }
    public void honk(){
        System.out.println("正在响喇叭");
    }

    @Override
    public void run() {
        System.out.println("汽车正在移动");
    }
    public String toString(){
        return "汽车品牌是"+getBrand()+"汽车速度是"+getSpeed();
    }
}
