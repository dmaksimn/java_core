package com.raman.lis.task03.dubroushchyk.Enum.Bmw;

import com.raman.lis.task03.dubroushchyk.ICarModel;

public enum CarModelMercedes implements ICarModel {
    M4("M4"),
    M5("M5"),
    X6("X6");

    private String model;

    CarModelMercedes(String model) {
        this.model = model;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return String.valueOf(model);
    }
}
