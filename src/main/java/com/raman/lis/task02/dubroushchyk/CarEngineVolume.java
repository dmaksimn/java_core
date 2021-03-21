package com.raman.lis.task02.dubroushchyk;

public enum CarEngineVolume {
    LOW_VOLUME(1600),
    MIDDLE_VOLUME(2000),
    HIGH_VOLUME(3000);

    private int volume;

    CarEngineVolume (int value) {
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
