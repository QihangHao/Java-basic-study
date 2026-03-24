package com.daily.study.Preson;

/**
 * @author 郝启航
 */
public class Person {
    int age;
    String sex;
    String name;

    public Person() {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(int age, String sex, String name) {
        this.age = age;
        this.sex = sex;
        this.name = name;
    }
}
