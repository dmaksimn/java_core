package com.raman.lis.task03.me.service.impl;

import com.raman.lis.task03.me.exception.ColorException;
import com.raman.lis.task03.me.model.car.AbstractCar;
import com.raman.lis.task03.me.model.color.CarColor;
import com.raman.lis.task03.me.service.Service;

public class ColorServiceImpl implements Service<CarColor> {

    @Override
    public AbstractCar changeCar(AbstractCar car, CarColor color) {
        try {
            car.changeColor(color);
        } catch (ColorException e) {
            System.out.println(e.getMessage());
        }
        return car;
    }

}
