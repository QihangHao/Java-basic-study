package com.oop.extendstest2;

/**
 * @author 郝启航
 */
public class test {
    static void main() {
        APhone phone1 =new APhone(100,"一");
        phone1.nfc();
        System.out.println(phone1.getBrand());
        Iphone phone2 =new Iphone(200,"2");
        phone2.call();
        DesktopComputer dc =new DesktopComputer(300,"3");
        dc.playGame();
    }
}
