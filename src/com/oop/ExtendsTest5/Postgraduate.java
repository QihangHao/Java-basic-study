package com.oop.ExtendsTest5;

/**
 * @author 郝启航
 */
public class Postgraduate extends Students {
    public Postgraduate() {
    }

    public Postgraduate(String name, int age, String gared) {
        super(name, age, gared);
    }

    public Postgraduate(String gared) {
        super(gared);
    }

    @Override
    public void study() {
        System.out.println("攻读硕士学位");
    }

    @Override
    public void sleep() {
        System.out.println("豪华公寓睡觉");
    }
}
