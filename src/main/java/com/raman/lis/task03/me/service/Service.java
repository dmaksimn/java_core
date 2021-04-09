package com.raman.lis.task03.me.service;

import com.raman.lis.task03.me.model.car.AbstractCar;

public interface Service<T> {

    AbstractCar changeCar(AbstractCar car, T o);

}
