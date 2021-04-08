package com.raman.lis.task03.darashenka;

import java.util.Arrays;

public class CarFabric {

    private CarService service;
    private Car[] storage = new Car[3];

    CarFabric(CarService service) {
        this.service = service;
        storage[0] = new Car("Blue","Dacia", 2021, 16, 1600);
        storage[1] = new Car("Black", "Bmw", 2021, 15, 2000);
        storage[2] = new Car("Red", "Audi", 2021, 15, 1300);
    }

    public String toString(Car[] a) {
        if (a == null)
            return "null";
        int counter = 1;
        int ui = a.length - 1;
        if (ui == -1) {
            return "Car not in storage";
        }

        StringBuilder b = new StringBuilder();
        for (int i = 0; ; i++) {
            b.append("Car number: " + counter + '\n');
            counter++;
            b.append(String.valueOf(a[i]));
            if (i == ui) {
                return b.append(' ').toString();
            }
        }
    }

    void changeServiceColor(Car car, String color) {
        service.changeColorCar(car, color);
    }

    void changeServiceWheel(Car car, int wheels) {
        service.changeSizeWheelCar(car, wheels);
    }

    void addServiceOption(Car car, String string) {
        service.Option(car, string);
    }

    void deleteServiceOption(Car car, String string) {
        service.DeleteOption(car, string);
    }

    void  storageInfo() {
        System.out.println("Car in storage carsalon");
        if (storage.length >= 1) {
            System.out.println(toString(storage));
        }
        else {
            System.out.println("Storage is empty");
        }
    }
    Car createCar(String color, String brand, int year, int sizeWheels, int engineVolume) {
       Car car = new Car(color, brand, year, sizeWheels, engineVolume);

       for (int i = 0; i < storage.length; i++) {
           if (car.equals(storage[i])) {
               car = storage[i];
               for (int j = 0; j < storage.length - 1; j++) {
                   storage[i] = storage[i +1];
               }
        Car[] array = Arrays.copyOf(storage, storage.length -1);
               storage = array;
               return car;
            }
        }
       return car;
    }

    Car carFromStorage(int number) {
        if (number > storage.length || number <= 0) {
            System.out.println("Invalid number or storage is empty");
            return null;
        }
        Car car = storage[number -1];
        for (int j = number - 1; j < storage.length - 1; j++) {
            storage[j] = storage[j + 1];
        }
        Car[] array = Arrays.copyOf(storage, storage.length - 1);
        storage = array;
        return car;
    }

    void printEquipment() {
        System.out.println("Print on display enum");
        System.out.println("Option color: " + Arrays.toString(CarColor.values()));
        System.out.println("Option brand: " + Arrays.toString(CarBrand.values()));
        System.out.println("Option size wheel: " + Arrays.toString(CarSizeWheels.values()));
        System.out.println("Option engine volume: " + Arrays.toString(CarEngineVolume.values()));
    }
}
