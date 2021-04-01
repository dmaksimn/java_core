package com.raman.lis.task03.dubroushchyk;

import com.raman.lis.task03.dubroushchyk.Enum.Audi.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CarFactoryAudi extends CarFactory {

    List<Car> carStorageAUDI = new ArrayList<>();

    public CarFactoryAudi(ServiceColor serviceColor, ServiceWheels serviceWheels, ServiceOptional serviceOptional) {
        super(serviceColor, serviceWheels, serviceOptional);

        carStorageAUDI.add(new CarAudi("WHITE", "AUDI A4",
                2016, 17, 1600));
        carStorageAUDI.add(new CarAudi("PINK", "AUDI A6",
                2018, 19, 3000));
        carStorageAUDI.add(new CarAudi("BLACK", "AUDI A8",
                2020, 20, 4000));
    }


    @Override
    public void storageInfo() {
        System.out.println("\nАвто на складе завода Audi");
        if (carStorageAUDI.size() >= 1) {
            System.out.println(carStorageAUDI);
        } else {
            System.out.println("Склад пустой");
        }
    }

    public Car createCar(String color, String model, int yearProduction,
                         int sizeWheels, int engineVolume) {
        for (int i = 0; i < carStorageAUDI.size(); i++) {
            if (carStorageAUDI.get(i).compareCarInStorage(color, model, yearProduction,
                    sizeWheels, engineVolume)) {
                Car car = carStorageAUDI.get(i);
                carStorageAUDI.remove(i);
                return car;
            }
        }
        return new CarAudi(color, model, yearProduction,
                sizeWheels, engineVolume);
    }

    @Override
    public Car getCarFromStorage(int number) {
        if (number > carStorageAUDI.size() || number <= 0) {
            System.out.println("Нет авто под таким номеров или склад пустой");
            return null;
        }
        Car car = carStorageAUDI.get(number - 1);
        carStorageAUDI.remove(number - 1);
        return car;
    }

    @Override
    public void printPropertyCar () {
        System.out.println("\nВывод на экран enum");
        System.out.println("Возможный цвет авто: " + Arrays.toString(CarColorAudi.values()));
        System.out.println("Возможный объём двигателя: " + Arrays.toString(CarEngineVolumeAudi.values()));
        System.out.println("Возможная модель авто: " + Arrays.toString(CarModelAudi.values()));
        System.out.println("Возможный размер дисков: " + Arrays.toString(CarSizeWheelsAudi.values()));
    }

}