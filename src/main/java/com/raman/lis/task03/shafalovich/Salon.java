package com.raman.lis.task03.shafalovich;

import java.util.Arrays;

public class Salon {

    private ColorService cService;
    private WheelService wService;

    Salon(ColorService cService, WheelService wService) {
        this.cService = cService;
        this.wService = wService;

    }
    public void printCarProperties() {
        System.out.println("\n" + "Варианты возможных характеристик авто для заказа :" + "\n"
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

    public void makeOrder(Factory factory, int year, CarEngines volume,
                          CarWheels wheels, CarColors color){

        factory.createCar(year, volume, wheels, color);
    }
}
