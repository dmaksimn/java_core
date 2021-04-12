package com.raman.lis.task03.bodrova;

import java.util.ArrayList;
import java.util.List;

public abstract class Factory implements CreationCars{

    private String [] models;
    private int [] engineVolumes;
    private String [] colors;
    private String [] wheelSizes;
    private List<Car> storehouseCar = new ArrayList<>();

    private Service service;

    public Service getService() {
        return service;
    }

    public List<Car> getStorehouseCar() {
        return storehouseCar;
    }

    public String[] getColors() {
        return colors;
    }

    public Factory(String[] models, int[] engineVolumes,
                   String[] colors, String[] wheelSizes) {
        this.models = models;
        this.engineVolumes = engineVolumes;
        this.colors = colors;
        this.wheelSizes = wheelSizes;
    }


    public void createCar (Car orderedCar) {
        for (Car storehouseCar : storehouseCar) {
            if (storehouseCar.equals(orderedCar)){
                System.out.println("Такой автомобиль уже есть на складе!");
                return;
            }
        }
        System.out.println("Этот автомобиль изготовлен и добавлен на склад!");
        storehouseCar.add(orderedCar);
    }


    public void showStorage() {
        System.out.println("Заводской склад содержит следующие автомобили: ");
        for (int i = 0; i < storehouseCar.size(); i++) {
            System.out.println(i + 1 + " " + storehouseCar.get(i));
        }
    }


    public void printModelsList() {
        System.out.println("Список доступных моделей: ");
        for (String model : models) {
            System.out.print(model + " ");
        }
        System.out.println();
    }


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


    public void printWheelSizeList() {
        System.out.println("Доступные размеры колес: ");
        for (String wheelSize : wheelSizes) {
            System.out.print(wheelSize + " ");
        }
        System.out.println();
    }

}
