package com.oop.PolymorphicTest002;

/**
 * @author 郝启航
 */
public class Bike extends  Transportation{
    public Bike() {
    }

    public Bike(String brand, int speed) {
        super(brand, speed);
    }
    public void ringBell(){
        System.out.println("正在响铃");
    }

    @Override
    public void run() {
        System.out.println("自行车正在运动");
    }
    public String toString(){
        return "自行车品牌是"+getBrand()+"，速度是"+getSpeed();
    }
}
