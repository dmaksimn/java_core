package com.raman.lis.task04.alexander.grigorovich.service;

import com.raman.lis.task04.alexander.grigorovich.model.Car;


public class ChangeColorService extends Service implements ChangeColorServiceInterface {

    @Override
    public void changeColor(Car car, String color) throws IllegalArgumentException {
        if (car == null || color == null) {
            throw new IllegalArgumentException("Try again");
        } else {
            car.setColor(color);
        }
    }




}
