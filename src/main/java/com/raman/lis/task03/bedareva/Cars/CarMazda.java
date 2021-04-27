package com.raman.lis.task03.bedareva.Cars;

import com.raman.lis.task03.bedareva.Enum.Color;
import com.raman.lis.task03.bedareva.Enum.EngineVolume;
import com.raman.lis.task03.bedareva.Enum.Model;
import com.raman.lis.task03.bedareva.Enum.WheelSize;

public class CarMazda extends Car {

    public CarMazda(Color color, int year, WheelSize wheelSize, EngineVolume engineVolume) {
        super(color, Model.MAZDA, year, wheelSize, engineVolume);
    }
}