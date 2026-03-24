package com.daily.study.GoodsSystes;

/**
 * @author 郝启航
 */
public class Goods {
    private String name;
    private double price;
    private GoodsStates state;

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

    public GoodsStates getState() {
        return state;
    }

    public void setState(GoodsStates state) {
        this.state = state;
    }

    public Goods() {
    }

    public Goods(String name, double price, GoodsStates state) {
        this.name = name;
        this.price = price;
        this.state = state;
    }
}
