package com.raman.lis.task03.shafalovich;

import com.raman.lis.task03.shafalovich.enums.CarColors;
import com.raman.lis.task03.shafalovich.enums.CarEngines;
import com.raman.lis.task03.shafalovich.enums.CarWheels;

public class BmwCar extends Car {

    BmwCar(int yearOfIssue, CarEngines engines, CarWheels wheels, CarColors colors) {
        super("BMW", yearOfIssue, engines.getEngine(), wheels.getWheels(), colors.getColor());
    }
}
