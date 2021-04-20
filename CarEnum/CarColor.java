package com.Task.Task07.CarEnum;

import com.Task.Task07.CarInterface.CarColorInterface;

public enum CarColor implements CarColorInterface {

    WHITE("White"),
    BLACK("Black"),
    GREEN("Green"),
    BLUE("Blue"),
    RED("Red"),
    YELLOW("Yellow"),
    DIAMOND_SKY("DiamondSky"),
    ;

    private final String string;

    CarColor(String string) {
        this.string = string;
    }

    public String getColor() {
        return string;
    }

    public String toString() {
        return String.valueOf(string);
    }
}