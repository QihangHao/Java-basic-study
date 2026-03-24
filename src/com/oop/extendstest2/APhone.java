package com.oop.extendstest2;

/**
 * @author 郝启航
 */
public class APhone extends  Phone{
    public APhone() {
    }

    public APhone(double price, String brand) {
        super(price, brand);
    }

    public void nfc(){
        System.out.println("nfc");
    }
}
