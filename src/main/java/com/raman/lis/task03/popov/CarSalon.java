package com.raman.lis.task03.popov;

import com.raman.lis.task03.popov.cars.CarAudi;
import com.raman.lis.task03.popov.cars.CarBMV;
import com.raman.lis.task03.popov.cars.CarFerrari;
import com.raman.lis.task03.popov.factory.AutoFactoryAudi;
import com.raman.lis.task03.popov.factory.AutoFactoryBMV;
import com.raman.lis.task03.popov.factory.AutoFactoryFerrari;

public class CarSalon {
    AutoFactoryBMV autofactoryBMV = new AutoFactoryBMV();
    AutoFactoryAudi autoFactoryAudi = new AutoFactoryAudi();
    AutoFactoryFerrari autoFactoryFerrari = new AutoFactoryFerrari();


    CarBMV createCarBMV(String colour, int sizeWheels, int volumeEngine,
                        String option, String date) {
        return autofactoryBMV.createCar(colour, sizeWheels, volumeEngine, option, date);
    }

    CarBMV createCarBMV(String colour, int sizeWheels, int volumeEngine, String date) {
        return autofactoryBMV.createCar(colour, sizeWheels, volumeEngine, date);
    }

    CarAudi createCarAudi(String colour, int sizeWheels, int volumeEngine,
                          String date, String typeCar) {
        return autoFactoryAudi.createCar(colour, sizeWheels, volumeEngine, date, typeCar);
    }

    CarAudi createCarAudi(String colour, int sizeWheels, int volumeEngine,
                          String option, String date, String typeCar) {
        return autoFactoryAudi.createCar(colour, sizeWheels, volumeEngine, option, date, typeCar);
    }

    CarFerrari createCarFerrari(String colour, int sizeWheels, int volumeEngine,
                                String option, String date) {
        return autoFactoryFerrari.createCar(colour, sizeWheels, volumeEngine, option, date);
    }

    CarFerrari createCarFerrari(String colour, int sizeWheels, int volumeEngine, String date) {
        return autoFactoryFerrari.createCar(colour, sizeWheels, volumeEngine, date);
    }

}
