package com.raman.lis.task02.shafalovich;

public class Car {

    private String model;
    private int yearOfIssue;
    private double engineVolume;
    private String color;
    private int wheelSize;
    private String options;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public double getEngineValue() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWheelSize() {
        return wheelSize;
    }

    public void setWheelSize(int wheelSize) {
        this.wheelSize = wheelSize;
    }

    public String getOptions() {
        return options;
    }

    public void setOptions(String options) {
        this.options = options;
    }

    Car(){
    }

    Car(String model, String color, int yearOfIssue, double engineVolume, int wheelSize, String options) {

        this.model = model;
        this.yearOfIssue = yearOfIssue;
        this.wheelSize = wheelSize;
        this.engineVolume = engineVolume;
        this.color = color;
        this.options = options;
    }

    Car(String model, String color, int yearOfIssue, double engineVolume, int wheelSize) {

        this.model = model;
        this.yearOfIssue = yearOfIssue;
        this.wheelSize = wheelSize;
        this.engineVolume = engineVolume;
        this.color = color;
        this.options = "Отсутствуют";
    }

    public static void showCar(Car car) {

        System.out.println("Модель: " + car.model);
        System.out.println("Год выпуска: " + car.yearOfIssue);
        System.out.println("Объем двигателя: " + car.engineVolume);
        System.out.println("Цвет: " + car.color);
        System.out.println("Размер колес: " + car.wheelSize);
        System.out.println("Доступные опции: " + car.options);
    }



}
