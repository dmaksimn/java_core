package com.raman.lis.task03.mihnevich.salon;

import com.raman.lis.task03.mihnevich.cars.Car;
import com.raman.lis.task03.mihnevich.cars.Model;
import com.raman.lis.task03.mihnevich.factories.Factories;
import com.raman.lis.task03.mihnevich.factories.Factory;
import com.raman.lis.task03.mihnevich.services.IColorService;
import com.raman.lis.task03.mihnevich.services.IOptionService;
import com.raman.lis.task03.mihnevich.services.IWheelSizeService;
import com.raman.lis.task03.mihnevich.services.impl.ColorServiceImpl;
import com.raman.lis.task03.mihnevich.services.impl.OptionServiceImpl;
import com.raman.lis.task03.mihnevich.services.impl.WheelSizeServiceImpl;

import java.util.List;

public class Salon {
    private IColorService colorService = new ColorServiceImpl();
    private IOptionService optionService = new OptionServiceImpl();
    private IWheelSizeService wheelSizeService = new WheelSizeServiceImpl();


    public Car createCarOrder(String color, List<String> options,
                              Model model, int year, int wheelSize, double engineVolume) {
        for (Factory factory : Factories.getFactories()) {
            if (factory.getModels().contains(model)) {
                return factory.createCar(color, options, model, year, wheelSize, engineVolume);
            }
        }
        return null;
    }

    public Car getMostSuitableCar(String color, List<String> options,
                                  Model model, int year, int wheelSize, double engineVolume) {
        for (Factory factory : Factories.getFactories()) {
            if (factory.getModels().contains(model)) {
                return factory.getMostSuitableCar(color, options, model, year, wheelSize, engineVolume);
            }
        }
        return null;
    }

    public Car changeCarColor(Car car, String color) {
        colorService.changeColor(car, color);
        return car;
    }


    public Car changeCarWheelSize(Car car, int wheelSize) {
        wheelSizeService.changeWheelSize(car, wheelSize);
        return car;
    }

    public Car changeCarOptions(Car car, List<String> options) {
        List<String> currentOptions = car.getOptions();
        for (String option : currentOptions) {
            optionService.deleteOption(car, option);
        }
        for (String option : options) {
            optionService.addOption(car, option);
        }
        return car;
    }
}

