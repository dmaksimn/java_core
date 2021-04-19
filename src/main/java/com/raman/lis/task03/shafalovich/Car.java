package com.raman.lis.task03.shafalovich;

public abstract class Car {

    private String model;
    private int yearOfIssue;
    private double engineValue;
    private String color;
    private int wheelSize;
    private String options;

    protected Car(String model, int yearOfIssue, double engineValue, int wheelSize, String color) {
        this.model = model;
        this.yearOfIssue = yearOfIssue;
        this.engineValue = engineValue;
        this.wheelSize = wheelSize;
        this.color = color;
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
        sb.append("\n\tМодель: ").append(model)
                .append("\n\tГод выпуска: ").append(yearOfIssue)
                .append("\n\tОбъем двигателя: ").append(engineValue)
                .append("\n\tРазмер колес: ").append(wheelSize)
                .append("\n\tЦвет: ").append(color)
                .append("\n\tОпции: ").append(options)
                .append("\n");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        Car car = (Car) o;
        return model.equals(car.model) && yearOfIssue == car.yearOfIssue && engineValue == car.engineValue;
    }
}
