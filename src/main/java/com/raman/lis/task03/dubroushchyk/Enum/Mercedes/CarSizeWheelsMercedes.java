package com.raman.lis.task03.dubroushchyk.Enum.Mercedes;

import com.raman.lis.task03.dubroushchyk.ICarSizeWheels;

public enum CarSizeWheelsMercedes implements ICarSizeWheels {
    Low(17),
    MIDDLE(18),
    HIGH(20);

    private int sizeWheels;

    private CarSizeWheelsMercedes(int value) {
        this.sizeWheels = value;
    }

    @Override
    public int getSizeWheels() {
        return sizeWheels;
    }

    @Override
    public String toString() {
        return String.valueOf(sizeWheels);
    }
}
