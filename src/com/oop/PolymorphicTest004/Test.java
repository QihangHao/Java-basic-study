package com.oop.PolymorphicTest004;

/**
 * @author 郝启航
 */
public class Test {
    static void main() {
        Cat c1 =new Cat(18,"绿色");
        Dog d1 =new Dog(18,"黄色");
        d1.lookHome();
        c1.catchMouse();
        Person p1=new Person("人",18);
        p1.feedAnimal(c1,"粑粑");
        p1.feedAnimal(d1,"粑粑");

    }
}
