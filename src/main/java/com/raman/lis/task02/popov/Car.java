package com.raman.lis.task02.popov;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Car extends Auto_Factory{
    protected String colour;
    protected String model;
    protected Date dateCreate;
    protected int sizeWheels;
    protected int volumeEngine;
    protected ArrayList<String> option = new ArrayList<>();

    protected Car(int colour,int model, int sizeWheels, int volumeEngine, int option) {
        this.model = listModel.get(model-1);
        this.volumeEngine = listVolumeEngine.get(volumeEngine-1);
        this.colour = listColour.get(colour-1);
        this.sizeWheels = listSizeWheels.get(sizeWheels-1);
        this.dateCreate = new Date();
        this.option.add(Service.listOption.get(option-1));
    }

    protected Car(int colour,int model, int sizeWheels, int volumeEngine) {
        this.model = listModel.get(model-1);
        this.volumeEngine = listVolumeEngine.get(volumeEngine-1);
        this.colour = listColour.get(colour-1);
        this.sizeWheels = listSizeWheels.get(sizeWheels-1);
        this.dateCreate = new Date();
    }

    public Car() {

    }

    void printCharacteristicCar(Car car) {
        System.out.println("Colour of the car: " + car.colour);
        System.out.println("Model of the car: " + car.model);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd_MM_yyyy");
        System.out.println("Date of create the car: " + dateFormat.format(car.dateCreate));
        System.out.println("Size of the wheels: " + car.sizeWheels);
        System.out.println("Volume of the engine: " + car.volumeEngine);
        System.out.println("List of option: ");

        for (String optio: option){
            System.out.println(optio);
        }

    }
}
