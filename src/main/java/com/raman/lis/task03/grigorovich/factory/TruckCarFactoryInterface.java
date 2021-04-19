package com.raman.lis.task03.grigorovich.factory;

import com.raman.lis.task03.grigorovich.model.TruckCar;

public interface TruckCarFactoryInterface {

    TruckCar createNewTruckCar(String color, String model, int diameterOfWheels,
                               double volumeOfEngine, int liftingCapacity);

}
