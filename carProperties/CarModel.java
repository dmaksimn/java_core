package com.Task.Task07.carProperties;

import com.Task.Task07.carInterface.CarModelInterface;

public enum CarModel implements CarModelInterface {

    A6("A6"),
    A7("A7"),
    A5("A5"),
    COLT("Colt"),
    ASX("ASX"),
    LANCER("Lancer"),
    MERIVA("Meriva"),
    CORSA("Corsa"),
    ZAFIRA("Zafira"),
        ;

    public String model;

    CarModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return String.valueOf(model);
    }
}