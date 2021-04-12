package com.raman.lis.task03.shafalovich;

public enum CarWheels {
    SIZE_21 (21),
    SIZE_20 (20),
    SIZE_19 (19),
    SIZE_18 (18),
    SIZE_17 (17),
    SIZE_16 (16);

    private int size;

    CarWheels(int size) {
        this.size = size;
    }

    public int getWheels() {
        return size;
    }

    @Override
    public String toString() {
        return String.valueOf(size);
    }
}
