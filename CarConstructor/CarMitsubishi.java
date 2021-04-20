package com.Task.Task07.CarConstructor;

import com.Task.Task07.CarEnum.*;

public class CarMitsubishi extends Car {

    public CarMitsubishi(
            CarColor color, CarBody body, CarModel model, int year, CarSizeWheels sizeWheels, CarEngineVolume engineVolume) {
        super(color.getColor(), body.getBody(), model.getModel(), year, Integer.parseInt(sizeWheels.getSizeWheels()), Double.parseDouble(engineVolume.getVolume()));
    }
}