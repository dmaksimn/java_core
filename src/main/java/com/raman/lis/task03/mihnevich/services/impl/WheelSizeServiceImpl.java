package com.raman.lis.task03.mihnevich.services.impl;

import com.raman.lis.task03.mihnevich.cars.Car;
import com.raman.lis.task03.mihnevich.services.WheelSizeService;

public class WheelSizeServiceImpl extends WheelSizeService {
    @Override
    public void changeWheelSize(Car car, int wheelSize) {
        if (car != null) {
            car.setWheelSize(wheelSize);
        }
    }
}
