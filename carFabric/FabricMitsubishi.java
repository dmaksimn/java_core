package com.Task.Task07.carFabric;

import com.Task.Task07.carConstructor.Car;
import com.Task.Task07.carConstructor.CarMitsubishi;
import com.Task.Task07.carProperties.*;
import com.Task.Task07.CarService.ServiceChangeColor;
import com.Task.Task07.CarService.ServiceOptions;
import com.Task.Task07.CarService.ServiceChangeWheel;

import java.util.ArrayList;
import java.util.List;

public class FabricMitsubishi extends CarFabric {

    List<Car> carStorageMitsubishi = new ArrayList<>();

    public FabricMitsubishi(ServiceChangeColor serviceColor, ServiceChangeWheel serviceChangeWheel
            , ServiceOptions serviceOptions) {
        super(serviceColor, serviceChangeWheel, serviceOptions);
        carStorageMitsubishi.add(new CarMitsubishi(CarColor.BLUE, CarBody.SUV, CarModel.LANCER, 2013, CarSizeWheels.FIFTEEN, CarEngineVolume.ONE_DOT_EIGHTH));
        carStorageMitsubishi.add(new CarMitsubishi(CarColor.WHITE, CarBody.PICKUP, CarModel.ASX, 2014, CarSizeWheels.SEVENTEEN, CarEngineVolume.TWO_DOT_FIVE));
    }

    public void storageInfo() {
        System.out.println("Car on Mitsubishi fabric storage");
        if (carStorageMitsubishi.size() >= 1) {
            System.out.println(carStorageMitsubishi);
        } else {
            System.out.println("Storage is empty");
        }
    }

    public Car createCar (CarColor color, CarBody body, CarModel model, int year, CarSizeWheels sizeWheels, CarEngineVolume engineVolume)  throws IllegalArgumentException {
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
            for (int i = 0; i < carStorageMitsubishi.size(); i++) {
                if (carStorageMitsubishi.get(i).comparePropertiesSelectCarWithCarInStorage(color, body, model, year, sizeWheels, engineVolume)) {
                    Car car = carStorageMitsubishi.get(i);
                    carStorageMitsubishi.remove(i);
                    return car;
                }
            }
            return new CarMitsubishi(color, body, model, year, sizeWheels, engineVolume);
        }
    }

    public Car getCarFromStorage(int number) {
        if (number > carStorageMitsubishi.size() || number <= 0) {
            System.out.println("No car this number or storage is empty");
            return null;
        }
        Car car = carStorageMitsubishi.get(number - 1);
        carStorageMitsubishi.remove(number - 1);
        return car;
    }
}