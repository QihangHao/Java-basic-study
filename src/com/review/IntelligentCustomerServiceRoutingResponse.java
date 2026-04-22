package com.review;

/**
 * @author 郝启航
 */
public class IntelligentCustomerServiceRoutingResponse {
    public static void main(String[] args) {
        String command = "转人工";
        switch (command) {
            case "转人工":
                System.out.println("正在为您连接专属客服，请稍候...");
                break;
            case "查账单":
                System.out.println("您的本月账单共计 500 元");
                break;
            case "充值":
                System.out.println("即将为您生成充值二维码...");
                break;
            default:
                System.out.println("听不懂您的指令，请说‘查账单’、‘充值’或‘转人工’");
        }

    }
}
