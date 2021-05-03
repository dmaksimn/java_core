package com.Task.Task07.CarFabric;

import com.Task.Task07.CarConstructor.Car;
import com.Task.Task07.CarConstructor.CarAudi;
import com.Task.Task07.CarProperties.*;
import com.Task.Task07.CarService.ServiceChangeColor;
import com.Task.Task07.CarService.ServiceChangeWheel;
import com.Task.Task07.CarService.ServiceOptions;

import java.util.ArrayList;
import java.util.List;

public class FabricAudi extends CarFabric {

    List<Car> carStorageAudi = new ArrayList<>();

    public FabricAudi(ServiceChangeColor serviceColor, ServiceChangeWheel serviceChangeWheel
            , ServiceOptions serviceOptions) {
        super(serviceColor, serviceChangeWheel, serviceOptions);
        carStorageAudi.add(new CarAudi(CarColor.BLACK, CarBody.COUPE, CarModel.A6, 2011, CarSizeWheels.THIRTY_TWO, CarEngineVolume.TWO_DOT_ZERO));
        carStorageAudi.add(new CarAudi(CarColor.WHITE, CarBody.HATCHBACK, CarModel.A5, 2012, CarSizeWheels.TWENTY, CarEngineVolume.ZERO_DOT_EIGHTH));
    }


    public void storageInfo() {
        System.out.println("Car on Audi fabric storage");
        if (carStorageAudi.size() >= 1) {
            System.out.println(carStorageAudi);
        } else {
            System.out.println("Storage is empty");
        }
    }

    public Car createCar(CarColor color, CarBody body, CarModel model, int year, CarSizeWheels sizeWheels, CarEngineVolume engineVolume) throws IllegalArgumentException {
        if (!sizeWheels.toString("Low", "Medium", "Large", "BigLarge", "Monster", "BigFoot").equals(sizeWheels.getSizeWheels())) {
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
            for (int i = 0; i < carStorageAudi.size(); i++) {
                if (carStorageAudi.get(i).compareCarInStorage(color, body, model, year, sizeWheels, engineVolume)) {
                    Car car = carStorageAudi.get(i);
                    carStorageAudi.remove(i);
                    return car;
                }
            }
            return new CarAudi(color, body, model, year, sizeWheels, engineVolume);
        }
    }

    public Car getCarFromStorage(int number) {
        if (number > carStorageAudi.size() || number <= 0) {
            System.out.println("No car this number or storage is empty");
            return null;
        }
        Car car = carStorageAudi.get(number - 1);
        carStorageAudi.remove(number - 1);
        return car;
    }
}