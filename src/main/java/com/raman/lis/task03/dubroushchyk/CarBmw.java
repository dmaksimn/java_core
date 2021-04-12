package com.raman.lis.task03.dubroushchyk;

import com.raman.lis.task03.dubroushchyk.Enum.Bmw.CarColorBmw;
import com.raman.lis.task03.dubroushchyk.Enum.Bmw.CarEngineVolumeBmw;
import com.raman.lis.task03.dubroushchyk.Enum.Bmw.CarModelBmw;
import com.raman.lis.task03.dubroushchyk.Enum.Bmw.CarSizeWheelsBmw;

public class CarBmw extends Car {

    private int currentYear = 2021;
    private int minYearForCreateCar = currentYear - 10;

    protected CarBmw(CarColorBmw color, CarModelBmw model, int yearProduction,
                     CarSizeWheelsBmw sizeWheels, CarEngineVolumeBmw engineVolume) {
        super(color.getColor(), model.getModel(), yearProduction,
                sizeWheels.getSizeWheels(), engineVolume.getVolume());
    }
}
