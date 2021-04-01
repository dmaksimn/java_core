package com.raman.lis.task03.dubroushchyk;

import com.raman.lis.task03.dubroushchyk.Enum.Mercedes.*;

import java.util.*;


public class CarFactoryMercedes extends CarFactory {

    List<Car> carStorageMercedes = new ArrayList<>();

    public CarFactoryMercedes(ServiceColor serviceColor, ServiceWheels serviceWheels, ServiceOptional serviceOptional) {
        super(serviceColor, serviceWheels, serviceOptional);

        carStorageMercedes.add(new CarMercedes("BLACK","Mercedes E200",
                2020, 17, 2000));
        carStorageMercedes.add(new CarMercedes("ORANGE","Mercedes SLR",
                2005, 18, 3000));
        carStorageMercedes.add(new CarMercedes("GREY","Mercedes GL",
                2020, 20, 4000));
    }

    @Override
    public void storageInfo() {
        System.out.println("\nАвто на складе завода Mercedes");
        if (carStorageMercedes.size() >= 1) {
            System.out.println(carStorageMercedes);
        } else {
            System.out.println("Склад пустой");
        }
    }

    public Car createCar(String color, String model, int yearProduction,
                            int sizeWheels, int engineVolume) {
        for (int i = 0; i < carStorageMercedes.size(); i++) {
            if (carStorageMercedes.get(i).compareCarInStorage(color, model, yearProduction,
                    sizeWheels, engineVolume)) {
                Car car = carStorageMercedes.get(i);
                carStorageMercedes.remove(i);
                return car;
            }
        }
        return new CarMercedes(color, model, yearProduction,
                sizeWheels, engineVolume);
    }

    @Override
    public Car getCarFromStorage(int number) {
        if (number > carStorageMercedes.size() || number <= 0) {
            System.out.println("Нет авто под таким номеров или склад пустой");
            return null;
        }
        Car car = carStorageMercedes.get(number - 1);
        carStorageMercedes.remove(number - 1);
        return car;
    }

    @Override
    public void printPropertyCar() {
        System.out.println("\nВывод на экран enum");
        System.out.println("Возможный цвет авто: " + Arrays.toString(CarColorMercedes.values()));
        System.out.println("Возможный объём двигателя: " + Arrays.toString(CarEngineVolumeMercedes.values()));
        System.out.println("Возможная модель авто: " + Arrays.toString(CarModelMercedes.values()));
        System.out.println("Возможный размер дисков: " + Arrays.toString(CarSizeWheelsMercedes.values()));
    }

}
