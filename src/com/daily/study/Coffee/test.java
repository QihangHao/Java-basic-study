package com.daily.study.Coffee;

/**
 * @author 郝启航
 */
public class test {
    static void main() {
        Coffee.setDiscount(0.88);
        Coffee coffee = new Coffee(20.0);
        System.out.println(coffee.addShot(5.0).getFinalPrice());
        Coffee coffee1 = new Coffee(15.0);
        System.out.println(coffee1.getFinalPrice());
    }
}
