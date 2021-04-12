package com.raman.lis.task02.bodrova;

import java.util.ArrayList;
import java.util.List;

public class Factory {

    private final String [] models;
    private final int [] engineVolumes;
    private final String [] colors;
    private final String [] wheelSizes;

    private List<Car> storehouseCars = new ArrayList<>();

    private Service service = new Service(this);;


    public Factory(String[] models, int[] engineVolumes,
                   String[] colors, String[] wheelSizes) {
        this.models = models;
        this.engineVolumes = engineVolumes;
        this.colors = colors;
        this.wheelSizes = wheelSizes;
        storehouseCars.add(new Car("Mercedes", "CLS", 2021,
                1500, "red", "R18"));
        storehouseCars.add(new Car("Mercedes", "Vito", 2010,
                2900, "silver", "R16"));
        storehouseCars.add(new Car("Mercedes", "Maybach", 2015,
                3900, "black", "R17"));
    }

    public Service getService() {
        return service;
    }

    public List<Car> getStorehouseCars() {
        return storehouseCars;
    }

    public String[] getColors() {
        return colors;
    }

    public String[] getWheelSizes() {
        return wheelSizes;
    }

    public void printModelsList () {
        System.out.println("Список доступных моделей: ");
        for (String model : models) {
            System.out.print(model + " ");
        }
        System.out.println();
    }

    public void printEngineVolumesList () {
        System.out.println("Доступные объемы двигателя: ");
        for (int engineVolume : engineVolumes) {
            System.out.print(engineVolume + " ");
        }

        System.out.println();
    }

    public void printColorsList () {
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

    public void createCar (Car orderedCar) {
        for (Car storehouseCar : storehouseCars) {
            if (storehouseCar.equals(orderedCar)){
                System.out.println("Такой автомобиль уже есть на складе!");
                return;
            }
        }
        System.out.println("Этот автомобиль изготовлен и добавлен на склад!");
        storehouseCars.add(orderedCar);
    }

    public void showStorage(){
        System.out.println("Заводской склад содержит следующие автомобили: ");
        for (int i = 0; i < storehouseCars.size(); i++) {
            System.out.println(i+1 + " " + storehouseCars.get(i));
        }
    }
}
