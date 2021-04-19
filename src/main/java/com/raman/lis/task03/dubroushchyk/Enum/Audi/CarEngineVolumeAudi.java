package com.raman.lis.task03.dubroushchyk.Enum.Audi;

import com.raman.lis.task03.dubroushchyk.ICarEngine;

public enum CarEngineVolumeAudi implements ICarEngine {
    LOW_1600("1600"),
    MIDDLE_3000("3000"),
    HIGH_4000("4000");

    private String volume;

    CarEngineVolumeAudi(String value) {
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
