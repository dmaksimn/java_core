package com.raman.lis.task03.dubroushchyk.Enum.Bmw;

public enum CarSizeWheelsBmw {
    Low(17),
    MIDDLE(18),
    HIGH(20);

    private int sizeWheels;

    private CarSizeWheelsBmw(int value) {
        this.sizeWheels = value;
    }

    public int getSizeWheels() {
        return sizeWheels;
    }

    @Override
    public String toString() {
        return String.valueOf(sizeWheels);
    }
}
