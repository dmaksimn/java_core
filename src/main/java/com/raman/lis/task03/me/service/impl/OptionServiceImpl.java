package com.raman.lis.task03.me.service.impl;

import com.raman.lis.task03.me.model.car.AbstractCar;
import com.raman.lis.task03.me.service.Service;

import java.util.HashSet;

public class OptionServiceImpl implements Service<HashSet<String>> {

    @Override
    public AbstractCar changeCar(AbstractCar car, HashSet<String> options) {
        car.setOptions(options);
        return car;
    }

    public AbstractCar addOption(AbstractCar car, String option) {
        car.addOption(option);
        return car;
    }

    public AbstractCar removeOption(AbstractCar car, String option) {
        if (!car.removeOption(option)) {
            System.out.println("Can not remove absent option");
        }
        return car;
    }

}
