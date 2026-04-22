package com.oop.PolymorphicTest003;

/**
 * @author 郝启航
 */
public class Test {
    static void main() {
        Rectangle r1 =new Rectangle(2,1);
        Round o1 =new Round(3);
        Students s1 =new Students("人",18);
        s1.printImage(r1);
        s1.printImage(o1);
        s1.useImage(r1);
        s1.useImage(o1);
    }
}
