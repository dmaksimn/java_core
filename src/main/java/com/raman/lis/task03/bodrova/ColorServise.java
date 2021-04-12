package com.raman.lis.task03.bodrova;

import java.util.Arrays;
import java.util.List;

public abstract class ColorServise extends Service{

    public MercedesFactory mercedesFactory;

    public ColorServise(MercedesFactory mercedesFactory) {
        this.mercedesFactory = mercedesFactory;
    }


    public void changeColor(Car car, String newColor) {
        System.out.println("Вы выбрали цвет " + newColor);
        List<String> availableColors = Arrays.asList(mercedesFactory.getColors().clone());
        if (!availableColors.contains(newColor)) {
            System.out.println("Данный цвет недоступен!");
            mercedesFactory.printColorsList();
            return;
        }
        System.out.println("Цвет автомобиля изменен на " + newColor);
        car.setColor(newColor);
    }
}
