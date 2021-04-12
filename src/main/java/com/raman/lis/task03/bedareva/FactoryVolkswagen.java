package com.raman.lis.task03.bedareva;

public class FactoryVolkswagen extends Factory {

    public FactoryVolkswagen(ChangeWheelsService changeWheelsService,
                             ChangeColorService changeColorService,
                             ChangeOption changeOption) {
        super(changeWheelsService, changeColorService, changeOption);
        warehouse.add(new CarVolkswagen(Color.GREEN, 2020, WheelSize.INCHES19, EngineVolume.MIDSIZE_3000));
        warehouse.add(new CarVolkswagen(Color.RED, 2021, WheelSize.INCHES17, EngineVolume.MINICAR_1100));
    }

    public Car createNewCar(Color color, Model model, int year, WheelSize wheelSize, EngineVolume engineVolume) {
        if (year <= 2021 && year >= 2019) {
            if (color != null && model != null && wheelSize != null && engineVolume != null && year <= 2021 && year >= 2019) {
                Car newVolkswagen = new CarVolkswagen(color, year, wheelSize, engineVolume);
                System.out.println("Мы изготовили для вас новый автомобиль:");
                newVolkswagen.infoAboutCar();
                return newVolkswagen;
            } else {
                throw new NullPointerException();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
