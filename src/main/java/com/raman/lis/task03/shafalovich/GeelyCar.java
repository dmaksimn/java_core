package com.raman.lis.task03.shafalovich;

public class GeelyCar extends Car {

    GeelyCar(int yearOfIssue, CarEngines engines, CarWheels wheels, CarColors colors) {
        setModel("Geely");
        setYearOfIssue(yearOfIssue);
        setEngineValue(engines.getEngine());
        setWheelSize(wheels.getWheels());
        setColor(colors.getColor());
        setOptions("Отсутствуют");
    }
}
