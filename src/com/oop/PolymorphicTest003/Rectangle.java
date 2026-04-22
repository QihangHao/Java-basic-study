package com.oop.PolymorphicTest003;

/**
 * @author 郝启航
 */
public class Rectangle extends Image{
    private double length;
    private double wide;

    public Rectangle(double length, double wide) {
        this.length = length;
        this.wide = wide;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWide() {
        return wide;
    }

    public void setWide(double wide) {
        this.wide = wide;
    }

    @Override
    public double CalculatePerimeter(){
        return 2 * (length + wide);
    }

    @Override
    public double CalculateArea(){
        return length * wide;
    }
}
