package com.raman.lis.task03.dubroushchyk.Enum.Audi;

import com.raman.lis.task03.dubroushchyk.ICarModel;

public enum CarModelAudi implements ICarModel {
    A4("AUDI A4"),
    A6("AUDI A6"),
    A8("AUDI A8");

    private String model;

    CarModelAudi(String model) {
        this.model = model;
    }

    @Override
    public String getModel() {
        return model;
    }
}
