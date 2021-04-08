package com.raman.lis.task03.dubroushchyk;

import com.raman.lis.task03.dubroushchyk.Enum.CarOptions;
import com.raman.lis.task03.dubroushchyk.Enum.EServiceColor;

public interface ICarFactory {

    void changeServiceColor(Car car, EServiceColor color);

    void changeServiceWheels(Car car, int wheels);

    void addServiceOptional(Car car, CarOptions options);

    void removeServiceOptional(Car car, CarOptions options);

    void storageInfo();

    Car getCarFromStorageNumberAuto(int number);

    void printPropertyCar ();
}
