package com.review.phone;

/**
 * @author 郝启航
 */
public class PhoneTest {
    public static void main(String[] args) {
        Phone[] phones = new Phone[3];
        phones[0] = new Phone("华为", 5999);
        phones[1] = new Phone("苹果", 8999);
        phones[2] = new Phone("小米", 3999);
        Phone maxPhone = phones[0];
        for (int i = 1; i < phones.length; i++) {
            if (maxPhone.getPrice() < phones[i].getPrice()) {
                maxPhone = phones[i];
            }
        }
        maxPhone.call();

    }
}
