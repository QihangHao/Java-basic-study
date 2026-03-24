package com.oop.extendstest2;

/**
 * @author 郝启航
 */
public class Phone extends Device {
    public Phone() {
    }

    public Phone(double price, String brand) {
        super(price, brand);
    }

    public void call() {
        System.out.println("打电话");
    }
    public void sendMessage() {
        System.out.println("发短信");
    }
}
