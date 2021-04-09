package com.raman.lis.task03.me.service.impl;

import com.raman.lis.task03.me.model.WheelSize;
import com.raman.lis.task03.me.model.car.AbstractCar;
import com.raman.lis.task03.me.service.Service;

public class WheelServiceImpl implements Service<WheelSize> {

    @Override
    public AbstractCar changeCar(AbstractCar car, WheelSize wheelSize) {
        car.setWheelSize(wheelSize);
        return car;
    }

}
