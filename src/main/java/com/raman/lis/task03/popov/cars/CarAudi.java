package com.raman.lis.task03.popov.cars;

import com.raman.lis.task03.popov.factory.AutoFactory;
import com.raman.lis.task03.popov.factory.AutoFactoryBMV;

public class CarAudi extends Car implements Cars{
    private final String model;
    private final String typeCar;
    AutoFactoryBMV autoFactoryBMV = new AutoFactoryBMV();

    public CarAudi(String colour, int sizeWheels,
                  int volumeEngine,String date,String typeCar,String option){
        super(colour,sizeWheels,volumeEngine,date,option);
        this.model = "Audi";
        this.typeCar = findElement(autoFactoryBMV.getListTypeCar(),typeCar);
    }
    public CarAudi(String colour, int sizeWheels,
                   int volumeEngine,String date,String typeCar){
        super(colour,sizeWheels,volumeEngine,date);
        this.model = "Audi";
        this.typeCar = findElement(autoFactoryBMV.getListTypeCar(),typeCar);
    }

    @Override
    public void printCharacteristicCar(Car car) {
        System.out.println("Model of the car: " + model);
        System.out.println("Colour of the car: " + car.getColour());
        System.out.println("Date of create the car: " + car.getDate());
        System.out.println("Size of the wheels: " + car.getSizeWheels());
        System.out.println("Volume of the engine: " + car.getVolumeEngine());
        System.out.println("Type this car is " + typeCar);
        System.out.println("List of option: ");
        for (String optio: car.getOption()){
            System.out.println(optio);
        }
    }

}

