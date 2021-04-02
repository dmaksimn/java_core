package com.raman.lis.task03.popov;

import com.raman.lis.task03.popov.cars.Car;
import com.raman.lis.task03.popov.cars.CarAudi;
import com.raman.lis.task03.popov.cars.CarFerrari;
import com.raman.lis.task03.popov.cars.Cars;
import com.raman.lis.task03.popov.factory.AutoFactoryAudi;
import com.raman.lis.task03.popov.factory.AutoFactoryBMV;
import com.raman.lis.task03.popov.service.ServiceCustomizationColor;
import com.raman.lis.task03.popov.service.ServiceCustomizationOption;

// не доделал высылаю то что есть
public class Main {

    public static void main(String[] args) {
        AutoFactoryBMV autoFactoryBMV = new AutoFactoryBMV();
        AutoFactoryAudi autoFactoryAudi = new AutoFactoryAudi();
        ServiceCustomizationColor serviceCustomizationColor = new ServiceCustomizationColor();
        ServiceCustomizationOption serviceCustomizationOption = new ServiceCustomizationOption();
        autoFactoryBMV.printList("cOlour");
        CarSalon carSalon = new CarSalon();
        Cars car = carSalon.createCarBMV("Grey", 14, 5700,
                "Leather of car", "12/03/2008");
        car.printCharacteristicCar((Car) car);
        System.out.println();
        CarAudi carAudi = carSalon.createCarAudi("Black", 15, 3700,
                "10/01/2012", "Universal");
        carAudi.printCharacteristicCar(carAudi);
        System.out.println();

        Cars carFerrari = new CarFerrari("Yellow",13,5700,
                "Conditioner","10/03/2021");
        carFerrari.printCharacteristicCar((Car)carFerrari);
        serviceCustomizationColor.changeColor((Car) carFerrari,"Black");
        serviceCustomizationOption.addOption((Car) carFerrari,"LCD - display");
        System.out.println();
        carFerrari.printCharacteristicCar((Car) carFerrari);


    }
}