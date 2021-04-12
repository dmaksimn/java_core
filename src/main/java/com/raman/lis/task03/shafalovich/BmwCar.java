package com.raman.lis.task03.shafalovich;

import java.util.Objects;

public class BmwCar extends Car{

    BmwCar(int yearOfIssue, CarEngines engines, CarWheels wheels, CarColors colors) {
        setModel("BMW");
        setYearOfIssue(yearOfIssue);
        setEngineValue(engines.getEngine());
        setWheelSize(wheels.getWheels());
        setColor(colors.getColor());
        setOptions("Отсутствуют");
    }
}
