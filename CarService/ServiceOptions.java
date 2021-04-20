package com.Task.Task07.CarService;

import com.Task.Task07.CarConstructor.Car;
import com.Task.Task07.CarEnum.CarOption;
import com.Task.Task07.CarInterface.OptionServiceInterface;

public class ServiceOptions implements OptionServiceInterface {

    public void addOptionCar(Car car, CarOption option) throws IllegalArgumentException {
        if (car == null || option == null) {
            throw new IllegalArgumentException("Try again");
        } else {
            car.addOption(option.getOption());
        }
    }

    public void deleteOptionCar(Car car, CarOption option) {
        if (car == null || option == null) {
            throw new IllegalArgumentException("Try again");
        } else {
            car.deleteOption(option.getOption());
        }
    }

    @Override
    public void addServiceOption() {

    }

    @Override
    public void deleteServiceOption() {

    }
}