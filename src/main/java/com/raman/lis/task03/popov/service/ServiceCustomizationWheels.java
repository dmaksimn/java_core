package com.raman.lis.task03.popov.service;

import com.raman.lis.task03.popov.cars.Car;

public class ServiceCustomizationWheels extends Service {
    public void changeSizeWheels(Car car, int sizeWheels) {
        car.setSizeWheels(sizeWheels);
    }
}
