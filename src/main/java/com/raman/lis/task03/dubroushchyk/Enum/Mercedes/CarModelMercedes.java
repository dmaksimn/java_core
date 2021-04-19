package com.raman.lis.task03.dubroushchyk.Enum.Mercedes;

import com.raman.lis.task03.dubroushchyk.ICarModel;

public enum CarModelMercedes implements ICarModel {
    E200("E200"),
    SLR("SLR"),
    GL("GL");

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
