package com.oop.ExtendsTest008;

/**
 * @author 郝启航
 */
public class ElectronicGoods extends Goods{
    private String brand;
    private String model;

    public ElectronicGoods() {
    }

    public ElectronicGoods(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public ElectronicGoods(String name, double price, String brand, String model) {
        super(name, price);
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void show() {
        System.out.println("商品名称："+getName()+"价格："+getPrice()+"品牌："+brand+"型号："+model);
    }
}
