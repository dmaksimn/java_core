package com.raman.lis.task03.bodrova;

import java.util.ArrayList;
import java.util.List;

public abstract class Car{

    private int manufacturingYear;
    private String model;
    private int engineVolume;
    private String color; // Возможность замены цвета из условия здесь
    private String wheelSize;
    private List<String> options = new ArrayList<>();

    public void setColor(String color) {
        this.color = color;
    }

    public Car(String model, int manufacturingYear, int engineVolume, String color, String wheelSize) {
        this.model = model;
        this.manufacturingYear = manufacturingYear;
        this.engineVolume = engineVolume;
        this.color = color;
        this.wheelSize = wheelSize;
    }

    private String optionsAvailability () {
        return options.size() == 0 ? "без опций" : options.toString();
    }

    public String toString() {
        return "Автомобиль: " + "модель = " + model  + ", год выпуска = " + manufacturingYear
                + ", объем двигателя = " + engineVolume + "см3, цвет = " + color + ", размер колес = "
                + wheelSize + ", опции = " + optionsAvailability();
    }

}
