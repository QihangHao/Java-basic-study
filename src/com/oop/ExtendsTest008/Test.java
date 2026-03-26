package com.oop.ExtendsTest008;

/**
 * @author 郝启航
 */
public class Test {
    static void main() {
        ClothingGoods clothingGoods = new ClothingGoods("T恤", 20.0, "黑色", "L");
        clothingGoods.show();
        ElectronicGoods electronicGoods = new ElectronicGoods("电脑", 5000.0, "华硕", "X1");
        electronicGoods.show();
    }
}
