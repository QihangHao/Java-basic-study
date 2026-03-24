package com.oop.ExtendsTest3;

/**
 * @author 郝启航
 */
public class Phone3 extends Phone2{
    @Override
    public void call(){
        System.out.println("打电话升级为视频电话");
    }
    public void playGame(){
        System.out.println("游戏");
    }
}
