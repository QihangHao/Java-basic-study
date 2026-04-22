package com.oop.PolymorphicTest003;

/**
 * @author 郝启航
 */
public class Round extends Image{
    static final double Pi=3.14;
    private double radius;

    public Round(double radius) {
        this.radius = radius;
    }

    public double getPi() {
        return Pi;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double CalculatePerimeter(){
        return 2 * Pi * radius;
    }

    @Override
    public double CalculateArea(){
        return Pi * radius * radius;
    }
}
