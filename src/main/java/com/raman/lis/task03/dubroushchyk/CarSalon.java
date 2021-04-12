package com.raman.lis.task03.dubroushchyk;

//звёздочка потому-что мне все Enum константы из этих package надо
import com.raman.lis.task03.dubroushchyk.Enum.Audi.*;
import com.raman.lis.task03.dubroushchyk.Enum.Bmw.*;
import com.raman.lis.task03.dubroushchyk.Enum.CarOptions;
import com.raman.lis.task03.dubroushchyk.Enum.EServiceColor;
import com.raman.lis.task03.dubroushchyk.Enum.Mercedes.*;

public class CarSalon {

    private int currentYear = 2021;
    private int minYearForCreateCar = currentYear -10;

    Car createCarOnCarFactory(CarFactoryAudi carFactoryAudi, CarColorAudi color,
                              CarModelAudi model, int yearProduction, CarSizeWheelsAudi sizeWheels,
                              CarEngineVolumeAudi engineVolume) throws IllegalArgumentException{
        if (yearProduction > currentYear || yearProduction < minYearForCreateCar) {
            throw new IllegalArgumentException("Illegal value yearProduction for carFactoryAudi in class CarSalon");
        }
            return carFactoryAudi.createCar(color, model, yearProduction, sizeWheels, engineVolume);
    }

    Car createCarOnCarFactory(CarFactoryBmw carFactoryBmw, CarColorBmw color, CarModelBmw model,
                              int yearProduction, CarSizeWheelsBmw sizeWheels,
                              CarEngineVolumeBmw engineVolume) throws IllegalArgumentException {
        if (yearProduction > currentYear || yearProduction < minYearForCreateCar) {
            throw new IllegalArgumentException("Illegal value yearProduction for carFactoryBMW in class CarSalon");
        }
            return carFactoryBmw.createCar(color, model, yearProduction, sizeWheels, engineVolume);
    }

    Car createCarOnCarFactory(CarFactoryMercedes carFactoryMercedes, CarColorMercedes color,
                              CarModelMercedes model, int yearProduction, CarSizeWheelsMercedes sizeWheels,
                              CarEngineVolumeMercedes engineVolume) throws IllegalArgumentException {
        if (yearProduction > currentYear || yearProduction < minYearForCreateCar) {
            throw new IllegalArgumentException("Illegal value yearProduction for carFactoryMercedes in class CarSalon");
        }
        return carFactoryMercedes.createCar(color, model, yearProduction, sizeWheels, engineVolume);
    }

    Car getCarFromCarFactoryStorageNumberAuto(CarFactory carFactory, int number) {
        return carFactory.getCarFromStorageNumberAuto(number);
    }

    void changeServiceColor(ServiceColor serviceColor,Car car, EServiceColor color) {
        serviceColor.changeCarColorInCar(car, color);
    }

    void changeServiceWheels(ServiceWheels serviceWheels, Car car, int wheels) {
        serviceWheels.changeCarWheelsInCar(car, wheels);
    }

    void addServiceOptional(ServiceOptional serviceOptional, Car car, CarOptions options) {
        serviceOptional.addOptionalInCar(car, options);
    }

    void removeServiceOptional(ServiceOptional serviceOptional, Car car, CarOptions options) {
        serviceOptional.removeOptionalInCar(car, options);
    }
}
