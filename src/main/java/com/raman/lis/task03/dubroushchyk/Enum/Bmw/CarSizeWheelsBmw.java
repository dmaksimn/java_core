package com.raman.lis.task03.dubroushchyk.Enum.Bmw;

import com.raman.lis.task03.dubroushchyk.ICarSizeWheels;

public enum CarSizeWheelsBmw implements ICarSizeWheels {
    Low(17),
    MIDDLE(18),
    HIGH(20);

    private int sizeWheels;

    private CarSizeWheelsBmw(int value) {
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
