package com.raman.lis.task03.popov.cars;

import com.raman.lis.task03.popov.factory.AutoFactoryBMV;
import com.raman.lis.task03.popov.service.ServiceCustomizationOption;

import java.util.LinkedList;

public abstract class Car implements Cars {
    private String colour;
    private final String date;
    private int sizeWheels;
    private final int volumeEngine;
    private LinkedList<String> option = new LinkedList<>();

    AutoFactoryBMV autoFactoryBMV = new AutoFactoryBMV();
    ServiceCustomizationOption serviceCustomizationOption = new ServiceCustomizationOption();

    Car(String colour, int sizeWheels, int volumeEngine, String option, String date) {
        this.volumeEngine = findElement(autoFactoryBMV.getListVolumeEngine(), volumeEngine);
        this.colour = findElement(autoFactoryBMV.getListColour(), colour);
        this.sizeWheels = findElement(autoFactoryBMV.getListSizeWheels(), sizeWheels);
        this.date = date;
        this.option.add(findElement(serviceCustomizationOption.getListOption(), option));
    }

    Car(String colour, int sizeWheels, int volumeEngine, String date) {
        this.volumeEngine = findElement(autoFactoryBMV.getListVolumeEngine(), volumeEngine);
        this.colour = findElement(autoFactoryBMV.getListColour(), colour);
        this.sizeWheels = findElement(autoFactoryBMV.getListSizeWheels(), sizeWheels);
        this.date = date;
    }

    public String findElement(LinkedList<String> list, String element) {
        int i = 0;
        String element1 = null;
        for (String anyElement : list) {
            if (element.equals(anyElement)) {
                element1 = anyElement;
                i = 1;
            } else if (i == 0) {
                element1 = "Такого нет в продаже!";
            }
        }
        return element1;
    }

    public int findElement(LinkedList<Integer> list, int element) {
        int a = 0;
        int i = 0;
        for (Integer anyElement : list) {
            if (element == (anyElement)) {
                a = element;
                i = 1;
            } else if (i == 0) {
                a = 0;
            }
        }
        return a;
    }

    public void setColour(String colour) {
        this.colour = findElement(autoFactoryBMV.getListColour(), colour);
    }

    public void setSizeWheels(int sizeWheels) {
        this.sizeWheels = findElement(autoFactoryBMV.getListSizeWheels(), sizeWheels);
    }

    public String getColour() {
        return this.colour;
    }

    public String getDate() {
        return date;
    }

    public int getSizeWheels() {
        return sizeWheels;
    }

    public int getVolumeEngine() {
        return volumeEngine;
    }

    public LinkedList<String> getOption() {
        return option;
    }

}
