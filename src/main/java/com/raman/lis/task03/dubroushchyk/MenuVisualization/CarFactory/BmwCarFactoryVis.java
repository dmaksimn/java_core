package com.raman.lis.task03.dubroushchyk.MenuVisualization.CarFactory;

import com.raman.lis.task03.dubroushchyk.Car;
import com.raman.lis.task03.dubroushchyk.CarFactoryBmw;
import com.raman.lis.task03.dubroushchyk.Enum.Bmw.CarColorMercedes;
import com.raman.lis.task03.dubroushchyk.Enum.Bmw.CarEngineVolumeMercedes;
import com.raman.lis.task03.dubroushchyk.Enum.Bmw.CarModelMercedes;
import com.raman.lis.task03.dubroushchyk.Enum.Bmw.CarSizeWheelsMercedes;
import com.raman.lis.task03.dubroushchyk.Main;

public class BmwCarFactoryVis {

    CarFactoryBmw carFactoryBmw;

    public BmwCarFactoryVis(CarFactoryBmw carFactoryBmw) {
        this.carFactoryBmw = carFactoryBmw;
    }

    public Car carCreateVis() {

        System.out.println("");
        carFactoryBmw.printPropertyCar();

        System.out.println("Введите цвет авто: ");
        CarColorMercedes carColor = null;
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

        return carFactoryBmw.createCar(carColor, carModel, 2021, carSizeWheels, carEngineVolume);
    }
}
