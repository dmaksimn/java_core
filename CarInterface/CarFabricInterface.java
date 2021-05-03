package com.Task.Task07.CarInterface;

import com.Task.Task07.CarConstructor.Car;

public interface CarFabricInterface {

    void storageInfo();

    Car getCarFromStorage(int number);

    void printPropertyCar();
}