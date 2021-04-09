package com.raman.lis.task03.me.service.impl;

import com.raman.lis.task03.me.model.EngineVol;
import com.raman.lis.task03.me.model.WheelSize;
import com.raman.lis.task03.me.model.car.BMWCar;
import com.raman.lis.task03.me.model.color.BMWColorsEnum;
import com.raman.lis.task03.me.model.details.BMWDetails;
import com.raman.lis.task03.me.model.model.BMWModelEnum;
import com.raman.lis.task03.me.service.AbstractFactory;

public class BMWFactoryImpl
        extends AbstractFactory<BMWCar, BMWDetails, BMWColorsEnum, BMWModelEnum> {

    public BMWFactoryImpl() {
        super(BMWModelEnum.class, BMWColorsEnum.class);
        addToStorage(
                new BMWCar(
                        BMWColorsEnum.BLACK,
                        BMWModelEnum.I_3,
                        2020,
                        WheelSize.BIG_19,
                        EngineVol.BIG_4_2,
                        true
                )
        );
    }

    @Override
    public BMWCar createCar(BMWColorsEnum color,
                            BMWModelEnum model,
                            EngineVol engineVol,
                            WheelSize wheelSize,
                            int year,
                            BMWDetails details) {
        BMWCar car = getFromStorageByParams(model, engineVol, year);
        if (car == null) {
            car = new BMWCar(
                    color,
                    model,
                    year,
                    wheelSize,
                    engineVol,
                    details.ismVersion()
            );
        }
        setOptions(car, details);
        return car;
    }

}
