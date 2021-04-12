package com.raman.lis.task03.me.service.impl;

import com.raman.lis.task03.me.model.EngineVol;
import com.raman.lis.task03.me.model.WheelSize;
import com.raman.lis.task03.me.model.car.FordCar;
import com.raman.lis.task03.me.model.color.FordColorsEnum;
import com.raman.lis.task03.me.model.details.FordDetails;
import com.raman.lis.task03.me.model.model.FordModelEnum;
import com.raman.lis.task03.me.service.AbstractFactory;

public class FordFactoryImpl
        extends AbstractFactory<FordCar, FordDetails, FordColorsEnum, FordModelEnum> {

    public FordFactoryImpl() {
        super(FordModelEnum.class, FordColorsEnum.class);
        addToStorage(
                new FordCar(
                        FordColorsEnum.ORANGE,
                        FordModelEnum.EXPLORER,
                        2020,
                        WheelSize.BIG_19,
                        EngineVol.BIG_4_2,
                        true
                )
        );
    }

    @Override
    public FordCar createCar(FordColorsEnum color,
                             FordModelEnum model,
                            EngineVol engineVol,
                            WheelSize wheelSize,
                            int year,
                             FordDetails details) {
        FordCar car = getFromStorageByParams(model, engineVol, year);
        if (car == null) {
            car = new FordCar(
                    color,
                    model,
                    year,
                    wheelSize,
                    engineVol,
                    details.isOffRoad()
            );
        }
        setOptions(car, details);
        return car;
    }

}
