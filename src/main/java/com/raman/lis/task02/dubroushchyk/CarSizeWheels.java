package com.raman.lis.task02.dubroushchyk;

public enum CarSizeWheels {
    Low(17),
    MIDDLE(18),
    HIGH(20);

    private int sizeWheels;

    private CarSizeWheels (int value) {
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
