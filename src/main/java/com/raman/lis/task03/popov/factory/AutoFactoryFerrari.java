package com.raman.lis.task03.popov.factory;

import com.raman.lis.task03.popov.cars.CarFerrari;

public class AutoFactoryFerrari extends AutoFactory implements Print {
    AutoFactoryAudi autoFactoryAudi = new AutoFactoryAudi();

    public CarFerrari createCar(String colour, int sizeWheels, int volumeEngine,
                                String date) {
        return new CarFerrari(colour, sizeWheels, volumeEngine, date);
    }

    public CarFerrari createCar(String colour, int sizeWheels, int volumeEngine,
                                String option, String date) {
        return new CarFerrari(colour, sizeWheels, volumeEngine, option, date);
    }

    public void printList(String nameList) {
        autoFactoryAudi.printList(nameList);
    }
}
