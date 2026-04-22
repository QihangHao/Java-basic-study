package com.review;

/**
 * @author 郝启航
 */
public class VIPMemberDiscountSettlement {
    public static void main(String[] args) {
        int vipLevel = 2;
        double price = 200.00;
        double finalPrice;
        if (vipLevel >= 0 && vipLevel <= 3) {
            if (vipLevel == 3) {
                finalPrice = price * 0.7;
            } else if (vipLevel == 2) {
                finalPrice = price * 0.8;
            } else if (vipLevel == 1) {
                finalPrice = price * 0.9;
            } else {
                finalPrice = price;
            }
            System.out.println("您的会员等级是：" + vipLevel + "，实际需要支付:" + finalPrice + "元");
        } else {
            System.out.println("非法会员等级，系统拒绝结算！");
        }
    }

}

