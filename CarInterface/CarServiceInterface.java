package com.Task.Task07.CarInterface;

import com.Task.Task07.CarConstructor.Car;

public interface CarServiceInterface {

    void changeServiceColor(Car car, String color);

    void changeServiceWheels(Car car, int wheels);

    void addServiceOption(Car car, String string);

    void deleteServiceOption(Car car, String string);

}
