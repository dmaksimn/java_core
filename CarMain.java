package com.Task.Task07;

import com.Task.Task07.CarConstructor.Car;
import com.Task.Task07.CarProperties.*;
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

        Car car1 = salon.createCarOnFabric(FabricAudi, CarColor.DIAMOND_SKY, CarBody.COUPE, CarModel.A6, 2010, CarSizeWheels.THIRTY_TWO, CarEngineVolume.TWO_DOT_ZERO);
        Car car2 = salon.createCarOnFabric(FabricMitsubishi, CarColor.BLUE, CarBody.HATCHBACK, CarModel.COLT, 2011, CarSizeWheels.SEVENTEEN, CarEngineVolume.ONE_DOT_SIX);
        Car car3 = salon.createCarOnFabric(FabricOpel, CarColor.GREEN, CarBody.PICKUP, CarModel.ZAFIRA, 2012, CarSizeWheels.TWENTY, CarEngineVolume.ONE_DOT_THREE);

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
        Car car4 = FabricOpel.getCarFromStorage(2);
        FabricOpel.storageInfo();
        Car car5 = FabricMitsubishi.createCar(CarColor.BLACK, CarBody.SUV, CarModel.COLT, 2008, CarSizeWheels.FIFTEEN, CarEngineVolume.ONE_DOT_THREE);
        car5.addOption(CarOption.CRUISE_CONTROL.getOption());
        car5.carInfo();
        car3.setSizeWheel(20);
        car3.carInfo();
        WorkConsole workConsole = new WorkConsole();
        workConsole.startProgram();
    }
}