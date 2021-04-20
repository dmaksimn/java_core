package com.Task.Task07.CarEnum;

import com.Task.Task07.CarInterface.CarModelInterface;

public enum CarModel implements CarModelInterface {

    A6("A6"),
    A7("A7"),
    A5("A5"),
    Colt("Colt"),
    ASX("ASX"),
    Lancer("Lancer"),
    Meriva("Meriva"),
    Corsa("Corsa"),
    Zafira("Zafira"),
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