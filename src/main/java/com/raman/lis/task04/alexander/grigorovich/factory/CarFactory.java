package com.raman.lis.task04.alexander.grigorovich.factory;


import com.raman.lis.task04.alexander.grigorovich.model.Car;
import com.raman.lis.task04.alexander.grigorovich.parametrs.Audi.AudiAdditionalOptions;
import com.raman.lis.task04.alexander.grigorovich.parametrs.Audi.AudiColor;
import com.raman.lis.task04.alexander.grigorovich.parametrs.Audi.AudiDiameterWheel;
import com.raman.lis.task04.alexander.grigorovich.parametrs.Audi.AudiVolumeEngine;
import com.raman.lis.task04.alexander.grigorovich.service.AdditionalOptionsService;
import com.raman.lis.task04.alexander.grigorovich.service.ChangeColorService;
import com.raman.lis.task04.alexander.grigorovich.service.ChangeWheelsService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class CarFactory implements CarFactoryInterface {

    private final int YEAR_OF_PRODUCTION = 2021;

    private AdditionalOptionsService additionalOptionsService;
    private ChangeColorService changeColorService;
    private ChangeWheelsService changeWheelsService;
    private final List<Car> carsStorage = new ArrayList<>();

    public CarFactory(AdditionalOptionsService additionalOptionsService, ChangeColorService changeColorService,
                      ChangeWheelsService changeWheelsService) {
        this.additionalOptionsService = additionalOptionsService;
        this.changeColorService = changeColorService;
        this.changeWheelsService = changeWheelsService;
    }

    public int getYEAR_OF_PRODUCTION() {
        return YEAR_OF_PRODUCTION;
    }

    protected void addCarInStorage(Car car) {
        carsStorage.add(car);
    }

    protected void removeCarInStorage(Car car) {
        carsStorage.remove(car);
    }

    public void listInfoAboutCarOnStorage() {
        Object[] carsArray = carsStorage.toArray();
        for (Object cars : carsArray) {
            System.out.println(cars);
        }
    }

    public void getCarFromStorage(int numberCarOnStorage) {
        System.out.println(carsStorage.get(numberCarOnStorage - 1));

    }

    @Override
    public void printPossibleCompleteFactoryCar() {
    }

    public void addAdditionalOptionsOnService(AdditionalOptionsService additionalOptionsService,
                                              Car car, String options){
        additionalOptionsService.addAdditionalOptions(car,options);
    }

    public void removeAdditionalOptionsOnService(AdditionalOptionsService additionalOptionsService,
                                                 Car car, String options){
        additionalOptionsService.removeAdditionalOptions(car,options);
    }

    public void changeColorOnService(ChangeColorService changeColorService,
                                     Car car, String color){
        changeColorService.changeColor(car,color);
    }

    public void changeWheelsOnService(ChangeWheelsService changeWheelsService,
                                      Car car, int diameterWheels){
        changeWheelsService.changeWheels(car,diameterWheels);
    }


}


