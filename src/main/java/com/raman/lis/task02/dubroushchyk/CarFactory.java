package com.raman.lis.task02.dubroushchyk;

import java.util.Arrays;

public class CarFactory {

    private CarService service;
    private Car[] storage = new Car[3];

    CarFactory(CarService service) {
        this.service = service;
        storage[0] = new Car("BLUE","BMW", 2020, 17, 2000);
        storage[1] = new Car("GREEN", "MERCEDES", 2019, 20, 1600);
        storage[2] = new Car("BLACK", "AUDI", 2021, 18, 3000);
    }

    public String toString(Object[] a) {
        if (a == null)
            return "null";

        int counter = 1;
        int iMax = a.length - 1;
        if (iMax == -1) {
            return "Нет авто на складе";
        }

        StringBuilder b = new StringBuilder();
        for (int i = 0; ; i++) {
            b.append("Номер авто на складе: " + counter + "\n");
            counter++;
            b.append(String.valueOf(a[i]));
            if (i == iMax) {
                return b.append(' ').toString();
            }
        }
    }

    void changeServiceColor(Car car, String color) {
        service.changeCarColorInCar(car, color);
    }

    void changeServiceWheels(Car car, int wheels) {
        service.changeCarWheelsInCar(car, wheels);
    }

    void addServiceOptional(Car car, String string) {
        service.addOptionalInCar(car, string);
    }

    void removeServiceOptional(Car car, String string) {
        service.removeOptionalInCar(car, string);
    }

    void storageInfo() {
        System.out.println("\nАвто на складе автосалона");
        if (storage.length >= 1) {
            System.out.println(toString(storage));
        } else {
            System.out.println("Склад пустой");
        }
    }

    Car createCar(String color, String model, int yearProduction,
                  int sizeWheels, int engineVolume) {
        Car car = new Car(color, model, yearProduction,
                sizeWheels, engineVolume);

        for (int i = 0; i < storage.length; i++) {
            if (car.equals(storage[i])) {
                car = storage[i];
                for (int j = i; j < storage.length - 1; j++) {
                    storage[i] = storage[i + 1];
                }
                Car[] array = Arrays.copyOf(storage, storage.length - 1);
                storage = array;
                return car;
            }
        }
        return car;
    }

    Car getCarFromStorage(int number) {
        if (number > storage.length || number <= 0) {
            System.out.println("Нет авто под таким номеров или склад пустой");
            return null;
        }
        Car car = storage[number - 1];
        for (int j = number - 1; j < storage.length - 1; j++) {
            storage[j] = storage[j + 1];
        }
        Car[] array = Arrays.copyOf(storage, storage.length - 1);
        storage = array;
        return car;
    }

    void printPropertyCar () {
        System.out.println("\nВывод на экран enum");
        System.out.println("Возможный цвет авто: " + Arrays.toString(CarColor.values()));
        System.out.println("Возможный объём двигателя: " + Arrays.toString(CarEngineVolume.values()));
        System.out.println("Возможная модель авто: " + Arrays.toString(CarModel.values()));
        System.out.println("Возможный размер дисков: " + Arrays.toString(CarSizeWheels.values()));
    }
}





