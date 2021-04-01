package com.raman.lis.task03.dubroushchyk.Enum.Mercedes;

public enum CarSizeWheelsMercedes {
    Low(17),
    MIDDLE(18),
    HIGH(20);

    private int sizeWheels;

    private CarSizeWheelsMercedes(int value) {
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
