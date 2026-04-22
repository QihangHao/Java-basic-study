package com.review.phone;

/**
 * @author 郝启航
 */
public class Phone {
    private String band;
    private int price;

    public Phone() {
    }

    public Phone(String band, int price) {
        this.band = band;
        setPrice(price);
    }

    public String getBand() {
        return band;
    }

    public void setBand(String band) {
        this.band = band;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if(price<0||price>5000)
        {
            System.out.println("价格不合法！");
            return;
        }
        this.price = price;
    }

    public void call(){
        System.out.println("价值 "+price+" 元的 "+band+" 手机正在打电话...");
    }

}
