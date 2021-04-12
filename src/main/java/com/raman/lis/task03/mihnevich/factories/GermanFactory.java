package com.raman.lis.task03.mihnevich.factories;

import com.raman.lis.task03.mihnevich.cars.Car;
import com.raman.lis.task03.mihnevich.cars.Model;
import com.raman.lis.task03.mihnevich.cars.impl.Audi;
import com.raman.lis.task03.mihnevich.cars.impl.Bmw;
import com.raman.lis.task03.mihnevich.cars.impl.Opel;

import java.util.Arrays;
import java.util.List;

public class GermanFactory extends Factory {

    @Override
    protected Car createNewCar(String color, List<String> options, Model model, int year, int wheelSize, double engineVolume) {
        switch (model) {
            case BMW:
                return new Bmw(color, options, year, wheelSize, engineVolume);
            case AUDI:
                return new Audi(color, options, year, wheelSize, engineVolume);
            case OPEL:
                return new Opel(color, options, year, wheelSize, engineVolume);
            default:
                return null;
        }
    }

    @Override
    public List<Model> getModels() {
        return Arrays.asList(Model.BMW, Model.AUDI, Model.OPEL);
    }

    @Override
    public List<Integer> getWheelSizes() {
        return Arrays.asList(18, 19, 20);
    }

    @Override
    public List<Double> getEngineVolumes() {
        return Arrays.asList(2.0, 2.2, 3.0);
    }

    @Override
    public List<String> getColors() {
        return Arrays.asList("Red", "White");
    }
}
