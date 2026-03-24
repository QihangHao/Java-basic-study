package com.daily.study;

/**
 * @author 郝启航
 */
public class Circle {
    private double radius;
    private final double PI = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
    }

    public double getPI() {
        return PI;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return PI * radius * radius;
    }
    public double getCircumference() {
        return 2 * PI * radius;
    }
}
