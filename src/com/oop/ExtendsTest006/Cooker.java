package com.oop.ExtendsTest006;

/**
 * @author 郝启航
 */
public class Cooker extends  Person {
    public Cooker() {
    }

    public Cooker(String name, int id, double price) {
        super(name, id, price);
    }

    @Override
    public void work() {
        System.out.println("Cooker cook");
    }
}
