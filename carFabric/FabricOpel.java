package com.Task.Task07.carFabric;

import com.Task.Task07.carConstructor.Car;
import com.Task.Task07.carConstructor.CarOpel;
import com.Task.Task07.carProperties.*;
import com.Task.Task07.CarService.ServiceChangeColor;
import com.Task.Task07.CarService.ServiceOptions;
import com.Task.Task07.CarService.ServiceChangeWheel;

import java.util.ArrayList;
import java.util.List;

public class FabricOpel extends CarFabric {

    List<Car> carStorageOpel = new ArrayList<>();

    public FabricOpel(ServiceChangeColor serviceColor, ServiceChangeWheel serviceChangeWheel
            , ServiceOptions serviceOptions) {
        super(serviceColor, serviceChangeWheel, serviceOptions);
        carStorageOpel.add(new CarOpel(CarColor.GREEN, CarBody.SEDAN, CarModel.CORSA, 2015, CarSizeWheels.FOURTEEN, CarEngineVolume.TWO_DOT_ZERO));
        carStorageOpel.add(new CarOpel(CarColor.RED, CarBody.LIMOUSINE, CarModel.ZAFIRA, 2016, CarSizeWheels.TWENTY, CarEngineVolume.THREE_DOT_FIVE));
    }

    public void storageInfo() {
        System.out.println("Car on Opel fabric storage");
        if (carStorageOpel.size() >= 1) {
            System.out.println(carStorageOpel);
        } else {
            System.out.println("Storage is empty");
        }
    }

    public Car createCar(CarColor color, CarBody body, CarModel model, int year, CarSizeWheels sizeWheels, CarEngineVolume engineVolume) throws IllegalArgumentException {
        if (!sizeWheels.toString().equals(sizeWheels.getSizeWheels())) {
            throw new IllegalArgumentException("\tInvalid size wheels\n+" +
                    "\tAvailable size wheels:\n+" +
                    "\t14'\n+" +
                    "\t15'\n+" +
                    "\t17'\n+" +
                    "\t20'\n+" +
                    "\t25'\n+" +
                    "\t32'\n+" +
                    "\tPlease try again\n ");
        } else {
            for (int i = 0; i < carStorageOpel.size(); i++) {
                if (carStorageOpel.get(i).comparePropertiesSelectCarWithCarInStorage(color, body, model, year, sizeWheels, engineVolume)) {
                    Car car = carStorageOpel.get(i);
                    carStorageOpel.remove(i);
                    return car;
                }
            }
            return new CarOpel(color, body, model, year, sizeWheels, engineVolume);
        }
    }

    public Car getCarFromStorage(int number) {
        if (number > carStorageOpel.size() || number <= 0) {
            System.out.println("No car this number or storage is empty");
            return null;
        }
        Car car = carStorageOpel.get(number - 1);
        carStorageOpel.remove(number - 1);
        return car;
    }
}