package com.raman.lis.task03.alexander.grigorovich.factory;

import com.raman.lis.task03.alexander.grigorovich.model.TruckCar;

import java.util.ArrayList;

public interface TruckCarFactoryInterface {

    TruckCar createNewTruckCar(String color, String model, int diameterOfWheels,
                           double volumeOfEngine, int liftingCapacity);

}
