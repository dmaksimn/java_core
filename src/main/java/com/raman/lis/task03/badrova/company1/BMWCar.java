package com.raman.lis.task03.badrova.company1;

import java.util.Objects;

public class BMWCar extends Car{

    private final String BRANDBMW = "BMW";

    public BMWCar(String model, int manufacturingYear, int engineVolume, String color, String wheelSize) {
        this.model = model;
        this.manufacturingYear = manufacturingYear;
        this.engineVolume = engineVolume;
        this.color = color;
        this.wheelSize = wheelSize;
    }

    public String toString() {
        return "Автомобиль: " + "марка = " + BRANDBMW + ", модель = " + model  + ", год выпуска = " + manufacturingYear
                + ", объем двигателя = " + engineVolume + "см3, цвет = " + color + ", размер колес = "
                + wheelSize + ", опции = " + optionsAvailability();
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return manufacturingYear == car.manufacturingYear && engineVolume == car.engineVolume && BRANDBMW.equals(car.brand)
                && model.equals(car.model) && color.equals(car.color) && wheelSize.equals(car.wheelSize)
                && options.equals(car.options);
    }

    public int hashCode() {
        return Objects.hash(BRANDBMW, manufacturingYear, model, engineVolume, color, wheelSize, options);
    }

}
