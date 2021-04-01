package com.raman.lis.task03.dubroushchyk.Enum.Bmw;

public enum CarEngineVolumeBmw {
    LOW_VOLUME(2000),
    MIDDLE_VOLUME(2200),
    HIGH_VOLUME(3500);

    private int volume;

    CarEngineVolumeBmw(int value) {
        this.volume = value;
    }

    public int getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return String.valueOf(volume);
    }
}
