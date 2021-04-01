package com.raman.lis.task03.dubroushchyk.Enum.Mercedes;

public enum CarEngineVolumeMercedes {
    LOW_VOLUME(2000),
    MIDDLE_VOLUME(3000),
    HIGH_VOLUME(4000);

    private int volume;

    CarEngineVolumeMercedes(int value) {
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
