package com.raman.lis.task03.shafalovich;

public class GeelyCar extends Car{

    <T extends Number> GeelyCar(int yearOfIssue, T engineVolume, int wheelSize, String color, String options) {
        setModel("Geely");
        setYearOfIssue(yearOfIssue);
        setEngineVolume(engineVolume.doubleValue());
        setWheelSize(wheelSize);
        setColor(color);
        setOptions(options);
    }

    <T extends Number> GeelyCar(int yearOfIssue, T engineVolume, int wheelSize, String color) {
        setModel("Geely");
        setYearOfIssue(yearOfIssue);
        setEngineVolume(engineVolume.doubleValue());
        setWheelSize(wheelSize);
        setColor(color);
        setOptions("Отсутствуют");
    }

    GeelyCar() {
    }

}
