package com.Task.Task07.CarService;

import com.Task.Task07.CarConstructor.Car;
import com.Task.Task07.CarInterface.CarServiceWheelInterface;

public class ServiceChangeWheel implements CarServiceWheelInterface {

    public void changeServiceWheels(Car car, int wheels) throws IllegalArgumentException {
        try {
            if (car == null || wheels < 0) {
                throw new IllegalArgumentException("Try again");
            }
            car.setSizeWheel(wheels);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid size wheels, choose another size");
        }
    }
}