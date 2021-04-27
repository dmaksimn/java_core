package com.raman.lis.task03.badrova.company1;

import com.raman.lis.task03.badrova.company.OptionsChanging;

public abstract class Service implements OptionsChanging {


    @Override
    public void changeColor(Car car, String newColor) {
        System.out.println("Вы выбрали цвет " + newColor);
    }

    @Override
    public void changeWheelSize(Car car, String newWheelSize) {
        System.out.println("Вы выбрали размер колес " + newWheelSize);
    }

    @Override
    public void addOption(Car car, String optionToAdd) {
        System.out.println("Опция " + optionToAdd + " добавлена в автомобиль.");
        car.getOptions().add(optionToAdd);
    }

    @Override
    public void removeOption(Car car, String optionToRemove) {
        System.out.println("Опция " + optionToRemove + " удалена.");
        car.getOptions().remove(optionToRemove);
    }


}
