package com.raman.lis.task03.badrova.company1;

import java.util.ArrayList;
import java.util.List;

public abstract class Car {

    protected String brand;
    protected int manufacturingYear;
    protected String model;
    protected int engineVolume;
    protected String color;
    protected String wheelSize;
    protected List<String> options = new ArrayList<>();

    protected String optionsAvailability () {
        return options.size() == 0 ? "без опций" : options.toString();
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


}
