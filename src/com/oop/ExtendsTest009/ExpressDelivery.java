package com.oop.ExtendsTest009;

/**
 * @author 郝启航
 */
public class ExpressDelivery {
    private String id;
    private int weight;
    private String recipient;

    public ExpressDelivery() {
    }

    public ExpressDelivery(String id, int weight, String recipient) {
        this.id = id;
        this.weight = weight;
        this.recipient = recipient;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int price) {
        this.weight = price;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }
    public double getExpressDeliveryFee(){
        return weight*10 ;
    }
}
