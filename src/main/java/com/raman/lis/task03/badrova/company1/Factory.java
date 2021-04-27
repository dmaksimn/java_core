package com.raman.lis.task03.badrova.company1;

import com.raman.lis.task03.badrova.company.CarCreating;
import com.raman.lis.task03.badrova.company.PrintingCarInformation;

import java.util.ArrayList;
import java.util.List;

public abstract class Factory implements PrintingCarInformation, CarCreating {

    protected String [] models;
    protected int [] engineVolumes;
    protected String [] colors;
    protected String [] wheelSizes;
    protected List<Car> storehouseCars = new ArrayList<>();

    public List<Car> getStorehouseCars() {
        return storehouseCars;
    }

    public String[] getColors() {
        return colors;
    }

    public String[] getWheelSizes() {
        return wheelSizes;
    }

    @Override
    public void createCar(Car orderedCar) {
            for (Car storehouseCar : storehouseCars) {
                if (storehouseCar.equals(orderedCar)){
                    System.out.println("Такой автомобиль уже есть на складе!");
                    return;
                }
            }
            System.out.println("Этот автомобиль изготовлен и добавлен на склад!");
            storehouseCars.add(orderedCar);
        }

    @Override
    public void showStorage() {
        System.out.println("Заводской склад содержит следующие автомобили: ");
        for (int i = 0; i < storehouseCars.size(); i++) {
            System.out.println(i+1 + " " + storehouseCars.get(i));
        }
    }

    @Override
    public void printModelsList() {
        System.out.println("Список доступных моделей: ");
        for (String model : models) {
            System.out.print(model + " ");
        }
        System.out.println();
    }

    @Override
    public void printEngineVolumesList() {
        System.out.println("Доступные объемы двигателя: ");
        for (int engineVolume : engineVolumes) {
            System.out.print(engineVolume + " ");
        }
        System.out.println();
    }

    public void printColorsList() {
        System.out.println("Доступные цвета кузова: ");
        for (String color : colors) {
            System.out.print(color + " ");
        }
        System.out.println();
    }

    @Override
    public void printWheelSizeList() {
        System.out.println("Доступные размеры колес: ");
        for (String wheelSize : wheelSizes) {
            System.out.print(wheelSize + " ");
        }
        System.out.println();
    }
}
