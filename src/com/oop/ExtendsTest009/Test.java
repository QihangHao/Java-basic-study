package com.oop.ExtendsTest009;

/**
 * @author 郝启航
 */
public class Test {
    static void main() {
        LongDistanceAirFreight ld = new LongDistanceAirFreight("1234",10,"小王");
        System.out.println(ld.getExpressDeliveryFee());
        SameCityExpressDelivery sc = new SameCityExpressDelivery("1234",10,"小王");
        System.out.println(sc.getExpressDeliveryFee());
    }
}
