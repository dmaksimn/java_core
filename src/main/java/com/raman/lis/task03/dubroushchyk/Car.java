package com.raman.lis.task03.dubroushchyk;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Car {

    private String color;
    private final String model;
    private final int yearProduction;
    private int sizeWheels;
    private final int engineVolume;
    private List<String> optional = new ArrayList<>();

    protected Car(String color, String model, int yearProduction, int sizeWheels, int engineVolume) {
        this.color = color;
        this.model = model;
        this.yearProduction = yearProduction;
        this.sizeWheels = sizeWheels;
        this.engineVolume = engineVolume;
    }

    void info() {
                StringBuilder builder = new StringBuilder();
                builder.append("Цвет авто: " + color + "\n");
                builder.append("Марка авто: " + model + "\n");
                builder.append("Год выпуска авто: " + yearProduction + "\n");
                builder.append("Размер колёс авто: " + sizeWheels + "\n");
                builder.append("Объём двигателя авто: " + engineVolume + "\n");
                if (optional.size() >= 1) {
                    builder.append("Список опций: " + optional + "\n");
                } else {
                    builder.append("Список опций: нет дополнительных опций" + "\n");
                }
                System.out.println(builder);
    }

    public boolean compareCar(String color, String model, int yearProduction,
                                       int sizeWheels, int engineVolume) {
            return this.yearProduction == yearProduction && this.sizeWheels == sizeWheels
                    && this.engineVolume == engineVolume && Objects.equals(this.color, color)
                    && Objects.equals(this.model, model);
    }

    protected void setSizeWheels(int sizeWheels) {
        this.sizeWheels = sizeWheels;
    }

    protected void addOptional(String string) {
        optional.add(string);
    }

    protected void removeOptional(String string) {
        optional.remove(string);
    }

    protected void setColor (String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return  "Цвет авто: " + color + '\n' +
                "Марка авто: " + model + '\n' +
                "Год выпуска авто: " + yearProduction + '\n' +
                "Размер колёс авто: " + sizeWheels + '\n' +
                "Объём двигателя авто: " + engineVolume + '\n' + '\n';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return yearProduction == car.yearProduction && sizeWheels == car.sizeWheels
                && engineVolume == car.engineVolume && Objects.equals(color, car.color)
                && Objects.equals(model, car.model) && Objects.equals(optional, car.optional);
    }
}

