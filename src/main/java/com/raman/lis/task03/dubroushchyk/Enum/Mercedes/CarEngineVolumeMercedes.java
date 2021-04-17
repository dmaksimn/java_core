package com.raman.lis.task03.dubroushchyk.Enum.Mercedes;

import com.raman.lis.task03.dubroushchyk.ICarEngine;

public enum CarEngineVolumeMercedes implements ICarEngine {
    LOW_2000("2000"),
    MIDDLE_3000("3000"),
    HIGH_4000("4000");

    private String volume;

    CarEngineVolumeMercedes(String value) {
        this.volume = value;
    }

    @Override
    public String getVolume() {
        return volume;
    }

//    @Override
//    public String toString() {
//        return String.valueOf(volume);
//    }
}
