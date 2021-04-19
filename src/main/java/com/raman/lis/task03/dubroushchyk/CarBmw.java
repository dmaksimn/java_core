package com.raman.lis.task03.dubroushchyk;

import com.raman.lis.task03.dubroushchyk.Enum.Bmw.CarColorMercedes;
import com.raman.lis.task03.dubroushchyk.Enum.Bmw.CarEngineVolumeMercedes;
import com.raman.lis.task03.dubroushchyk.Enum.Bmw.CarModelMercedes;
import com.raman.lis.task03.dubroushchyk.Enum.Bmw.CarSizeWheelsMercedes;

public class CarBmw extends Car {

    private int currentYear = 2021;
    private int minYearForCreateCar = currentYear - 10;

    protected CarBmw(CarColorMercedes color, CarModelMercedes model, int yearProduction,
                     CarSizeWheelsMercedes sizeWheels, CarEngineVolumeMercedes engineVolume) {
        super(color.getColor(), model.getModel(), yearProduction,
                Integer.parseInt(sizeWheels.getSizeWheels()), Integer.parseInt(engineVolume.getVolume()));
    }
}
