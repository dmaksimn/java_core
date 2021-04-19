package com.raman.lis.task03.shafalovich;

import com.raman.lis.task03.shafalovich.enums.CarColors;
import com.raman.lis.task03.shafalovich.enums.CarEngines;
import com.raman.lis.task03.shafalovich.enums.CarWheels;

public class AudiCar extends Car {

    AudiCar(int yearOfIssue, CarEngines engines, CarWheels wheels, CarColors colors) {
        super("Audi", yearOfIssue, engines.getEngine(), wheels.getWheels(), colors.getColor());
    }
}

