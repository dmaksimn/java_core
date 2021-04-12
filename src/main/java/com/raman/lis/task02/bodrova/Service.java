package com.raman.lis.task02.bodrova;

import java.util.Arrays;
import java.util.List;

public class Service {

    private final Factory factory;

    public Service(Factory factory) {
        this.factory = factory;
    }


    public void changeColor (Car car, String newColor) {
        System.out.println("Вы выбрали цвет " + newColor);
        List<String> availableColors = Arrays.asList(factory.getColors().clone());
        if(!availableColors.contains(newColor)){
            System.out.println("Данный цвет недоступен!");
            factory.printColorsList();
            return;
        }
        System.out.println("Цвет автомобиля изменен на " + newColor);
        car.setColor(newColor);
    }

    public void changeWheelSize (Car car, String newWheelSize) {
        System.out.println("Вы выбрали размер колес " + newWheelSize);
        List<String> availableWheelSizes = Arrays.asList(factory.getWheelSizes().clone());
        if(!availableWheelSizes.contains(newWheelSize)){
            System.out.println("Размер колес недоступен!");
            factory.printWheelSizeList();
            return;
        }
        System.out.println("Размер колес изменен на " + newWheelSize);
        car.setWheelSize(newWheelSize);
    }

    public void addOption (Car car, String optionToAdd) {
        System.out.println("Опция " + optionToAdd + " добавлена в автомобиль.");
        car.getOptions().add(optionToAdd);
    }

    public void removeOption (Car car, String optionToRemove) {
        System.out.println("Опция " + optionToRemove + " удалена.");
        car.getOptions().remove(optionToRemove);
    }
}
