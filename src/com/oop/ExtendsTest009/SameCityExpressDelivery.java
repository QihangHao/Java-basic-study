package com.oop.ExtendsTest009;

/**
 * @author 郝启航
 */
public class SameCityExpressDelivery extends ExpressDelivery {
    public SameCityExpressDelivery() {
    }

    public SameCityExpressDelivery(String id, int weight, String recipient) {
        super(id, weight, recipient);
    }

    @Override
    public double getExpressDeliveryFee() {
        return super.getExpressDeliveryFee()+10;
    }
}
