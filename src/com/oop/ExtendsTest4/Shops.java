package com.oop.ExtendsTest4;

/**
 * @author 郝启航
 */
public class Shops {
    private double price;
    private String name;

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Shops() {
    }

    public Shops(double price, String name) {
        this.price = price;
        this.name = name;
    }
    public double getPrice(){
        if(price>0&&price<=1000){
            return price;
        }
        else if(price>1000&&price<=5000){
            return price*0.9;
        }
        else if(price>5000&&price<=10000){
            return price*0.8;
        }
        else if(price>10000){
            return price*0.7;
        }
        else{
            return 0;
        }
    }
}
