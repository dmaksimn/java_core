package com.raman.lis.task03.dubroushchyk;

import com.raman.lis.task03.dubroushchyk.Enum.Audi.CarColorAudi;
import com.raman.lis.task03.dubroushchyk.Enum.Audi.CarEngineVolumeAudi;
import com.raman.lis.task03.dubroushchyk.Enum.Audi.CarModelAudi;
import com.raman.lis.task03.dubroushchyk.Enum.Audi.CarSizeWheelsAudi;

public class CarAudi extends Car {

    public CarAudi(CarColorAudi color, CarModelAudi model, int yearProduction,
                   CarSizeWheelsAudi sizeWheels, CarEngineVolumeAudi engineVolume) {
        super(color.getColor(), model.getModel(), yearProduction,
                Integer.parseInt(sizeWheels.getSizeWheels()), Integer.parseInt(engineVolume.getVolume()));
    }
}
