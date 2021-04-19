package com.raman.lis.task03.dubroushchyk.Enum.Bmw;

import com.raman.lis.task03.dubroushchyk.ICarEngine;

public enum CarEngineVolumeMercedes implements ICarEngine {
    LOW_2000("2000"),
    MIDDLE_2200("2200"),
    HIGH_3500("3500");

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
