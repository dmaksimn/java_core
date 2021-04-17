package com.raman.lis.task03.dubroushchyk.Enum.Bmw;

import com.raman.lis.task03.dubroushchyk.ICarSizeWheels;

public enum CarSizeWheelsMercedes implements ICarSizeWheels {
    LOW_17("17"),
    MIDDLE_18("18"),
    HIGH_20("20");

    private String sizeWheels;

    private CarSizeWheelsMercedes(String value) {
        this.sizeWheels = value;
    }

    @Override
    public String getSizeWheels() {
        return sizeWheels;
    }

//    @Override
//    public String toString() {
//        return String.valueOf(sizeWheels);
//    }
}
