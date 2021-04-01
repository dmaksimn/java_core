package com.raman.lis.task03.popov.service;

import com.raman.lis.task03.popov.cars.Car;

public class ServiceCustomizationColor extends Service implements IndustryService {
    void changeColor(Car car, String colour) {
        car.setColour(colour);
    }
}
