package com.raman.lis.task03.popov.service;

import com.raman.lis.task03.popov.cars.Car;

public class ServiceCustomizationOption extends Service {

    void addOption(Car car, String option){
        car.getOption().add(option);
    }

    void removeOption(Car car, String option){
        car.getOption().remove(option);
    }
}

