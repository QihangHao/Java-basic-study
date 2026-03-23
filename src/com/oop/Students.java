package com.oop;

/**
 * @author 郝启航
 */
class Student {
    private String name;
    private int age;
    private int height;
    private int weight;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void lifeShow() {
        System.out.println("大一我叫" + name + "，今年" + age + "岁，身高" + height + "cm，体重" + weight + "kg");
        System.out.println("大二我胖了10KG");
        weight += 10;
        age++;
        System.out.println("大三我瘦了2KG,身高高了2cm");
        weight -= 2;
        height += 2;
        age += 2;

        System.out.println("大四我叫" + name + "，今年" + age + "岁，身高" + height + "cm，体重" + weight + "kg");
    }

}

public class Students {
    static void main() {
        Student student = new Student();
        student.setName("小王");
        student.setAge(18);
        student.setHeight(170);
        student.setWeight(70);
        student.lifeShow();

    }
}
