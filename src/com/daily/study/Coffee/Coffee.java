package com.daily.study.Coffee;

/**
 * @author 郝启航
 */
public class Coffee {
    private double price;
    private static double discount;
    public Coffee(double price){
        this.price=price;
    }
    public static void setDiscount(double discount){
        Coffee.discount=discount;
    }
    public Coffee addShot(double addPrice){
        this.price+=addPrice;
        return this;
    }
    public double getFinalPrice(){
        return price*discount;
    }

}
