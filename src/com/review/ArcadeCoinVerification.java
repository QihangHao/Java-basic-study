package com.review;

/**
 * @author 郝启航
 */
public class ArcadeCoinVerification {
    public static void main(String[] args) {
        int coinCount = 1;
        int gameCost = 2;
        if(coinCount >= gameCost && (coinCount -= gameCost) >= 0){
            System.out.println("投币成功！Ready... Fight!");
        }
        else{
            System.out.println("游戏币不足，请您先去前台充值！");

        }
        System.out.println("玩家当前剩余游戏币："+coinCount);
    }
}
