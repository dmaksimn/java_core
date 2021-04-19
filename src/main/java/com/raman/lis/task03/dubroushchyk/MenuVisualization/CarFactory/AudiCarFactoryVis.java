package com.raman.lis.task03.dubroushchyk.MenuVisualization.CarFactory;

import com.raman.lis.task03.dubroushchyk.*;
import com.raman.lis.task03.dubroushchyk.Enum.Audi.CarColorAudi;
import com.raman.lis.task03.dubroushchyk.Enum.Audi.CarEngineVolumeAudi;
import com.raman.lis.task03.dubroushchyk.Enum.Audi.CarModelAudi;
import com.raman.lis.task03.dubroushchyk.Enum.Audi.CarSizeWheelsAudi;

import java.util.Arrays;

public class AudiCarFactoryVis {

    CarFactoryAudi carFactoryAudi;


    public AudiCarFactoryVis(CarFactoryAudi carFactoryAudi) {
        this.carFactoryAudi = carFactoryAudi;
    }

    public Car carCreateVis() {
        System.out.println("");
        carFactoryAudi.printPropertyCar();

        System.out.println("Введите цвет авто: ");
        CarColorAudi carColor = null;
        while (carColor == null) {
            String color = Main.scanner.nextLine();
            try {
                carColor = CarColorAudi.valueOf(color.toUpperCase().trim());
            } catch (IllegalArgumentException e) {
                System.out.println("Токого цвета нет. Введите цвет из списка выше: ");
            }
        }

        System.out.println("Введите объём двигателя");
        CarEngineVolumeAudi carEngineVolume = null;
        while (carEngineVolume == null) {
            String volume = Main.scanner.nextLine();
            try {
                carEngineVolume = CarEngineVolumeAudi.valueOf(volume.toUpperCase().trim());
            } catch (IllegalArgumentException e) {
                System.out.println("Токого объёма нет. Введите объём из списка выше: ");
            }
        }

        System.out.println("Введите модель авто: ");
        CarModelAudi carModel = null;
        while (carModel == null) {
            String model = Main.scanner.nextLine();
            try {
                carModel = CarModelAudi.valueOf(model.toUpperCase().trim());
            } catch (IllegalArgumentException e) {
                System.out.println("Токой модели нету. Введите модель из списка выше: ");
            }
        }

        System.out.println("Введите размер колёс: ");
        CarSizeWheelsAudi carSizeWheels = null;
        while (carSizeWheels == null) {
            String sizeWheels = Main.scanner.nextLine();
            try {
                carSizeWheels = CarSizeWheelsAudi.valueOf(sizeWheels.toUpperCase().trim());
            } catch (IllegalArgumentException e) {
                System.out.println("Токого размера колёс нету. Введите размер колёс из списка выше: ");
            }
        }

        return carFactoryAudi.createCar(carColor, carModel, 2021, carSizeWheels, carEngineVolume);
    }
}
