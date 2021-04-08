package com.raman.lis.task03.dubroushchyk.Enum.Audi;

import com.raman.lis.task03.dubroushchyk.ICarEngine;

public enum CarEngineVolumeAudi implements ICarEngine {
    LOW_VOLUME(1600),
    MIDDLE_VOLUME(3000),
    HIGH_VOLUME(4000);

    private int volume;

    CarEngineVolumeAudi(int value) {
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
