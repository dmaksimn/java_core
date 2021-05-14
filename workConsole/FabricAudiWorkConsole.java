package com.Task.Task07.workConsole;

import com.Task.Task07.carConstructor.Car;
import com.Task.Task05.PrintConsoleCarProperties;
import com.Task.Task07.carProperties.*;
import com.Task.Task07.carFabric.FabricAudi;
import com.Task.Task07.CarMain;

public class FabricAudiWorkConsole {
    PrintConsoleCarProperties printConsoleCarProperties = new PrintConsoleCarProperties();
    FabricAudi fabricAudi;
        public FabricAudiWorkConsole(FabricAudi fabricAudi) {
            this.fabricAudi = fabricAudi;
        }

        public Car carCreateConsole() {
            fabricAudi.printPropertyCar();
            CarColor carColor = null;
            while (carColor == null) {
                String color = CarMain.scanner.nextLine();
                try {
                    carColor = CarColor.valueOf(color.toUpperCase().trim());
                } catch (IllegalArgumentException e) {
                    System.out.println("No such color choose another from the list");
                }
            }
            fabricAudi.printPropertyCar();
            CarBody carBody = null;
            while (carBody == null) {
            String body = CarMain.scanner.nextLine();
            try {
                carBody = CarBody.valueOf(body.toUpperCase().trim());
            } catch (IllegalArgumentException e) {
                System.out.println("No such body choose another from the list");
            }
        }
            fabricAudi.printPropertyCar();
            CarEngineVolume carEngineVolume = null;
            while (carEngineVolume == null) {
            String volume = CarMain.scanner.nextLine();
            try {
                carEngineVolume = CarEngineVolume.valueOf(volume.toUpperCase().trim());
            } catch (IllegalArgumentException e) {
                System.out.println("No such engine volume choose another from the list");
            }
        }
            fabricAudi.printPropertyCar();
            CarModel carModel = null;
            while (carModel == null) {
            String model = CarMain.scanner.nextLine();
            try {
                carModel = CarModel.valueOf(model.toUpperCase().trim());
            } catch (IllegalArgumentException e) {
                System.out.println("No such car model choose another from the list");
            }
        }
            fabricAudi.printPropertyCar();
            CarSizeWheels carSizeWheels = null;
            while (carSizeWheels == null) {
            String sizeWheels = CarMain.scanner.nextLine();
            try {
                carSizeWheels = CarSizeWheels.valueOf(sizeWheels.toUpperCase().trim());
            } catch (IllegalArgumentException e) {
                System.out.println("No such size wheels choose another from the list");
            }
        }

        return fabricAudi.createCar(carColor, carBody, carModel, 2021, carSizeWheels, carEngineVolume);
    }
}