package com.raman.lis.task03.shafalovich;

public abstract class Car {

    private String model;
    private int yearOfIssue;
    private double engineValue;
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

    public double getEngineVolume() {
        return engineValue;
    }

    public void setEngineValue(double engineValue) {
        this.engineValue = engineValue;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Модель: " + model + "\n" + "Год выпуска: " + getYearOfIssue()
                + "\n" + "Объем двигателя: " + getEngineVolume() + "\n" + "Размер колес: " + getWheelSize()
                + "\n" + "Цвет: " + getColor() + "\n" + "Опции: " + getOptions() + "\n");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        Car car = (Car) o;
        return model.equals(car.model) && yearOfIssue == car.yearOfIssue && engineValue == car.engineValue;
    }
}
