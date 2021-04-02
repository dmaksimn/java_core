package com.raman.lis.task03.popov.service;

import com.raman.lis.task03.popov.cars.Car;

public class ServiceCustomizationOption extends Service {

    public void addOption(Car car, String option) {
        car.getOption().add(option);
    }

    public void removeOption(Car car, String option) {
        car.getOption().remove(option);
    }
}

