package com.raman.lis.task03.darashenka;

public enum CarSizeWheels {
    Low(14),
    Medium(16),
    High(22),
    ;
    private int sizeWheels;

    CarSizeWheels(int value) {
        this.sizeWheels = value;
    }

    public int getSizeWheels() {
        return sizeWheels;
    }

    public String toString() {
        return String.valueOf(sizeWheels);
    }
}
