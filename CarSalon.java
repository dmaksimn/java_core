package com.Task.Task07;

import com.Task.Task07.CarConstructor.Car;
import com.Task.Task07.CarEnum.*;
import com.Task.Task07.CarFabric.CarFabric;
import com.Task.Task07.CarService.ServiceChangeColor;
import com.Task.Task07.CarService.ServiceOptions;
import com.Task.Task07.CarService.ServiceChangeWheel;

public class CarSalon {

    private int currentYear = 2021;
    private int minYearForProduction = currentYear - 16;

    Car createCarOnFabric(CarFabric carFabric, CarColor color, CarBody body, CarModel model, int year, CarSizeWheels sizeWheels, CarEngineVolume engineVolume) throws IllegalArgumentException {
        if (year > currentYear || year < minYearForProduction) {
            throw new IllegalArgumentException("Car make create from 2005 to 2021");
        }
        return carFabric.createCar(color, body, model, year, sizeWheels, engineVolume);
    }

    Car getCarFromCarFabricStorage(CarFabric carFabric, int number) {
        return carFabric.getCarFromStorage(number);
    }

    void changeServiceWheels(ServiceChangeWheel serviceChangeWheel, Car car, int wheels) {
        serviceChangeWheel.changeServiceWheels(car, wheels);
    }

    void changeColorCarInService(ServiceChangeColor serviceColor, Car car, String color) {
        serviceColor.changeCarColorInCar(car, color);
    }

    void addServiceOption(ServiceOptions serviceOptions, Car car, CarOption option) {
        serviceOptions.addOptionCar(car, option);
    }

    void deleteServiceOption(ServiceOptions serviceOptions, Car car, CarOption option) {
        serviceOptions.deleteOptionCar(car, option);
    }
}