package com.raman.lis.task03.mihnevich.cars;

public enum Model {
    BMW("Bmw"), AUDI("Audi"), OPEL("Opel"), FIAT("Fiat"), FERRARI("Ferrari");
    private String value;

    private Model(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
