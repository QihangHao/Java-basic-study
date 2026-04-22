package com.review;

/**
 * @author 郝启航
 */
public class CharacterHitSettlement {
    public static void main(String[] args) {
      int hp =100;
      hp -=120;
      if(hp<=0){
          System.out.println("血量已清零，角色阵亡，游戏结束！");
      }
        System.out.println("当前剩余血量："+hp);

    }
}
