package com.raman.lis.task03.shafalovich;

import java.util.Arrays;

public class Salon {

    private ColorService cService;
    private WheelService wService;
    private OptionsService oService;

    Salon(ColorService cService, WheelService wService, OptionsService oService) {
        this.cService = cService;
        this.wService = wService;
        this.oService = oService;

    }

    public void printCarProperties() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n" + "Варианты возможных характеристик авто для заказа :" + "\n"
                + "Цвета: " + Arrays.toString(CarColors.values()) + "\n"
                + "Размеры колес: " + Arrays.toString(CarWheels.values()) + "\n"
                + "Объемы двигателя: " + Arrays.toString(CarEngines.values()) + "\n");
    }

    public void changeCarColorInColorService(Car car, CarColors color) {
        cService.changeCarColor(car, color);
    }

    public void changeCarWheelsInWheelService(Car car, CarWheels wheels) {
        wService.changeCarWheel(car, wheels);
    }

    public void addCarOptionsInOptionsService(Car car, String option) {
        oService.addCarOptions(car, option);
    }

    public void removeCarOptionsInOptionsService(Car car) {
        oService.removeCarOptions(car);
    }

    public void makeOrder(Factory factory, Garage garage, int year, CarEngines volume,
                          CarWheels wheels, CarColors color) {
        garage.searchCar(factory.createCar(year, volume, wheels, color));
    }


}
