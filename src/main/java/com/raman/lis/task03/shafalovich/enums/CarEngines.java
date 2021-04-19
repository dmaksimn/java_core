package com.raman.lis.task03.shafalovich.enums;

public enum CarEngines {
    ENGINE3_0(3.0),
    ENGINE2_5(2.5),
    ENGINE2_0(2.0),
    ENGINE1_8(1.8),
    ENGINE1_5(1.5);

    private double value;

    CarEngines(double value) {
        this.value = value;
    }

    public double getEngine() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static String print() {
        StringBuilder sb = new StringBuilder();
        sb.append(3.0).append(" ").
                append(2.5).append(" ").
                append(2.0).append(" ").
                append(1.8).append(" ").
                append(1.5);
        return sb.toString();
    }
}

