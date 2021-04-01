package com.raman.lis.task03.popov;

import com.raman.lis.task03.popov.cars.Car;
import com.raman.lis.task03.popov.cars.CarAudi;
import com.raman.lis.task03.popov.cars.Cars;
import com.raman.lis.task03.popov.factory.AutoFactory;
import com.raman.lis.task03.popov.factory.AutoFactoryBMV;
// не доделал высылаю то что есть
public class Main {

    public static void main(String[] args) {
        AutoFactoryBMV autoFactoryBMV = new AutoFactoryBMV();
        autoFactoryBMV.printList("Type Car");
        CarSalon carSalon = new CarSalon();
        Cars car = carSalon.createCar("Grey","BMV", 14,5700,"12/03/2008" );
        car.printCharacteristicCar((Car) car);
        Cars carAudi = new CarAudi("Black", 15, 3700, "10/01/2012",
                "Off-road","Leather of car");
        carAudi.printCharacteristicCar((Car) carAudi);


    }
}