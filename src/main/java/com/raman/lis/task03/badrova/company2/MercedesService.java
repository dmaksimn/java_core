package com.raman.lis.task03.badrova.company2;

import com.raman.lis.task03.badrova.company1.Car;
import com.raman.lis.task03.badrova.company1.Service;

import java.util.Arrays;
import java.util.List;

public class MercedesService extends Service {

    private final MercedesFactory mercedesFactory;

    public MercedesService(MercedesFactory mercedesFactory) {
        this.mercedesFactory = mercedesFactory;
    }

    @Override
    public void changeColor(Car car, String newColor) {
        System.out.println("Вы выбрали цвет " + newColor);
        List<String> availableColors = Arrays.asList(mercedesFactory.getColors().clone());
        if (!availableColors.contains(newColor)) {
            System.out.println("Данный цвет недоступен!");
            mercedesFactory.printColorsList();
            return;
        }
        System.out.println("Цвет вашего автомобиля Mercedes изменен на " + newColor);
        car.setColor(newColor);
    }

    public void changeWheelSize(Car car, String newWheelSize) {
        System.out.println("Вы выбрали размер колес " + newWheelSize);
        List<String> availableWheelSizes = Arrays.asList(mercedesFactory.getWheelSizes().clone());
        if(!availableWheelSizes.contains(newWheelSize)){
            System.out.println("Размер колес недоступен!");
            mercedesFactory.printWheelSizeList();
            return;
        }
        System.out.println("Размер колес вашего автомобиля Mercedes изменен на " + newWheelSize);
        car.setWheelSize(newWheelSize);
    }
}
