package com.oop.ExtendsTest009;

/**
 * @author 郝启航
 */
public class LongDistanceAirFreight extends ExpressDelivery{
    public LongDistanceAirFreight() {
    }

    public LongDistanceAirFreight(String id, int weight, String recipient) {
        super(id, weight, recipient);
    }

    @Override
    public double getExpressDeliveryFee() {
        return super.getExpressDeliveryFee()+15;
    }
}
