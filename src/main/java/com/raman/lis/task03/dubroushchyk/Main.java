package com.raman.lis.task03.dubroushchyk;

import com.raman.lis.task03.dubroushchyk.Enum.Audi.*;

public class Main {

    public static void main(String[] args) {
        ServiceColor serviceColor = new ServiceColor();
        ServiceWheels serviceWheels = new ServiceWheels();
        ServiceOptional serviceOptional = new ServiceOptional();
        CarFactory carFactoryAudi = new CarFactoryAudi(serviceColor, serviceWheels, serviceOptional);
        CarFactory carFactoryBmw = new CarFactoryBmw(serviceColor, serviceWheels, serviceOptional);
        CarFactory carFactoryMercedes = new CarFactoryMercedes(serviceColor, serviceWheels, serviceOptional);
        CarSalon salon = new CarSalon();
        carFactoryAudi.storageInfo();
        carFactoryBmw.storageInfo();
        carFactoryMercedes.storageInfo();
        Car car1 = salon.createCarOnCarFactory(carFactoryAudi, CarColorAudi.PINK, CarModelAudi.A6,
                2018, CarSizeWheelsAudi.MIDDLE, CarEngineVolumeAudi.MIDDLE_VOLUME);

        Car car5 = salon.createCarOnCarFactory(carFactoryAudi, CarColorAudi.PINK, CarModelAudi.A8, 2015,
                CarSizeWheelsAudi.HIGH, CarEngineVolumeAudi.HIGH_VOLUME);
        car1.Info();
        System.out.println("");
        car5.Info();
        salon.changeServiceColor(serviceColor, car1, "Yellow");
        System.out.println("");
        car1.Info();
        carFactoryAudi.storageInfo();
        Car car6 = carFactoryAudi.getCarFromStorage(2);
        carFactoryAudi.storageInfo();
    }
}
