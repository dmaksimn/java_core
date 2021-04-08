package com.raman.lis.task03.mihnevich.cars.impl;

import com.raman.lis.task03.mihnevich.cars.Car;
import com.raman.lis.task03.mihnevich.cars.Model;

import java.util.List;

public class Audi extends Car {

    public Audi(String color, List<String> options, int year, int wheelSize, double engineVolume) {
        super(color, options, year, wheelSize, engineVolume);
    }


    @Override
    public Model getModel() {
        return Model.AUDI;
    }
}