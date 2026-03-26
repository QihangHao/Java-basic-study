package com.oop.ExtendsTest007;

/**
 * @author 郝启航
 */
public class Dishes {
    private String name;
    private double price;
    private String taste;

    public Dishes() {
    }

    public Dishes(String name, double price, String taste) {
        this.name = name;
        this.price = price;
        this.taste = taste;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }
    public void show(){
        System.out.print("菜名："+name+"价格："+price+"口味："+taste);
    }
}
