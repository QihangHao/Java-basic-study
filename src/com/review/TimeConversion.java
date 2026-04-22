package com.review;

/**
 * @author 郝启航
 */
public class TimeConversion {
    public static void main(String[] args) {
        int totalSeconds = 54321;
        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;
        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}
