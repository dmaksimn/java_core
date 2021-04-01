package com.raman.lis.task03.dubroushchyk;

import com.raman.lis.task03.dubroushchyk.Enum.Audi.*;

public class CarSalon {

    Car createCarOnCarFactory(CarFactory carFactory, CarColorAudi color, CarModelAudi model, int yearProduction,
                              CarSizeWheelsAudi sizeWheels, CarEngineVolumeAudi engineVolume) {

            return carFactory.createCar(color.getColor(), model.getModel(), yearProduction,
                    sizeWheels.getSizeWheels(), engineVolume.getVolume());
    }

    Car getCarFromCarFactoryStorage(CarFactory carFactory, int number) {
        return carFactory.getCarFromStorage(number);
    }

    void changeServiceColor(ServiceColor serviceColor,Car car, String color) {
        serviceColor.changeCarColorInCar(car, color);
    }

    void changeServiceWheels(ServiceWheels serviceWheels, Car car, int wheels) {
        serviceWheels.changeCarWheelsInCar(car, wheels);
    }

    void addServiceOptional(ServiceOptional serviceOptional, Car car, String string) {
        serviceOptional.addOptionalInCar(car, string);
    }

    void removeServiceOptional(ServiceOptional serviceOptional, Car car, String string) {
        serviceOptional.removeOptionalInCar(car, string);
    }
}
