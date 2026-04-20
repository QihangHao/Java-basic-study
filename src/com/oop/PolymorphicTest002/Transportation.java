package com.oop.PolymorphicTest002;

/**
 * @author 郝启航
 */
public class Transportation {
    private String brand;
    private int speed;

    public Transportation() {
    }

    public Transportation(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void run(){
        System.out.println("正在以"+speed+"km/h的速度行驶");
    }
}
