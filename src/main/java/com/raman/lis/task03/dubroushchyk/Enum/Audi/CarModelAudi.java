package com.raman.lis.task03.dubroushchyk.Enum.Audi;

import com.raman.lis.task03.dubroushchyk.ICarModel;

public enum CarModelAudi implements ICarModel {
    A4("A4"),
    A6("A6"),
    A8("A8");

    private String model;

    CarModelAudi(String model) {
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
