package com.raman.lis.task03.bedareva.Services;

import com.raman.lis.task03.bedareva.Cars.Car;
import com.raman.lis.task03.bedareva.Enum.Color;

public class ChangeColorService extends Service implements ColorChangeable {

    @Override
    public Car changeColor(Car car, Color color) {
        if (car != null && color != null) {
            if (car.changeColor(color)) {
                return car;
            }
        }
        return null;
    }
}
