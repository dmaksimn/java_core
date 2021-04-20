package com.Task.Task07.CarEnum;

import com.Task.Task07.CarInterface.CarSizeWheelsInterface;

public enum CarSizeWheels implements CarSizeWheelsInterface {

    Low("14"),
    Medium("15"),
    Large("17"),
    BigLarge("20"),
    Monster("25"),
    BigFoot("32"),
    ;

    private String sizeWheels;

    CarSizeWheels(String value) {
        this.sizeWheels = value;
    }

    public String getSizeWheels() {
        return sizeWheels;
    }

    public String toString() {
        return String.valueOf(sizeWheels);
    }

    public String toString(String low, String medium, String large, String bigLarge, String monster, String bigFoot) {
        return String.valueOf(sizeWheels);
    }
}