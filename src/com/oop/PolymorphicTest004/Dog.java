package com.oop.PolymorphicTest004;

/**
 * @author 郝启航
 */
public class Dog extends Animal{
    public Dog(int age, String color) {
        super(age, color);
    }

    public void lookHome(){
        System.out.println("狗狗正在看家");
    }

    @Override
    public void feedAnimal(Animal animal, String someThing) {
        System.out.println("狗狗正在吃"+someThing);
    }
}
