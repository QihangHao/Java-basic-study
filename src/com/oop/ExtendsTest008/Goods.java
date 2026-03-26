package com.oop.ExtendsTest008;

/**
 * @author 郝启航
 */
public class Goods {
    private String name;
    private double price;

    public Goods() {
    }

    public Goods(String name, double price) {
        this.name = name;
        this.price = price;
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
    public void show(){
        System.out.println("商品名称："+name+"价格："+price);
    }
}
