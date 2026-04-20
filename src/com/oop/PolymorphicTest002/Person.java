package com.oop.PolymorphicTest002;

/**
 * @author 郝启航
 */
public class Person {
    private String name;
    private int age;
    private String sex;

    public Person() {
    }

    public Person(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    public void use(Transportation  transportation){
        System.out.println(name+"正在使用"+transportation.toString());
        if(transportation instanceof Car){
            Car car = (Car)transportation;
            car.honk();
        }
        if(transportation instanceof Bike){
            Bike bike = (Bike)transportation;
            bike.ringBell();
        }
    }
}
