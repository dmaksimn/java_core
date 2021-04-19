package com.raman.lis.task03.bedareva;

import java.util.ArrayList;
import java.util.List;

public abstract class Car {
    protected Color color;
    protected final Model model;
    protected final int year;
    protected WheelSize wheelSize;
    protected final EngineVolume engineVolume;
    protected List<Option> optionList;

    Car(Color color, Model model, int year, WheelSize wheelSize, EngineVolume engineVolume) {
        this.model = model;
        this.color = color;
        this.wheelSize = wheelSize;
        this.year = year;
        this.engineVolume = engineVolume;
    }

    public boolean changeColor(Color color) {
        if (color != null) {
            this.color = color;
            System.out.println("Цвет изменен");
            return true;
        } else {
            return false;
        }
    }

    public void changeWheels(WheelSize newWheels) {
        if (newWheels == null) {
            throw new NullPointerException();
        }
        wheelSize = newWheels;
        System.out.println("Колеса заменены");
    }

    public boolean addOptionToList(Option option) {
        if (option != null) {
            if (optionList == null) {
                optionList = new ArrayList<>();
            }
            optionList.add(option);
            System.out.println("Опция добавлена");
            return true;
        } else {
            return false;
        }
    }

    public boolean deleteOptionFromList(Option option) {
        if (option != null) {
            if (optionList != null && optionList.size() > 0) {
                if (optionList.contains(option)) {
                    optionList.remove(option);
                    System.out.println("Опция удалена");
                } else {
                    System.out.println("Такой опции в машине нет, удалить ее невозможно");
                }
            } else {
                System.out.println("Список опций пуст.");
            }
            return true;
        } else {
            return false;
        }
    }

    public void infoAboutCar() {
        StringBuilder builder = new StringBuilder("Цвет авто: ")
                .append(color)
                .append(", Марка авто: ")
                .append(model)
                .append(", Год авто: ")
                .append(year)
                .append(", Размер колёс авто: ")
                .append(wheelSize)
                .append(", Объём двигателя авто: ")
                .append(engineVolume);
        if (optionList == null || optionList.size() == 0) {
            builder.append(", Список опций: отсутствуют");
        } else {
            builder.append(", Список опций: ")
                    .append(optionList);
        }
        System.out.println("Информация об авто: " + builder);
    }

    public boolean compareCarAtWarehouse(Color color, Model model, int year,
                                         WheelSize wheelSize, EngineVolume engineVolume) {
        return this.year == year &&
                this.wheelSize == wheelSize &&
                this.engineVolume == engineVolume &&
                this.color == color &&
                this.model == model;
    }

    public boolean searchCarForChanges(Model model, int year, EngineVolume engineVolume) {
        return this.year == year &&
                this.engineVolume == engineVolume &&
                this.model == model;
    }
}


