package com.raman.lis.task03.dubroushchyk.Enum.Audi;

import com.raman.lis.task03.dubroushchyk.ICarSizeWheels;

public enum CarSizeWheelsAudi implements ICarSizeWheels {
    Low(17),
    MIDDLE(19),
    HIGH(20);

    private int sizeWheels;

    private CarSizeWheelsAudi(int value) {
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
