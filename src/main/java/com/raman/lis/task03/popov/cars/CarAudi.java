package com.raman.lis.task03.popov.cars;

import com.raman.lis.task03.popov.factory.AutoFactoryAudi;

public class CarAudi extends Car implements Cars {
    private final String model;
    private final String typeCar;
    AutoFactoryAudi autoFactoryAudi = new AutoFactoryAudi();

    public CarAudi(String colour, int sizeWheels,
                   int volumeEngine, String option, String date, String typeCar) {
        super(colour, sizeWheels, volumeEngine, option, date);
        this.typeCar = findElement(autoFactoryAudi.getListTypeCar(), typeCar);
        this.model = "Audi";
    }

    public CarAudi(String colour, int sizeWheels, int volumeEngine, String date,
                   String typeCar) {
        super(colour, sizeWheels, volumeEngine, date);
        this.typeCar = findElement(autoFactoryAudi.getListTypeCar(), typeCar);
        this.model = "Audi";
    }

    @Override
    public void printCharacteristicCar(Car car) {
        System.out.println("Model of the car: " + this.model);
        System.out.println("Colour of the car: " + car.getColour());
        System.out.println("Date of create the car: " + car.getDate());
        System.out.println("Size of the wheels: " + car.getSizeWheels());
        System.out.println("Volume of the engine: " + car.getVolumeEngine());
        System.out.println("Type this car is " + this.typeCar);
        System.out.println("List of option: ");

        for (String optio : car.getOption()) {
            System.out.println(optio);
        }
    }

}

