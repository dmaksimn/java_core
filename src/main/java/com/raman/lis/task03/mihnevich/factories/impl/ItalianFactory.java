package com.raman.lis.task03.mihnevich.factories.impl;

import com.raman.lis.task03.mihnevich.cars.Car;
import com.raman.lis.task03.mihnevich.cars.Model;
import com.raman.lis.task03.mihnevich.cars.impl.*;
import com.raman.lis.task03.mihnevich.factories.Factory;

import java.util.Arrays;
import java.util.List;

public class ItalianFactory extends Factory {
    public ItalianFactory() {
        createStorage();
    }

    @Override
    protected Car createNewCar(String color, List<String> options, Model model, int year, int wheelSize, double engineVolume) {
        switch (model) {
            case FERRARI:
                return new Ferrari(color, options, year, wheelSize, engineVolume);
            default:
                return null;
        }
    }

    @Override
    public List<Model> getModels() {
        return Arrays.asList(Model.FERRARI);
    }

    @Override
    public List<Integer> getWheelSizes() {
        return Arrays.asList(20, 21, 22);
    }

    @Override
    public List<Double> getEngineVolumes() {
        return Arrays.asList(3.0, 4.0, 5.0);
    }

    @Override
    public List<String> getColors() {
        return Arrays.asList("Red", "Yellow", "Black");
    }
}

