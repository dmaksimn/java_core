package com.raman.lis.task03.shafalovich;

public class AudiCar extends Car {

    AudiCar(int yearOfIssue, CarEngines engines, CarWheels wheels, CarColors colors) {
        setModel("Audi");
        setYearOfIssue(yearOfIssue);
        setEngineValue(engines.getEngine());
        setWheelSize(wheels.getWheels());
        setColor(colors.getColor());
        setOptions("Отсутствуют");
    }
}

