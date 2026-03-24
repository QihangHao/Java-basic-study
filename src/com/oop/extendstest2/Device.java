package com.oop.extendstest2;

/**
 * @author 郝启航
 */
public class Device {
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Device() {
    }

    public Device(double price, String brand) {
        this.price = price;
        this.brand = brand;
    }

    private double price;
    private String brand;
}
