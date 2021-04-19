package com.raman.lis.task03.dubroushchyk.MenuVisualization.CarFactory;

import com.raman.lis.task03.dubroushchyk.Car;

import com.raman.lis.task03.dubroushchyk.CarFactoryMercedes;
import com.raman.lis.task03.dubroushchyk.Enum.Mercedes.CarColorMercedes;
import com.raman.lis.task03.dubroushchyk.Enum.Mercedes.CarEngineVolumeMercedes;
import com.raman.lis.task03.dubroushchyk.Enum.Mercedes.CarModelMercedes;
import com.raman.lis.task03.dubroushchyk.Enum.Mercedes.CarSizeWheelsMercedes;
import com.raman.lis.task03.dubroushchyk.Main;

public class MercedesCarFactoryVis {

    CarFactoryMercedes carFactoryMercedes;

    public MercedesCarFactoryVis(CarFactoryMercedes carFactoryMercedes) {
        this.carFactoryMercedes = carFactoryMercedes;
    }

    public Car carCreateVis() {

        System.out.println("");
        carFactoryMercedes.printPropertyCar();

        System.out.println("Введите цвет авто: ");
        com.raman.lis.task03.dubroushchyk.Enum.Mercedes.CarColorMercedes carColor = null;
        while (carColor == null) {
            String color = Main.scanner.nextLine();
            try {
                carColor = CarColorMercedes.valueOf(color.toUpperCase().trim());
            } catch (IllegalArgumentException e) {
                System.out.println("Токого цвета нет. Введите цвет из списка выше: ");
            }
        }

        System.out.println("Введите объём двигателя");
        CarEngineVolumeMercedes carEngineVolume = null;
        while (carEngineVolume == null) {
            String volume = Main.scanner.nextLine();
            try {
                carEngineVolume = CarEngineVolumeMercedes.valueOf(volume.toUpperCase().trim());
            } catch (IllegalArgumentException e) {
                System.out.println("Токого объёма нет. Введите объём из списка выше: ");
            }
        }

        System.out.println("Введите модель авто: ");
        CarModelMercedes carModel = null;
        while (carModel == null) {
            String model = Main.scanner.nextLine();
            try {
                carModel = CarModelMercedes.valueOf(model.toUpperCase().trim());
            } catch (IllegalArgumentException e) {
                System.out.println("Токой модели нету. Введите модель из списка выше: ");
            }
        }

        System.out.println("Введите размер колёс: ");
        CarSizeWheelsMercedes carSizeWheels = null;
        while (carSizeWheels == null) {
            String sizeWheels = Main.scanner.nextLine();
            try {
                carSizeWheels = CarSizeWheelsMercedes.valueOf(sizeWheels.toUpperCase().trim());
            } catch (IllegalArgumentException e) {
                System.out.println("Токого размера колёс нету. Введите размер колёс из списка выше: ");
            }
        }

        return carFactoryMercedes.createCar(carColor, carModel, 2021, carSizeWheels, carEngineVolume);
    }
}
