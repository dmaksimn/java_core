package com.raman.lis.task03.shafalovich;

import java.util.Objects;

public class BmwCar extends Car{

    <T extends Number> BmwCar(int yearOfIssue, T engineVolume, int wheelSize, String color, String options) {
        setModel("BMW");
        setYearOfIssue(yearOfIssue);
        setEngineVolume(engineVolume.doubleValue());
        setWheelSize(wheelSize);
        setColor(color);
        setOptions(options);
    }

    <T extends Number> BmwCar(int yearOfIssue, T engineVolume, int wheelSize, String color) {
        setModel("BMW");
        setYearOfIssue(yearOfIssue);
        setEngineVolume(engineVolume.doubleValue());
        setWheelSize(wheelSize);
        setColor(color);
        setOptions("Отсутствуют");
    }

    BmwCar() {
    }

}
