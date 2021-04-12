package com.raman.lis.task02.bodrova;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Car {

    private final String BRAND; //Неизменяемые свойства у каждой машины
    private final int manufacturingYear;
    private final String model;
    private final int engineVolume;
    private String color; // Возможность замены цвета из условия здесь
    private String wheelSize;
    private final List<String> options = new ArrayList<>();

    public Car( String BRAND, String model, int manufacturingYear, int engineVolume, String color, String wheelSize) {
        this.BRAND = BRAND;
        this.model = model;
        this.manufacturingYear = manufacturingYear;
        this.engineVolume = engineVolume;
        this.color = color;
        this.wheelSize = wheelSize;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWheelSize(String wheelSize) {
        this.wheelSize = wheelSize;
    }

    public List<String> getOptions() {
        return options;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return manufacturingYear == car.manufacturingYear && engineVolume == car.engineVolume && BRAND.equals(car.BRAND)
                && model.equals(car.model) && color.equals(car.color) && wheelSize.equals(car.wheelSize)
                && options.equals(car.options);
    }

    public int hashCode() {
        return Objects.hash(BRAND, manufacturingYear, model, engineVolume, color, wheelSize, options);
    }

    public String toString() {
        return "Автомобиль: " + "марка = " + BRAND + ", модель = " + model  + ", год выпуска = " + manufacturingYear
                + ", объем двигателя = " + engineVolume + "см3, цвет = " + color + ", размер колес = "
                + wheelSize + ", опции = " + optionsAvailability();
    }

    private String optionsAvailability () {
        return options.size() == 0 ? "без опций" : options.toString();
    }
}
