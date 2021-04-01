package com.raman.lis.task03.dubroushchyk.Enum.Audi;

public enum CarModelAudi {
    A4("AUDI A4"),
    A6("AUDI A6"),
    A8("AUDI A8");

    private String model;

    CarModelAudi(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }
}
