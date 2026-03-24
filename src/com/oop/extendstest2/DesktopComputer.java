package com.oop.extendstest2;

/**
 * @author 郝启航
 */
public class DesktopComputer extends Device{
    public DesktopComputer() {
    }

    public DesktopComputer(double price, String brand) {
        super(price, brand);
    }

    public void playGame() {
        System.out.println("玩游戏");
    }
}
