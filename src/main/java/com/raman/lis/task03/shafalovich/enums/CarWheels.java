package com.raman.lis.task03.shafalovich.enums;

public enum CarWheels {
    SIZE_21(21),
    SIZE_20(20),
    SIZE_19(19),
    SIZE_18(18),
    SIZE_17(17),
    SIZE_16(16);

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

    public static String print() {
        StringBuilder sb = new StringBuilder();
        sb.append(21).append(" ").
                append(20).append(" ").
                append(19).append(" ").
                append(18).append(" ").
                append(17).append(" ").
                append(16);
        return sb.toString();
    }
}
