package com.daily.study.GameRoom;

/**
 * @author 郝启航
 */
public class test {
    static void main() {
        System.out.println(GameRoom.getRoomTotal());
        GameRoom room1 = new GameRoom("新手村");
        GameRoom room2 = new GameRoom("高手");
        room1.join(3);
        room2.join(5);
        System.out.println(room1.getPlayerCount());
        System.out.println(GameRoom.getRoomTotal());
    }
}
