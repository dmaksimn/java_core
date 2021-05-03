package com.Task.Task07.WorkConsole;

import com.Task.Task07.*;
import com.Task.Task07.CarConstructor.Car;
import com.Task.Task07.CarFabric.FabricAudi;
import com.Task.Task07.CarFabric.FabricMitsubishi;
import com.Task.Task07.CarFabric.FabricOpel;
import com.Task.Task07.CarService.ServiceChangeColor;
import com.Task.Task07.CarService.ServiceOptions;
import com.Task.Task07.CarService.ServiceChangeWheel;

public class WorkConsole {

    ServiceChangeColor serviceColor = new ServiceChangeColor();
    ServiceChangeWheel serviceChangeWheel = new ServiceChangeWheel();
    ServiceOptions serviceOptions = new ServiceOptions();
    FabricAudi fabricAudi = new FabricAudi(serviceColor, serviceChangeWheel, serviceOptions);
    FabricMitsubishi fabricMitsubishi = new FabricMitsubishi(serviceColor, serviceChangeWheel, serviceOptions);
    FabricOpel fabricOpel = new FabricOpel(serviceColor, serviceChangeWheel, serviceOptions);
    FabricAudiWorkConsole fabricAudiWorkConsole = new FabricAudiWorkConsole(fabricAudi);
    FabricMitsubishiWorkConsole fabricMitsubishiWorkConsole = new FabricMitsubishiWorkConsole(fabricMitsubishi);
    FabricOpelWorkConsole fabricOpelWorkConsole = new FabricOpelWorkConsole(fabricOpel);

    void carModelMenu() {
        while (true) {
            System.out.println("Select car model\n" +
                    "\t 1. Audi\n" +
                    "\t 2. Mitsubishi\n" +
                    "\t 3. Opel\n" +
                    "\t 4. Back\n" +
                    "\t 5. Exit program\n" +
                    "\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n" +
                    "Select your choice");
            String modelMenu = CarMain.scanner.nextLine();
            switch (modelMenu) {
                case "1":
                    Car carAudi = fabricAudiWorkConsole.carCreateConsole();
                    carAudi.carInfo();
                    break;
                case "2":
                    Car carMitsubishi = fabricMitsubishiWorkConsole.carCreateConsole();
                    carMitsubishi.carInfo();
                    break;
                case "3":
                    Car carOpel = fabricOpelWorkConsole.carCreateConsole();
                    carOpel.carInfo();
                    break;
                case "4":
                    return;
                case "5":
                    System.exit(0);
                default:
                    System.out.println("Invalid value entered");
            }
        }
    }

    void carStorage() {
        while (true) {
            System.out.println("Select storage\n" +
                    "\t 1. Audi\n" +
                    "\t 2. Mitsubishi\n" +
                    "\t 3. Opel\n" +
                    "\t 4. Back\n" +
                    "\t 5. Exit program\n" +
                    "\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n" +
                    "Select your choice");
            String carStorage = CarMain.scanner.nextLine();
            switch (carStorage) {
                case "1":
                    fabricAudi.storageInfo();
                    break;
                case "2":
                    fabricMitsubishi.storageInfo();
                    break;
                case "3":
                    fabricOpel.storageInfo();
                    break;
                case "4":
                    return;
                case "5":
                    System.exit(0);
                default:
                    System.out.println("Invalid value entered");
            }
        }
    }

    public void startProgram() {
        while (true) {
            System.out.println("Welcome to our autosalon\n" +
                    "\t 1. Car order\n" +
                    "\t 2. Car storage\n" +
                    "\t 3. Exit autosalon\n" +
                    "\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n" +
                    "Select your choice");
            String consoleMenu = CarMain.scanner.nextLine();
            switch (consoleMenu) {
                case "1":
                    carModelMenu();
                    break;
                case "2":
                    carStorage();
                    break;
                case "3":
                    System.exit(0);
                default:
                    System.out.println("Invalid value entered");
            }
        }
    }
}