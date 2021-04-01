package com.raman.lis.task03.dubroushchyk;

import com.raman.lis.task03.dubroushchyk.Enum.Bmw.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CarFactoryBmw extends CarFactory {

    List<Car> carStorageBmw = new ArrayList<>();

    public CarFactoryBmw(ServiceColor serviceColor, ServiceWheels serviceWheels, ServiceOptional serviceOptional) {
        super(serviceColor, serviceWheels, serviceOptional);

        carStorageBmw.add(new CarBmw("RED","BMW M4", 2020,
                17, 2000));
        carStorageBmw.add(new CarBmw("YELLOW","BMW M5", 2005,
                18, 2200));
        carStorageBmw.add(new CarBmw("BLACK","BMW X6", 2009,
                20, 3500));
    }

    @Override
    public void storageInfo() {
        System.out.println("\nАвто на складе завода BMW");
        if (carStorageBmw.size() >= 1) {
            System.out.println(carStorageBmw);
        } else {
            System.out.println("Склад пустой");
        }
    }

    public Car createCar(String color, String model, int yearProduction,
                         int sizeWheels, int engineVolume) {
        for (int i = 0; i < carStorageBmw.size(); i++) {
            if (carStorageBmw.get(i).compareCarInStorage(color, model, yearProduction,
                    sizeWheels, engineVolume)) {
                Car car = carStorageBmw.get(i);
                carStorageBmw.remove(i);
                return car;
            }
        }
        return new CarBmw(color, model, yearProduction,
                sizeWheels, engineVolume);
    }

    @Override
    public Car getCarFromStorage(int number) {
        if (number > carStorageBmw.size() || number <= 0) {
            System.out.println("Нет авто под таким номеров или склад пустой");
            return null;
        }
        Car car = carStorageBmw.get(number - 1);
        carStorageBmw.remove(number - 1);
        return car;
    }

    @Override
    public void printPropertyCar() {
        System.out.println("\nВывод на экран enum");
        System.out.println("Возможный цвет авто: " + Arrays.toString(CarColorBmw.values()));
        System.out.println("Возможный объём двигателя: " + Arrays.toString(CarEngineVolumeBmw.values()));
        System.out.println("Возможная модель авто: " + Arrays.toString(CarModelBmw.values()));
        System.out.println("Возможный размер дисков: " + Arrays.toString(CarSizeWheelsBmw.values()));
    }

}

