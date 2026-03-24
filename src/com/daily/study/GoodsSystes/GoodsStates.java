package com.daily.study.GoodsSystes;

/**
 * @author 郝启航
 */
public enum GoodsStates {
    UNPAID("未付款",  0),
    PAID("已付款",  1),
    DELIVERED("已发货",  2),
    RECEIVED("已收货",  3),
    COMPLETED("已完成",  4),
    CANCELED("已取消",  5);

    private final String name;
    private final int code;

    private GoodsStates(String name, int code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }



    public int getCode() {
        return code;
    }

}
