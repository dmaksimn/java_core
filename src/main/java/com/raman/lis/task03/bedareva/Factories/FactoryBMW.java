package com.raman.lis.task03.bedareva.Factories;


import com.raman.lis.task03.bedareva.Cars.Car;
import com.raman.lis.task03.bedareva.Cars.CarBMW;
import com.raman.lis.task03.bedareva.Enum.Color;
import com.raman.lis.task03.bedareva.Enum.EngineVolume;
import com.raman.lis.task03.bedareva.Enum.Model;
import com.raman.lis.task03.bedareva.Enum.Option;
import com.raman.lis.task03.bedareva.Enum.WheelSize;
import com.raman.lis.task03.bedareva.Services.ChangeColorService;
import com.raman.lis.task03.bedareva.Services.ChangeOption;
import com.raman.lis.task03.bedareva.Services.ChangeWheelsService;

public class FactoryBMW extends Factory {

    public FactoryBMW(ChangeWheelsService changeWheelsService,
                      ChangeColorService changeColorService,
                      ChangeOption changeOption) {
        super(changeWheelsService, changeColorService, changeOption);
        warehouse.add(new CarBMW(Color.BLUE, 2020, WheelSize.INCHES_19, EngineVolume.MIDSIZE_3000));
        Car bmw1;
        warehouse.add(bmw1 = new CarBMW(Color.RED, 2021, WheelSize.INCHES_18, EngineVolume.SUBCOMPACT_1500));
        Car bmw2;
        warehouse.add(bmw2 = new CarBMW(Color.GREEN, 2021, WheelSize.INCHES_17, EngineVolume.LARGE_SIZE_3500));
        bmw1.addOption(Option.HEATED_SEATS); // добавила опций чтобы можно было поудалять
        bmw2.addOption(Option.TIRE_PRESSURE_SENSORS);
    }

    public Car createNewCar(Color color, Model model, int year, WheelSize wheelSize, EngineVolume engineVolume) {
        if (year <= 2021 && year >= 2019) {
            if (color != null && model != null && wheelSize != null && engineVolume != null) {
                Car newBMW = new CarBMW(color, year, wheelSize, engineVolume);
                System.out.println("Мы изготовили для вас новый автомобиль:");
                newBMW.infoAboutCar();
                return newBMW;
            }
            System.out.println("Авто не изготовлено, выберите параметры из списка");
            return null;
        }
        throw new IllegalArgumentException();
    }
}

