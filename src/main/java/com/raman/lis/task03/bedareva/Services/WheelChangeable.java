package com.raman.lis.task03.bedareva.Services;

import com.raman.lis.task03.bedareva.Cars.Car;
import com.raman.lis.task03.bedareva.Enum.WheelSize;

public interface WheelChangeable {

    Car changeWheels(Car car, WheelSize wheelSize);
}
