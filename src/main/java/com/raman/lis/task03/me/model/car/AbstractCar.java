package com.raman.lis.task03.me.model.car;

import com.raman.lis.task03.me.exception.ColorException;
import com.raman.lis.task03.me.model.EngineVol;
import com.raman.lis.task03.me.model.WheelSize;
import com.raman.lis.task03.me.model.color.CarColor;
import com.raman.lis.task03.me.model.model.Model;

import java.util.HashSet;

public abstract class AbstractCar {

    private final int year;
    private final Model model;
    private final EngineVol engineVol;

    private CarColor color;
    private WheelSize wheelSize;
    private HashSet<String> options;

    public AbstractCar(CarColor color,
                       Model model,
                       int year,
                       WheelSize wheelSize,
                       EngineVol engineVol) {
        this.year = year;
        this.model = model;
        this.engineVol = engineVol;

        this.color = color;
        this.wheelSize = wheelSize;
    }

    public abstract void changeColor(CarColor color) throws ColorException;

    public void changeWheels(WheelSize wheelSize) {
        this.wheelSize = wheelSize;
    }

    public void addOption(String option) {
        if (options == null) {
            options = new HashSet<>();
        }
        options.add(option);
    }

    public boolean removeOption(String option) {
        if (options == null) {
            return false;
        }
        return options.remove(option);
    }

    public StringBuilder getForPrint() {
        StringBuilder sb = new StringBuilder();
        sb.append("Car [")
                .append("\n\tcolor: ").append(getColor())
                .append(",\n\tmodel: ").append(getModel())
                .append(",\n\tyear: ").append(getYear())
                .append(",\n\twheelSize: ").append(getWheelSize())
                .append(",\n\tengineVol: ").append(getEngineVol())
                .append(",\n\toptions: ").append(
                getOptions() == null ? "EMPTY" : getOptions())
                .append("\n]");
        return sb;
    }

    public CarColor getColor() {
        return color;
    }

    public void setColor(CarColor color) {
        this.color = color;
    }

    public Model getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public WheelSize getWheelSize() {
        return wheelSize;
    }

    public void setWheelSize(WheelSize wheelSize) {
        this.wheelSize = wheelSize;
    }

    public EngineVol getEngineVol() {
        return engineVol;
    }

    public HashSet<String> getOptions() {
        return options;
    }

    public void setOptions(HashSet<String> options) {
        this.options = options;
    }

}
