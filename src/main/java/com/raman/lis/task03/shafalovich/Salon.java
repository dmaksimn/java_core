package com.raman.lis.task03.shafalovich;

import com.raman.lis.task03.shafalovich.enums.CarColors;
import com.raman.lis.task03.shafalovich.enums.CarEngines;
import com.raman.lis.task03.shafalovich.enums.CarWheels;
import com.raman.lis.task03.shafalovich.services.ColorService;
import com.raman.lis.task03.shafalovich.services.OptionsService;
import com.raman.lis.task03.shafalovich.services.WheelService;

import java.util.Arrays;

public class Salon {

    private ColorService cService;
    private WheelService wService;
    private OptionsService oService;

    public Salon(ColorService cService, WheelService wService, OptionsService oService) {
        this.cService = cService;
        this.wService = wService;
        this.oService = oService;

    }

    public StringBuilder printCarProperties() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n\tВарианты возможных характеристик авто для заказа :")
                .append("\n\tЦвета: ").append(Arrays.toString(CarColors.values()))
                .append("\n\tРазмеры колес: ").append(Arrays.toString(CarWheels.values()))
                .append("\n\tОбъемы двигателя: ").append(Arrays.toString(CarEngines.values()))
                .append("\n");
        return sb;
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
        System.out.println("\n\tМашина по вашему заказу: \n"
                + garage.carSelection(factory.createCar(year, volume, wheels, color)));
    }
}
