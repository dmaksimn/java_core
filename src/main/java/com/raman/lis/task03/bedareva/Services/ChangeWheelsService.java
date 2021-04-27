package com.raman.lis.task03.bedareva.Services;

import com.raman.lis.task03.bedareva.Cars.Car;
import com.raman.lis.task03.bedareva.Enum.WheelSize;

public class ChangeWheelsService extends Service implements WheelChangeable {

    @Override
    public Car changeWheels(Car car, WheelSize wheelSize) {
        if (car != null && wheelSize != null) {
            if (car.changeWheels(wheelSize)) {
                return car;
            }
        }
        return null;
    }
}
