package com.oop.ExtendsTest006;

/**
 * @author 郝启航
 */
public class Test {
    static void main() {
        Cooker cooker = new Cooker("小王",18,5000);
        manager manager = new manager("小李",19,5000,50.0);
        cooker.work();
        manager.work();
        cooker.eat();
        manager.eat();
    }
}
