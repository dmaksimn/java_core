package com.Task.Task07.CarService;

import com.Task.Task07.CarConstructor.Car;
import com.Task.Task07.CarInterface.ServiceColorInterface;

public class ServiceChangeColor implements ServiceColorInterface {

    public void changeCarColorInCar(Car car, String color) throws IllegalArgumentException {
        if (car == null || color == null) {
            throw new IllegalArgumentException("Try again");
        } else {
            car.setColor(color);
        }
    }
}