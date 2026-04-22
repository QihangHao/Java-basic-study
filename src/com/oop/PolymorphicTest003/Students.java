package com.oop.PolymorphicTest003;

/**
 * @author 郝启航
 */
public class Students {
    private String name;
    private int age;

    public Students(String name, int age) {
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

    public void useImage(Image image){
        System.out.println("用户正在使用图像");
    }
    public void printImage(Image image){
        if(image instanceof Rectangle){
            Rectangle r1 =(Rectangle) image;
            System.out.println("长度为"+r1.getLength()+"宽度为"+r1.getWide());
            System.out.println("周长为"+r1.CalculatePerimeter()+"面积为"+r1.CalculateArea());
        }
        else if(image instanceof Round){
            Round r1 =(Round) image;
            System.out.println("圆周率为"+r1.getPi()+"半径为"+r1.getRadius());
            System.out.println("周长为"+r1.CalculatePerimeter()+"面积为"+r1.CalculateArea());
        }
        else{
            System.out.println("请传入正确的图像");
        }
    }
}
