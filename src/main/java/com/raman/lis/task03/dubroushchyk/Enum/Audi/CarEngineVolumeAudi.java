package com.raman.lis.task03.dubroushchyk.Enum.Audi;

public enum CarEngineVolumeAudi {
    LOW_VOLUME(1600),
    MIDDLE_VOLUME(3000),
    HIGH_VOLUME(4000);

    private int volume;

    CarEngineVolumeAudi(int value) {
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
