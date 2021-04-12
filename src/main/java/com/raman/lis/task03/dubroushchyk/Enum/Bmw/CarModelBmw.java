package com.raman.lis.task03.dubroushchyk.Enum.Bmw;

import com.raman.lis.task03.dubroushchyk.ICarModel;

public enum CarModelBmw implements ICarModel {
    M4("BMW M4"),
    M5("BMW M5"),
    X6("BMW X6");

    private String model;

    CarModelBmw(String model) {
        this.model = model;
    }

    @Override
    public String getModel() {
        return model;
    }
}
