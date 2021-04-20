package com.Task.Task07;

import com.Task.Task07.CarConstructor.Car;
import com.Task.Task07.CarEnum.*;
import com.Task.Task07.CarFabric.CarFabric;
import com.Task.Task07.CarFabric.FabricAudi;
import com.Task.Task07.CarFabric.FabricMitsubishi;
import com.Task.Task07.CarFabric.FabricOpel;
import com.Task.Task07.CarService.ServiceChangeColor;
import com.Task.Task07.CarService.ServiceOptions;
import com.Task.Task07.CarService.ServiceChangeWheel;
import com.Task.Task07.WorkConsole.WorkConsole;

import java.util.Scanner;

public class CarMain {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String... args) {

        ServiceChangeColor serviceColor = new ServiceChangeColor();
        ServiceChangeWheel serviceChangeWheel = new ServiceChangeWheel();
        ServiceOptions serviceOptions = new ServiceOptions();

        CarFabric FabricAudi = new FabricAudi(serviceColor, serviceChangeWheel, serviceOptions);
        CarFabric FabricMitsubishi = new FabricMitsubishi(serviceColor, serviceChangeWheel, serviceOptions);
        CarFabric FabricOpel = new FabricOpel(serviceColor, serviceChangeWheel, serviceOptions);

        CarSalon salon = new CarSalon();

        Car car1 = salon.createCarOnFabric(FabricAudi, CarColor.DIAMOND_SKY, CarBody.Coupe, CarModel.A6, 2010, CarSizeWheels.BigFoot, CarEngineVolume.Big);
        Car car2 = salon.createCarOnFabric(FabricMitsubishi, CarColor.BLUE, CarBody.Hatchback, CarModel.Colt, 2011, CarSizeWheels.Large, CarEngineVolume.Medium_Volume);
        Car car3 = salon.createCarOnFabric(FabricOpel, CarColor.GREEN, CarBody.Pickup, CarModel.Zafira, 2012, CarSizeWheels.BigLarge, CarEngineVolume.RaceCar);

        car1.carInfo();
        FabricOpel.printPropertyCar();
        FabricMitsubishi.printPropertyCar();
        FabricAudi.printPropertyCar();
        System.out.println("");
        car2.carInfo();
        salon.changeColorCarInService(serviceColor, car1, CarColor.DIAMOND_SKY.getColor());
        System.out.println("");
        car1.carInfo();
        FabricAudi.storageInfo();
        Car car4= FabricOpel.getCarFromStorage(2);
        FabricOpel.storageInfo();

        WorkConsole workConsole = new WorkConsole();
        workConsole.startProgram();
            }
        }