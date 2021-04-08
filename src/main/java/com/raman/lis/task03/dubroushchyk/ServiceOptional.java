package com.raman.lis.task03.dubroushchyk;

import com.raman.lis.task03.dubroushchyk.Enum.CarOptions;

public class ServiceOptional extends CarService {

    public void addOptionalInCar(Car car, CarOptions options) {
        car.addOptional(options.getOptions());
    }

    public void removeOptionalInCar(Car car, CarOptions options) {
        car.removeOptional(options.getOptions());
    }
}
