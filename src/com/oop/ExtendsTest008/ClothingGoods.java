package com.oop.ExtendsTest008;

/**
 * @author 郝启航
 */
public class ClothingGoods extends Goods {
    private String color;
    private String size;

    public ClothingGoods() {
    }

    public ClothingGoods(String color, String size) {
        this.color = color;
        this.size = size;
    }

    public ClothingGoods(String name, double price, String color, String size) {
        super(name, price);
        this.color = color;
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public void show() {
        System.out.println("商品名称："+getName()+"价格："+getPrice()+"颜色："+color+"尺码："+size);
    }
}
