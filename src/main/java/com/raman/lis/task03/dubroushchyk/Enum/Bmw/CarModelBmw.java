package com.raman.lis.task03.dubroushchyk.Enum.Bmw;

public enum CarModelBmw {
    M4("BMW M4"),
    M5("BMW M5"),
    X6("BMW X6");

    private String model;

    CarModelBmw(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }
}
