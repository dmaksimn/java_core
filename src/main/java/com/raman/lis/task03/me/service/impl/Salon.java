package com.raman.lis.task03.me.service.impl;

import com.raman.lis.task03.me.model.EngineVol;
import com.raman.lis.task03.me.model.WheelSize;
import com.raman.lis.task03.me.model.car.AudiCar;
import com.raman.lis.task03.me.model.car.BMWCar;
import com.raman.lis.task03.me.model.car.FordCar;
import com.raman.lis.task03.me.model.color.AudiColorsEnum;
import com.raman.lis.task03.me.model.color.BMWColorsEnum;
import com.raman.lis.task03.me.model.color.FordColorsEnum;
import com.raman.lis.task03.me.model.details.AudiDetails;
import com.raman.lis.task03.me.model.details.BMWDetails;
import com.raman.lis.task03.me.model.details.FordDetails;
import com.raman.lis.task03.me.model.model.AudiModelEnum;
import com.raman.lis.task03.me.model.model.BMWModelEnum;
import com.raman.lis.task03.me.model.model.FordModelEnum;

import java.util.HashSet;

public class Salon {

    private final AudiFactoryImpl audiFactory = new AudiFactoryImpl();
    private final BMWFactoryImpl bmwFactory = new BMWFactoryImpl();
    private final FordFactoryImpl fordFactory = new FordFactoryImpl();

    public AudiCar createAudi() {
        HashSet<String> options = new HashSet<>();
        options.add("Audi");
        AudiDetails details = new AudiDetails(true);
        details.setOptions(options);
        return audiFactory.createCar(
                AudiColorsEnum.BLUE,
                AudiModelEnum.A_4,
                EngineVol.LOW_1_4,
                WheelSize.BIG_19,
                2020,
                details
        );
    }

    public BMWCar createBMW() {
        HashSet<String> options = new HashSet<>();
        options.add("BMW");
        BMWDetails details = new BMWDetails(true);
        details.setOptions(options);
        return bmwFactory.createCar(
                BMWColorsEnum.BLACK,
                BMWModelEnum.I_3,
                EngineVol.BIG_4_2,
                WheelSize.BIG_19,
                2020,
                details
        );
    }

    public FordCar createFord() {
        HashSet<String> options = new HashSet<>();
        options.add("Ford");
        FordDetails details = new FordDetails(true);
        details.setOptions(options);
        return fordFactory.createCar(
                FordColorsEnum.ORANGE,
                FordModelEnum.EXPLORER,
                EngineVol.BIG_4_2,
                WheelSize.BIG_19,
                2020,
                details
        );
    }

    public void printAudiFactorySetup() {
        System.out.println("------------------------");
        System.out.println("-----------AUDI---------");
        System.out.println(audiFactory.getColors());
        System.out.println(audiFactory.getModels());
        System.out.println(audiFactory.getWheelSizes());
        System.out.println(audiFactory.getEngines());
        System.out.println("------------------------");
    }

    public void printBMWFactorySetup() {
        System.out.println("------------------------");
        System.out.println("-----------BMV---------");
        System.out.println(bmwFactory.getColors());
        System.out.println(bmwFactory.getModels());
        System.out.println(bmwFactory.getWheelSizes());
        System.out.println(bmwFactory.getEngines());
        System.out.println("------------------------");
    }

    public void printFordFactorySetup() {
        System.out.println("------------------------");
        System.out.println("-----------Ford---------");
        System.out.println(fordFactory.getColors());
        System.out.println(fordFactory.getModels());
        System.out.println(fordFactory.getWheelSizes());
        System.out.println(fordFactory.getEngines());
        System.out.println("------------------------");
    }
}
