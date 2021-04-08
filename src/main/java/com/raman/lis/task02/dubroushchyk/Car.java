package com.raman.lis.task02.dubroushchyk;


import java.util.Arrays;
import java.util.Objects;

public class Car {

    private String color;
    private final String model;
    private final int yearProduction;
    private int sizeWheels;
    private final int engineVolume;
    private String[] optional = new String[0];

    Car(String color, String model, int yearProduction, int sizeWheels, int engineVolume) {
        this.color = color;
        this.model = model;
        this.yearProduction = yearProduction;
        this.sizeWheels = sizeWheels;
        this.engineVolume = engineVolume;
    }

    void addOptional(String string) {
        String[] array = Arrays.copyOf(optional, optional.length + 1);
        optional = array;
        optional[optional.length - 1] = string;
    }

    void removeOptional(String string) {
        for (int i = 0; i < optional.length; i++) {
            if (optional[i].equalsIgnoreCase(string)) {
                for (int j = i; j < optional.length - 1; j++) {
                    optional[i] = optional[i + 1];
                }
                String[] array = Arrays.copyOf(optional, optional.length - 1);
                optional = array;
            }
        }
    }

    void Info() {
        System.out.println("Цвет авто: " + color);
        System.out.println("Марка авто: " + model);
        System.out.println("Год выпуска авто: " + yearProduction);
        System.out.println("Размер колёс авто: " + sizeWheels);
        System.out.println("Объём двигателя авто: " + engineVolume);
        if (optional.length >= 1) {
            System.out.println("Список опций: " + Arrays.toString(optional));
        } else {
            System.out.println("Список опций: нет дополнительных опций");
        }
    }

    void setColor(String color) {
        this.color = color;
    }

    void setSizeWheels(int sizeWheels) {
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
                && Objects.equals(model, car.model) && Arrays.equals(optional, car.optional);
    }
}

