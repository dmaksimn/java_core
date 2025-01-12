package com.Task.Task07.CarConstructor;

import com.Task.Task07.CarProperties.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Car {

    private String color;
    private final String body;
    private final String model;
    private final int year;
    private int sizeWheels;
    private final String engineVolume;
    private final List<String> option = new ArrayList<>();

    public Car(String color, String body, String model, int year, int sizeWheels, String engineVolume) {
        this.color = color;
        this.body = body;
        this.model = model;
        this.year = year;
        this.sizeWheels = sizeWheels;
        this.engineVolume = engineVolume;
    }

    public void addOption(String string) {
        option.add(string);
    }

    public void deleteOption(String string) {
        option.remove(string);
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSizeWheel(int sizeWheels) {
        this.sizeWheels = sizeWheels;
    }

    public void carInfo() {
        String carPrint = "\tColor of car: " + color + '\n' +
                "\tBody of car: " + body + '\n' +
                "\tBrand of car: " + model + '\n' +
                "\tYear of car: " + year + '\n' +
                "\tSize wheel of car: " + sizeWheels + '\n' +
                "\tEngine volume of car: " + engineVolume;
        System.out.println(carPrint);
        if (option.size() >= 1) {
            System.out.println("Option list: " + option);
        } else {
            System.out.println("Option list: no option");
        }
    }

    public String toString() {
        return "Color of car: " + color + '\n' +
                "Body of car: " + body + '\n' +
                "Brand of car: " + model + '\n' +
                "Year of car: " + year + '\n' +
                "Size wheel of car: " + sizeWheels + '\n' +
                "Engine volume of car: " + engineVolume + '\n' +
                '\n';
    }

    public boolean compareCarInStorage(CarColor color, CarBody body, CarModel model, int year, CarSizeWheels sizeWheels, CarEngineVolume engineVolume) {
        return !(this.year != year ||
                !Objects.equals(this.sizeWheels, sizeWheels) ||
                !Objects.equals(this.engineVolume, engineVolume) ||
                !Objects.equals(this.color, color) ||
                !Objects.equals(this.body, body) ||
                !Objects.equals(this.model, model));
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return year == car.year &&
                sizeWheels == car.sizeWheels &&
                engineVolume.equals(car.engineVolume) &&
                Objects.equals(color, car.color) &&
                Objects.equals(model, car.model) &&
                Objects.equals(option, car.option);
    }
}