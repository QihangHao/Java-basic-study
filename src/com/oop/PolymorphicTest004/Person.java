package com.oop.PolymorphicTest004;

/**
 * @author 郝启航
 */
public class Person {
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    public void feedAnimal(Animal animal, String something) {
        animal.feedAnimal(animal, something);
    }
}
