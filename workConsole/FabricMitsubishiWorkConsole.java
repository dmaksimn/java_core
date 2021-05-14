package com.Task.Task07.workConsole;

import com.Task.Task07.carConstructor.Car;
import com.Task.Task05.PrintConsoleCarProperties;
import com.Task.Task07.carProperties.*;
import com.Task.Task07.carFabric.FabricMitsubishi;
import com.Task.Task07.CarMain;

public class FabricMitsubishiWorkConsole {
    PrintConsoleCarProperties printConsoleCarProperties = new PrintConsoleCarProperties();
    FabricMitsubishi fabricMitsubishi;

    public FabricMitsubishiWorkConsole(FabricMitsubishi fabricMitsubishi) {
        this.fabricMitsubishi = fabricMitsubishi;
    }

    public Car carCreateConsole() {
        fabricMitsubishi.printPropertyCar();
        CarColor carColor = null;
        while (carColor == null) {
            String color = CarMain.scanner.nextLine();
            try {
                carColor = CarColor.valueOf(color.toUpperCase().trim());
            } catch (IllegalArgumentException e) {
                System.out.println("No such color choose another from the list");
            }
        }
        fabricMitsubishi.printPropertyCar();
        CarBody carBody = null;
        while (carBody == null) {
            String body = CarMain.scanner.nextLine();
            try {
                carBody = CarBody.valueOf(body.toUpperCase().trim());
            } catch (IllegalArgumentException e) {
                System.out.println("No such body choose another from the list");
            }
        }
        fabricMitsubishi.printPropertyCar();
        CarEngineVolume carEngineVolume = null;
        while (carEngineVolume == null) {
            String volume = CarMain.scanner.nextLine();
            try {
                carEngineVolume = CarEngineVolume.valueOf(volume.toUpperCase().trim());
            } catch (IllegalArgumentException e) {
                System.out.println("No such engine volume choose another from the list");
            }
        }
        fabricMitsubishi.printPropertyCar();
        CarModel carModel = null;
        while (carModel == null) {
            String model = CarMain.scanner.nextLine();
            try {
                carModel = CarModel.valueOf(model.toUpperCase().trim());
            } catch (IllegalArgumentException e) {
                System.out.println("No such car model choose another from the list");
            }
        }
        fabricMitsubishi.printPropertyCar();
        CarSizeWheels carSizeWheels = null;
        while (carSizeWheels == null) {
            String sizeWheels = CarMain.scanner.nextLine();
            try {
                carSizeWheels = CarSizeWheels.valueOf(sizeWheels.toUpperCase().trim());
            } catch (IllegalArgumentException e) {
                System.out.println("No such size wheels choose another from the list");
            }
        }

        return fabricMitsubishi.createCar(carColor, carBody, carModel, 2021, carSizeWheels, carEngineVolume);
    }
}