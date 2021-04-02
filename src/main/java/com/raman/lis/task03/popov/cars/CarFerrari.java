package com.raman.lis.task03.popov.cars;

public class CarFerrari extends Car implements Cars {
    private final String model;

    public CarFerrari(String colour, int sizeWheels,
                      int volumeEngine, String option, String date) {
        super(colour, sizeWheels, volumeEngine, option, date);
        this.model = "Ferrari";
    }

    public CarFerrari(String colour, int sizeWheels, int volumeEngine, String date) {
        super(colour, sizeWheels, volumeEngine, date);
        this.model = "Ferrari";
    }

    @Override
    public void printCharacteristicCar(Car car) {
        System.out.println("Model of the car: " + this.model);
        System.out.println("Colour of the car: " + car.getColour());
        System.out.println("Date of create the car: " + car.getDate());
        System.out.println("Size of the wheels: " + car.getSizeWheels());
        System.out.println("Volume of the engine: " + car.getVolumeEngine());
        System.out.println("List of option: ");

        for (String optio : car.getOption()) {
            System.out.println(optio);
        }
    }

}

