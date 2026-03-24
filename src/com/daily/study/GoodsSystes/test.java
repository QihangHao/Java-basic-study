package com.daily.study.GoodsSystes;

/**
 * @author 郝启航
 */
public class test {
    static void main() {
        Goods goods = new Goods("手机", 1000.0, GoodsStates.PAID);
        System.out.println(goods.getState());
        System.out.println(goods.getState().getCode());
    }

}
