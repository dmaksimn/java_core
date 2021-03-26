package com.raman.lis.task02.popov;

import java.util.ArrayList;

public class Auto_Factory {
    ArrayList<String> listColour = new ArrayList<>();
    ArrayList<String> listModel = new ArrayList<>();
    ArrayList<Integer> listSizeWheels = new ArrayList<>();
    ArrayList<Integer> listVolumeEngine = new ArrayList<>();
    static ArrayList<Car> storage = new ArrayList<>();

    {
        //не знал где создать первоначальный заводской список моделей. Были варианты сделать обычный массив,
        //потом через методы сделать коллекцией, короче как то так.
        listModel.add("Mercedes");
        listModel.add("BMV");
        listModel.add("Audi");
        listModel.add("Lamborghini");
        listModel.add("Ford");

        listVolumeEngine.add(3700);
        listVolumeEngine.add(4300);
        listVolumeEngine.add(5700);
        listVolumeEngine.add(2100);
        listVolumeEngine.add(2900);

        listColour.add("Black");
        listColour.add("Grey");
        listColour.add("Sky_Blue");
        listColour.add("Yellow");
        listColour.add("Red");

        listSizeWheels.add(14);
        listSizeWheels.add(15);
        listSizeWheels.add(16);
        listSizeWheels.add(17);
        listSizeWheels.add(13);


    }

    Car createCar(int colour, int model, int sizeWheels, int volumeEngine) {
        return new Car(colour, model, sizeWheels, volumeEngine);
    }

    Car createCar(int colour, int model, int sizeWheels, int volumeEngine, int option) {
        return new Car(colour, model, sizeWheels, volumeEngine, option);
    }

    void addManyCarToStorage(int quantity, Car... car) {
        for (int i = 0; i < quantity; i++) {
            storage.add(car[i]);
        }
    }

    void addModelToListModel(String model) {
        listModel.add(model);
    }

    void addVolumeEngine(int volumeEngine) {
        listVolumeEngine.add(volumeEngine);
    }

    void addColour(String colour) {
        listColour.add(colour);
    }

    void addSizeWheels(int sizeWheels) {
        listSizeWheels.add(sizeWheels);
    }

    void printListModel() {
        int i = 1;
        System.out.println("List of model: ");
        for (String mode : listModel) {
            System.out.println(i + ") " + mode);
            i++;
        }
    }

    void printListVolumeEngine() {
        int i = 1;
        System.out.println("List of Volume Engine: ");
        for (int mode : listVolumeEngine) {
            System.out.println(i + ") " + mode);
            i++;
        }
    }

    void printListColour() {
        int i = 1;
        System.out.println("List of Colour: ");
        for (String mode : listColour) {
            System.out.println(i + ") " + mode);
            i++;
        }
    }

    void printListSizeWheels() {
        int i = 1;
        System.out.println("List of Size Wheels: ");
        for (int mode : listSizeWheels) {
            System.out.println(i + ") " + mode);
            i++;
        }
    }

}
