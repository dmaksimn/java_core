package com.Task.Task07.CarConstructor;

import com.Task.Task07.CarProperties.*;

public class CarAudi extends Car {

    public CarAudi(
            CarColor color, CarBody body, CarModel model, int year, CarSizeWheels sizeWheels, CarEngineVolume engineVolume) {
        super(color.getColor(), body.getBody(), model.getModel(), year, Integer.parseInt(sizeWheels.getSizeWheels()), engineVolume.getVolume());
    }
}