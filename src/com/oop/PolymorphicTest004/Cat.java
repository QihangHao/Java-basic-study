package com.oop.PolymorphicTest004;

/**
 * @author 郝启航
 */
public class Cat extends Animal{
    public Cat(int age, String color) {
        super(age, color);
    }

    public void catchMouse(){
        System.out.println("猫正在抓老鼠");
    }

    @Override
    public void feedAnimal(Animal animal, String someThing) {
                    System.out.println("猫猫正在吃"+someThing);
    }
}
