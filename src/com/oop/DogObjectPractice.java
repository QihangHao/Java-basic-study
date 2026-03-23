package com.oop;

/**
 * @author 郝启航
 */
class Dog {
    private String name;
    private int age;

    public void setName(String name1) {
        name = name1;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age1) {
        if (age1 < 0 || age1 > 15) {
            System.out.println("请输入正确的年龄");
        } else {
            age = age1;
        }
    }

    public int getAge() {
        return age;
    }
    public void eatBone() {
        System.out.println("年龄是" + age+"的"+name+"正在吃骨头");
    }
}

public class DogObjectPractice {
    static void main() {
        Dog dog = new Dog();
        dog.setName("小黄");
        dog.setAge(5);
        dog.eatBone();
        System.out.println("名字是：" + dog.getName() + "，年龄是：" + dog.getAge());
    }
}
