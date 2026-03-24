package com.oop.ExtendsTest3;

/**
 * @author 郝启航
 */
public class test {
    static void main() {
        Phone3 p = new Phone3();
        p.call();
        p.sendMessage();
        p.playGame();
        Phone2 p2 = new Phone2();
        p2.call();
        p2.sendMessage();
        Phone p3 = new Phone();
        p3.call();

    }
}
