package com.raman.lis.task03.shafalovich;

public enum CarEngines {
    ENGINE5 (3.0),
    ENGINE4 (2.5),
    ENGINE3 (2.0),
    ENGINE2 (1.8),
    ENGINE1 (1.5);

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
}

