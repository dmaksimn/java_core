package com.Task.Task07.CarProperties;

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

    public String color;

    CarColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public String toString() {
        return String.valueOf(color);
    }

    public void setColor(String color) {
        this.color = color;
    }
}