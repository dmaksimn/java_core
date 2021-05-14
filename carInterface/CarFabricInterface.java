package com.Task.Task07.carInterface;

import com.Task.Task07.carConstructor.Car;

public interface CarFabricInterface {

    void storageInfo();

    Car getCarFromStorage(int number);

    void printPropertyCar();
}