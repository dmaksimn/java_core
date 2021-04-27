package com.raman.lis.task03.bedareva;

import com.raman.lis.task03.bedareva.Cars.Car;
import com.raman.lis.task03.bedareva.Enum.Color;
import com.raman.lis.task03.bedareva.Enum.EngineVolume;
import com.raman.lis.task03.bedareva.Enum.Model;
import com.raman.lis.task03.bedareva.Enum.Option;
import com.raman.lis.task03.bedareva.Enum.WheelSize;
import com.raman.lis.task03.bedareva.Factories.Factory;
import com.raman.lis.task03.bedareva.Services.ChangeColorService;
import com.raman.lis.task03.bedareva.Services.ChangeOption;
import com.raman.lis.task03.bedareva.Services.ChangeWheelsService;

public class Salon {

    Car createNewCarOnFactory(Factory factory, Color color, Model model, int year,
                              WheelSize wheelSize, EngineVolume engineVolume) {
        if (year <= 2021 && year >= 2019) {
            if (color != null && model != null && wheelSize != null && engineVolume != null) {
                return factory.createNewCar(color, model, year, wheelSize, engineVolume);
            }
            return null;
        }
        throw new IllegalArgumentException();
    }

    Car changeColorInCar(ChangeColorService changeColorService, Car car, Color color) {
        if (changeColorService != null && car != null && color != null) {
            return changeColorService.changeColor(car, color);
        }
        return null;
    }

    Car changeWheelsInCar(ChangeWheelsService changeWheelsService, Car car, WheelSize wheelSize) {
        if (changeWheelsService != null && car != null && wheelSize != null) {
            return changeWheelsService.changeWheels(car, wheelSize);
        }
        return null;
    }

    Car addOptionInCar(ChangeOption changeOption, Car car, Option option) {
        if (changeOption != null && car != null && option != null) {
            return changeOption.addOptionToList(car, option);
        }
        return null;
    }

    Car deleteOptionInCar(ChangeOption changeOption, Car car, Option option) {
        if (changeOption != null && car != null && option != null) {
            return changeOption.deleteOptionFromList(car, option);
        }
        return null;
    }
}

