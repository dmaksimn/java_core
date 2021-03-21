package com.raman.lis.task02.dubroushchyk;

public enum CarModel {
    AUDI("AUDI"),
    BMW("BMW"),
    MERCEDES("MERCEDES");

    private String model;

    CarModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }
}
