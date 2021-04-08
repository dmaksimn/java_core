package com.raman.lis.task03.dubroushchyk.Enum.Bmw;

import com.raman.lis.task03.dubroushchyk.ICarEngine;

public enum CarEngineVolumeBmw implements ICarEngine {
    LOW_VOLUME(2000),
    MIDDLE_VOLUME(2200),
    HIGH_VOLUME(3500);

    private int volume;

    CarEngineVolumeBmw(int value) {
        this.volume = value;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return String.valueOf(volume);
    }
}
