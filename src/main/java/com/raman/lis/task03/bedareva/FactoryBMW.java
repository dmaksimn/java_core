package com.raman.lis.task03.bedareva;

public class FactoryBMW extends Factory {

    public FactoryBMW(ChangeWheelsService changeWheelsService,
                      ChangeColorService changeColorService,
                      ChangeOption changeOption) {
        super(changeWheelsService, changeColorService, changeOption);
        warehouse.add(new CarBMW(Color.BLUE, 2020, WheelSize.INCHES19, EngineVolume.MIDSIZE_3000));
        warehouse.add(new CarBMW(Color.RED, 2021, WheelSize.INCHES18, EngineVolume.SUBCOMPACT_1500));
        warehouse.add(new CarBMW(Color.GREEN, 2021, WheelSize.INCHES17, EngineVolume.LARGESIZE_3500));
    }

    public Car createNewCar(Color color, Model model, int year, WheelSize wheelSize, EngineVolume engineVolume) {
        if (year <= 2021 && year >= 2019) {
            if (color != null && model != null && wheelSize != null && engineVolume != null) {
                Car newBMW = new CarBMW(color, year, wheelSize, engineVolume);
                System.out.println("Мы изготовили для вас новый автомобиль:");
                newBMW.infoAboutCar();
                return newBMW;
            } else {
                throw new NullPointerException();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
