package com.oop.PolymorphicTest002;

/**
 * @author 郝启航
 */
public class Test {
    static void main() {
        Transportation Bike = new Bike("Bike",10);
        Transportation Car = new Car("Car",100);
        Person person = new Person("Tom",18,"Male");
        person.use(Bike);
        person.use(Car);
    }
}
