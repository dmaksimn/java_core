package com.Task.Task07.CarProperties;

import com.Task.Task07.CarInterface.CarBodyInterface;

public enum CarBody implements CarBodyInterface {

    SEDAN("Sedan"),
    HATCHBACK("Hatchback"),
    SUV("SUV"),
    PICKUP("Pickup"),
    LIMOUSINE("Limousine"),
    COUPE("Coupe"),
    ;

    private final String body;

    CarBody(String body) {
        this.body = body;
    }

    public String getBody() {
        return body;
    }

    public String toString() {
        return String.valueOf(body);
    }
}