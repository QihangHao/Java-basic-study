package com.oop.ExtendsTest4;

/**
 * @author 郝启航
 */
public class PhoneShops extends Shops {

    public PhoneShops() {
    }

    public PhoneShops(double price, String name) {
        super(price, name);
    }

    @Override
    public double getPrice() {
        return super.getPrice()*0.9;
    }
}
