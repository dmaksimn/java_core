package com.raman.lis.task03.shafalovich;

import com.raman.lis.task03.shafalovich.enums.CarColors;
import com.raman.lis.task03.shafalovich.enums.CarEngines;
import com.raman.lis.task03.shafalovich.enums.CarWheels;

public class AudiFactory extends Factory {

    @Override
    public Car createCar(int year, CarEngines value,
                         CarWheels wheels, CarColors color) {
        createAbsCar(year, value, wheels, color);
        AudiCar car = new AudiCar(getCheckedYear(), getCheckedValue(), getCheckedWheels(), getCheckedColor());
        return car;
    }
}
