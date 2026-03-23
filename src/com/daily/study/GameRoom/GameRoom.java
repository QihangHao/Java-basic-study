package com.daily.study.GameRoom;

/**
 * @author 郝启航
 */
public class GameRoom {
    private int playerCount;
    private String roomName;
    private static int roomTotal = 0;

    public GameRoom(String roomName) {
        this.roomName = roomName;
        roomTotal++;
    }
    public void join(int playerCount){
        this.playerCount+=playerCount;
    }
    public int getPlayerCount(){
        return playerCount;
    }
    public static int getRoomTotal(){
        return roomTotal;
    }

}
