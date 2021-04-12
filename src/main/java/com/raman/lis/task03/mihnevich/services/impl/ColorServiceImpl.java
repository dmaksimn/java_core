package com.raman.lis.task03.mihnevich.services.impl;

import com.raman.lis.task03.mihnevich.cars.Car;
import com.raman.lis.task03.mihnevich.services.ColorService;

public class ColorServiceImpl extends ColorService {
    @Override
    public void changeColor(Car car, String color) {
        if (car != null) {
            car.setColor(color);
        }
    }
}
