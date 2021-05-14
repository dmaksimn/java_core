package com.Task.Task07.carProperties;

import com.Task.Task07.carInterface.CarSizeWheelsInterface;

public enum CarSizeWheels implements CarSizeWheelsInterface {

    FOURTEEN("14"),
    FIFTEEN("15"),
    SEVENTEEN("17"),
    TWENTY("20"),
    TWENTY_FIVE("25"),
    THIRTY_TWO("32"),
    ;

    private final String sizeWheels;

    CarSizeWheels(String diameter) {
        this.sizeWheels = diameter;
    }

    public String getSizeWheels() {
        return sizeWheels;
    }

    public String toString() {
        return String.valueOf(sizeWheels);
    }
}