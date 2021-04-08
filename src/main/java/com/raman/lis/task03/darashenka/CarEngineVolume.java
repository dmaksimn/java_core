package com.raman.lis.task03.darashenka;

public enum CarEngineVolume {
    Low(1300),
    Medium(1600),
    High(2000),
    ;
    private int volume;

    CarEngineVolume(int value) {
        this.volume = value;
    }

    public int getVolume() {
        return volume;
    }

    public String toString() {
        return String.valueOf(volume);
    }
}
