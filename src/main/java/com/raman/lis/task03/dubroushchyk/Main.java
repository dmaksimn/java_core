package com.raman.lis.task03.dubroushchyk;

//звёздочка потому-что мне все Enum константы из этих package надо
import com.raman.lis.task03.dubroushchyk.Enum.Audi.*;
import com.raman.lis.task03.dubroushchyk.Enum.Bmw.*;
import com.raman.lis.task03.dubroushchyk.Enum.CarOptions;
import com.raman.lis.task03.dubroushchyk.Enum.Mercedes.*;

public class Main {

    public static void main(String[] args) {
        ServiceColor serviceColor = new ServiceColor();
        ServiceWheels serviceWheels = new ServiceWheels();
        ServiceOptional serviceOptional = new ServiceOptional();
        CarFactoryAudi carFactoryAudi = new CarFactoryAudi(serviceColor, serviceWheels, serviceOptional);
        CarFactoryBmw carFactoryBmw = new CarFactoryBmw(serviceColor, serviceWheels, serviceOptional);
        CarFactoryMercedes carFactoryMercedes = new CarFactoryMercedes(serviceColor, serviceWheels, serviceOptional);
        CarSalon salon = new CarSalon();
        carFactoryAudi.storageInfo();
        carFactoryBmw.storageInfo();
        carFactoryMercedes.storageInfo();
        Car car1 = salon.createCarOnCarFactory(carFactoryAudi, CarColorAudi.PINK, CarModelAudi.A6,
                2020, CarSizeWheelsAudi.MIDDLE, CarEngineVolumeAudi.MIDDLE_VOLUME);
        Car car5 = salon.createCarOnCarFactory(carFactoryAudi, CarColorAudi.WHITE, CarModelAudi.A8, 2015,
                CarSizeWheelsAudi.HIGH, CarEngineVolumeAudi.HIGH_VOLUME);
        car1.info();
        car5.info();
        carFactoryAudi.storageInfo();
        Car car6 = carFactoryAudi.getCarFromStorageNumberAuto(2);
        Car car7 = carFactoryAudi.getCarFromStorageNumberAuto(1);
        carFactoryAudi.storageInfo();
        carFactoryAudi.printPropertyCar();
        carFactoryBmw.printPropertyCar();
        Car car11 = salon.createCarOnCarFactory(carFactoryBmw, CarColorBmw.RED, CarModelBmw.M4,
                2020, CarSizeWheelsBmw.HIGH, CarEngineVolumeBmw.HIGH_VOLUME);
        car11.info();
        serviceWheels.changeCarWheelsInCar(car11, 25);
        car11.info();
        serviceOptional.addOptionalInCar(car11, CarOptions.HEATERMIRROR);
        serviceOptional.removeOptionalInCar(car11, CarOptions.BIGSPOILER);
        car11.info();
    }
}
