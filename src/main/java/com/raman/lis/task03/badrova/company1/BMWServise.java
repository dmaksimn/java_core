package com.raman.lis.task03.badrova.company1;

import java.util.Arrays;
import java.util.List;

public class BMWServise extends Service {

    private final BMWFactory bmwFactory;

    public BMWServise(BMWFactory bmwFactory) {
        this.bmwFactory = bmwFactory;
    }

    @Override
    public void changeColor(Car car, String newColor) {
        System.out.println("Вы выбрали цвет " + newColor);
        List<String> availableColors = Arrays.asList(bmwFactory.getColors().clone());
        if (!availableColors.contains(newColor)) {
            System.out.println("Данный цвет недоступен!");
            bmwFactory.printColorsList();
            return;
        }
        System.out.println("Цвет вашего автомобиля BMW изменен на " + newColor);
        car.setColor(newColor);
    }

    @Override
    public void changeWheelSize(Car car, String newWheelSize) {
        System.out.println("Вы выбрали размер колес " + newWheelSize);
        List<String> availableWheelSizes = Arrays.asList(bmwFactory.getWheelSizes().clone());
        if(!availableWheelSizes.contains(newWheelSize)){
            System.out.println("Размер колес недоступен!");
            bmwFactory.printWheelSizeList();
            return;
        }
        System.out.println("Размер колес вашего автомобиля BMW изменен на " + newWheelSize);
        car.setWheelSize(newWheelSize);
    }

}
