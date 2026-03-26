package com.oop.ExtendsTest007;

/**
 * @author 郝启航
 */
public class ColdDish extends Dishes{
    private double shelfLife;

    public ColdDish(double shelfLife) {
        this.shelfLife = shelfLife;
    }

    public ColdDish(String name, double price, String taste, double shelfLife) {
        super(name, price, taste);
        this.shelfLife = shelfLife;
    }

    public ColdDish() {
    }

    public double getShelfLife() {
        return shelfLife;
    }

    public void setShelfLife(double shelfLife) {
        this.shelfLife = shelfLife;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("保质期："+shelfLife);
    }
}
