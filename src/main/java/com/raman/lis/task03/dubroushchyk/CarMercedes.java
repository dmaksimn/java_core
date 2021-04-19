package com.raman.lis.task03.dubroushchyk;

//звёздочка потому-что мне все Enum константы из этих package надо
import com.raman.lis.task03.dubroushchyk.Enum.Mercedes.*;

public class CarMercedes extends Car {

    protected CarMercedes(CarColorMercedes color, CarModelMercedes model, int yearProduction,
                          CarSizeWheelsMercedes sizeWheels, CarEngineVolumeMercedes engineVolume) {
        super(color.getColor(), model.getModel(), yearProduction,
                Integer.parseInt(sizeWheels.getSizeWheels()), Integer.parseInt(engineVolume.getVolume()));
    }
}
