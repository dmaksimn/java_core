package com.Task.Task07.carConstructor;

import com.Task.Task07.carProperties.*;

public class CarOpel extends Car {

    public CarOpel(
            CarColor color, CarBody body, CarModel model, int year, CarSizeWheels sizeWheels, CarEngineVolume engineVolume) {
        super(color.getColor(), body.getBody(), model.getModel(), year, Integer.parseInt(sizeWheels.getSizeWheels()),  engineVolume.getVolume());
    }
}