package com.raman.lis.task03.dubroushchyk;

import java.util.List;

public interface ICarFactory {

    void changeServiceColor(Car car, String color);

    void changeServiceWheels(Car car, int wheels);

    void addServiceOptional(Car car, String string);

    void removeServiceOptional(Car car, String string);

    void storageInfo();

    Car getCarFromStorage(int number);

    void printPropertyCar ();
}
