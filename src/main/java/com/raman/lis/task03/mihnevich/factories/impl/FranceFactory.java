package com.raman.lis.task03.mihnevich.factories.impl;

import com.raman.lis.task03.mihnevich.cars.Car;
import com.raman.lis.task03.mihnevich.cars.Model;
import com.raman.lis.task03.mihnevich.cars.impl.*;
import com.raman.lis.task03.mihnevich.factories.Factory;

import java.util.Arrays;
import java.util.List;

public class FranceFactory extends Factory {
    public FranceFactory() {
        createStorage();
    }


    @Override
    protected Car createNewCar(String color, List<String> options, Model model, int year, int wheelSize, double engineVolume) {
        switch (model) {
            case FIAT:
                return new Fiat(color, options, year, wheelSize, engineVolume);
            default:
                return null;
        }
    }

    @Override
    public List<Model> getModels() {
        return Arrays.asList(Model.FIAT);
    }

    @Override
    public List<Integer> getWheelSizes() {
        return Arrays.asList(14, 15, 16);
    }

    @Override
    public List<Double> getEngineVolumes() {
        return Arrays.asList(1.2, 1.4, 1.6);
    }

    @Override
    public List<String> getColors() {
        return Arrays.asList("Blue", "Yellow");
    }
}
