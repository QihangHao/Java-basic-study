package com.oop.ExtendsTest007;

/**
 * @author 郝启航
 */
public class Test {
    static void main() {
        ColdDish coldDish = new ColdDish("凉菜", 10.0, "一般",10);
        coldDish.show();
        HotDishes hotDishes = new HotDishes("火锅", 20.0, "辣",10);
        hotDishes.show();
    }
}
