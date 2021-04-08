package com.raman.lis.task03.shafalovich;

public class AudiCar extends Car{

    <T extends Number> AudiCar(int yearOfIssue, T engineVolume, int wheelSize, String color, String options) {
        setModel("Audi");
        setYearOfIssue(yearOfIssue);
        setEngineVolume(engineVolume.doubleValue());
        setWheelSize(wheelSize);
        setColor(color);
        setOptions(options);
    }

    <T extends Number> AudiCar(int yearOfIssue, T engineVolume, int wheelSize, String color) {
        setModel("Audi");
        setYearOfIssue(yearOfIssue);
        setEngineVolume(engineVolume.doubleValue());
        setWheelSize(wheelSize);
        setColor(color);
        setOptions("Отсутствуют");
    }

    AudiCar() {
    }



}

