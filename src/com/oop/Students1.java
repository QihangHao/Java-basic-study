package com.oop;

/**
 * @author 郝启航
 */
class Student1 {
    private String name;
    private int age;

    public Student1() {
    }

    public Student1(String name, int age) {
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

    public void eat() {
        System.out.println(name + "吃吃吃");
    }

    public void sleep() {
        System.out.println(name + "睡睡睡");
    }

    public void study() {
        System.out.println(name + "学习学习学习");
    }
}
/**
 * @author 郝启航
 */
public class Students1 {
    static void main() {
        Student1  student =new Student1("人",18);
        student.eat();
        student.sleep();
        student.study();
        student.setName("狗");
        System.out.println(student.getName());
    }
}
