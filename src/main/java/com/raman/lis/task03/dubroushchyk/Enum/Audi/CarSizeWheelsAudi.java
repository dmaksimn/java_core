package com.raman.lis.task03.dubroushchyk.Enum.Audi;

public enum CarSizeWheelsAudi {
    Low(17),
    MIDDLE(19),
    HIGH(20);

    private int sizeWheels;

    private CarSizeWheelsAudi(int value) {
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
