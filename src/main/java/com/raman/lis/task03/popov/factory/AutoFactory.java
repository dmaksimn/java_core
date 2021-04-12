package com.raman.lis.task03.popov.factory;

import com.raman.lis.task03.popov.cars.Car;

import java.util.Arrays;
import java.util.LinkedList;

public abstract class AutoFactory implements Print {
    private final String[] arrayColour = {"Black", "Grey", "Sky_ Blue", "Yellow", "Red"};
    private final String[] arrayTypeCar = {"Sedan", "Universal", "Hatchback", "Minivan", "Off-road"};
    private final Integer[] arraySizeWheels = {14, 15, 16, 17, 13};
    private final Integer[] arrayVolumeEngine = {3700, 4300, 5700, 2100, 2900};

    private LinkedList<String> listColour = new LinkedList<>(Arrays.asList(arrayColour));
    private LinkedList<String> listTypeCar = new LinkedList<>(Arrays.asList(arrayTypeCar));
    private LinkedList<String> listDate = new LinkedList<>();
    private LinkedList<Integer> listSizeWheels = new LinkedList<>(Arrays.asList(arraySizeWheels));
    private LinkedList<Integer> listVolumeEngine = new LinkedList<>(Arrays.asList(arrayVolumeEngine));
    private LinkedList<Car> storage = new LinkedList<>();

    public abstract Car createCar(String colour, int sizeWheels,
                                  int volumeEngine, String option, String date);

    public LinkedList<String> getListColour() {
        return this.listColour;
    }

    public LinkedList<String> getListTypeCar() {
        return listTypeCar;
    }

    public LinkedList<Integer> getListVolumeEngine() {
        return listVolumeEngine;
    }

    public LinkedList<Integer> getListSizeWheels() {
        return this.listSizeWheels;
    }

    public LinkedList<String> getListDate() {
        return listDate;
    }

    public LinkedList<Car> getStorage() {
        return storage;
    }

    public String addStorge(Car car){
        storage.add(car);
        return "На склад добавлена машина";
    }

    public String removeCarOfStorage(Car car){
        if(storage.getFirst().equals("null")){
            return "Склад пуст";
        }else {
            storage.remove(car);
        }
        return "Со склада продана одна машина";
    }

    public void addVolumeEngine(int volumeEngine) {
        listVolumeEngine.add(volumeEngine);
    }

    public void addColour(String colour) {
        listColour.add(colour);
    }

    public void addSizeWheels(int sizeWheels) {
        listSizeWheels.add(sizeWheels);
    }

}
