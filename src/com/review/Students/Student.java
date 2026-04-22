package com.review.Students;

/**
 * @author 郝启航
 */
public class Student {
    String name;
    int age;
    static  String schoolName;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void show(){
        System.out.println("我叫 "+name+"，今年 "+age+" 岁，就读于 "+schoolName);
    }
}