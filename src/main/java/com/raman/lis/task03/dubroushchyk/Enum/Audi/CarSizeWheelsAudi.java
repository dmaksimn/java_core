package com.raman.lis.task03.dubroushchyk.Enum.Audi;

import com.raman.lis.task03.dubroushchyk.ICarSizeWheels;

public enum CarSizeWheelsAudi implements ICarSizeWheels {
    LOW_17 ("17"),
    MIDDLE_19 ("19"),
    HIGH_20 ("20");

    private String sizeWheels;

    private CarSizeWheelsAudi(String value) {
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
