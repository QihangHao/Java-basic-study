package com.oop.ExtendsTest007;

/**
 * @author 郝启航
 */
public class HotDishes extends Dishes {
    private double cookTime;

    public HotDishes() {
    }

    public HotDishes(double cookTime) {
        this.cookTime = cookTime;
    }

    public HotDishes(String name, double price, String taste, double cookTime) {
        super(name, price, taste);
        this.cookTime = cookTime;
    }

    public double getCookTime() {
        return cookTime;
    }

    public void setCookTime(double cookTime) {
        this.cookTime = cookTime;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("烹饪时间："+cookTime);
    }
}
