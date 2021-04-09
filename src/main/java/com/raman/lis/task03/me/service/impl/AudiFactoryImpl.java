package com.raman.lis.task03.me.service.impl;

import com.raman.lis.task03.me.model.EngineVol;
import com.raman.lis.task03.me.model.WheelSize;
import com.raman.lis.task03.me.model.car.AudiCar;
import com.raman.lis.task03.me.model.color.AudiColorsEnum;
import com.raman.lis.task03.me.model.details.AudiDetails;
import com.raman.lis.task03.me.model.model.AudiModelEnum;
import com.raman.lis.task03.me.service.AbstractFactory;

public class AudiFactoryImpl
        extends AbstractFactory<AudiCar, AudiDetails, AudiColorsEnum, AudiModelEnum> {

    public AudiFactoryImpl() {
        super(AudiModelEnum.class, AudiColorsEnum.class);
        addToStorage(
                new AudiCar(
                        AudiColorsEnum.BLUE,
                        AudiModelEnum.A_4,
                        2020,
                        WheelSize.BIG_19,
                        EngineVol.BIG_4_2,
                        true
                )
        );
    }

    @Override
    public AudiCar createCar(AudiColorsEnum color,
                             AudiModelEnum model,
                             EngineVol engineVol,
                             WheelSize wheelSize,
                             int year,
                             AudiDetails details) {
        AudiCar car = getFromStorageByParams(model, engineVol, year);
        if (car == null) {
            car = new AudiCar(
                    color,
                    model,
                    year,
                    wheelSize,
                    engineVol,
                    details.isQuartoInstalled()
            );
        }
        setOptions(car, details);
        return car;
    }
}
