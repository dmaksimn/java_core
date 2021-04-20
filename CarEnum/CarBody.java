package com.Task.Task07.CarEnum;

import com.Task.Task07.CarInterface.CarBodyInterface;

public enum CarBody implements CarBodyInterface {

    Sedan("Sedan"),
    Hatchback("Hatchback"),
    SUV("SUV"),
    Pickup("Pickup"),
    Limousine("Limousine"),
    Coupe("Coupe"),
    ;

    private final String body;

    CarBody(String body) {
        this.body = body;
    }

    public String getBody() {
        return body;
    }
}