package com.oop.PolymorphicTest004;

/**
 * @author 郝启航
 */
public abstract class Animal {
    private int age;
    private String color;

    public Animal(int age, String color) {
        this.age = age;
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void eat(String someThing){
        System.out.println("动物正在吃"+someThing);
    }
    public abstract void feedAnimal(Animal animal,String someThing);
}
