package com.raman.lis.task02.dubroushchyk;

public class CarService {

    void changeCarColorInCar(Car car, String color) {
        car.setColor(color);
    }

    void changeCarWheelsInCar(Car car, int wheels) {
        car.setSizeWheels(wheels);
    }

    void addOptionalInCar(Car car, String string) {
        car.addOptional(string);
    }

    void removeOptionalInCar(Car car, String string) {
        car.removeOptional(string);
    }
}
