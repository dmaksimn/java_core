package com.raman.lis.task03.popov;

import com.raman.lis.task03.popov.cars.Car;
import com.raman.lis.task03.popov.factory.AutoFactoryAudi;
import com.raman.lis.task03.popov.factory.AutoFactoryBMV;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CarSalon{
    AutoFactoryBMV autofactoryBMV = new AutoFactoryBMV();
    AutoFactoryAudi autoFactoryAudi = new AutoFactoryAudi();
    Car car;

    Car createCar(String colour,String model, int sizeWheels, int volumeEngine, String option, String date){
        return autofactoryBMV.createCar(colour,sizeWheels,volumeEngine,option,date);
    }

    Car createCar(String colour,String model, int sizeWheels, int volumeEngine, String date) {
        return autofactoryBMV.createCar(colour, sizeWheels, volumeEngine, date);
    }

    Car createCar(String colour, int sizeWheels, int volumeEngine,
                  String typeCar, String date){
        return autoFactoryAudi.createCar(colour,sizeWheels,volumeEngine,typeCar,date);
    }

}
