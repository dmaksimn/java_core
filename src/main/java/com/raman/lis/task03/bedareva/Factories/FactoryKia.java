package com.raman.lis.task03.bedareva.Factories;


import com.raman.lis.task03.bedareva.Cars.Car;
import com.raman.lis.task03.bedareva.Cars.CarKia;
import com.raman.lis.task03.bedareva.Enum.Color;
import com.raman.lis.task03.bedareva.Enum.EngineVolume;
import com.raman.lis.task03.bedareva.Enum.Model;
import com.raman.lis.task03.bedareva.Enum.WheelSize;
import com.raman.lis.task03.bedareva.Services.ChangeColorService;
import com.raman.lis.task03.bedareva.Services.ChangeOption;
import com.raman.lis.task03.bedareva.Services.ChangeWheelsService;

public class FactoryKia extends Factory {

    public FactoryKia(ChangeWheelsService changeWheelsService,
                      ChangeColorService changeColorService,
                      ChangeOption changeOption) {
        super(changeWheelsService, changeColorService, changeOption);
    }

    public Car createNewCar(Color color, Model model, int year, WheelSize wheelSize, EngineVolume engineVolume) {
        if (year <= 2021 && year >= 2019) {
            if (color != null && model != null && wheelSize != null && engineVolume != null) {
                Car newKia = new CarKia(color, year, wheelSize, engineVolume);
                System.out.println("Мы изготовили для вас новый автомобиль:");
                newKia.infoAboutCar();
                return newKia;
            }
            System.out.println("Авто не изготовлено, выберите параметры из списка");
            return null;
        }
        throw new IllegalArgumentException();
    }
}
