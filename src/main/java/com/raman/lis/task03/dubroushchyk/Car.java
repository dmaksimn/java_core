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

    protected void addOptional(String string) {
        optional.add(string);
    }

    protected void removeOptional(String string) {
        optional.remove(string);
    }

    void Info() {
        System.out.println("Цвет авто: " + color);
        System.out.println("Марка авто: " + model);
        System.out.println("Год выпуска авто: " + yearProduction);
        System.out.println("Размер колёс авто: " + sizeWheels);
        System.out.println("Объём двигателя авто: " + engineVolume);
        if (optional.size() >= 1) {
            System.out.println("Список опций: " + optional);
        } else {
            System.out.println("Список опций: нет дополнительных опций");
        }
    }

    public boolean compareCarInStorage(String color, String model, int yearProduction,
                                int sizeWheels, int engineVolume) {
        return this.yearProduction == yearProduction && this.sizeWheels == sizeWheels
                && this.engineVolume == engineVolume && Objects.equals(this.color, color)
                && Objects.equals(this.model, model);
    }

    protected void setColor(String color) {
        this.color = color;
    }

    protected void setSizeWheels(int sizeWheels) {
        this.sizeWheels = sizeWheels;
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

