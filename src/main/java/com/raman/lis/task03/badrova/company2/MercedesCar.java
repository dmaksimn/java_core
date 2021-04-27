package com.raman.lis.task03.badrova.company2;

import com.raman.lis.task03.badrova.company1.Car;

import java.util.Objects;

public class MercedesCar extends Car {

    private final String BRANDMERCEDES = "MERCEDES";

    public MercedesCar(String model, int engineVolume, String color) {
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
    }

    public String toString() {
        return "Автомобиль: "
                + "марка = " + BRANDMERCEDES
                + ", модель = " + model
                + ", объем двигателя = " + engineVolume
                + "см3, цвет = " + color + ", опции = " + optionsAvailability();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MercedesCar)) return false;
        MercedesCar that = (MercedesCar) o;
        return Objects.equals(BRANDMERCEDES, that.BRANDMERCEDES) && engineVolume == that.engineVolume && color.equals(that.color) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(BRANDMERCEDES);
    }
}
