package com.raman.lis.task04.bedareva;

public enum PartsOfRobot {
    HEAD,
    BODY,
    RIGHT_FOOT,
    LEFT_FOOT,
    RIGHT_HAND,
    LEFT_HAND;

    public static PartsOfRobot getRandom() {
        return values()[(int) (Math.random() * values().length)];
    }
}
