package com.raman.lis.task03.grigorovich.factory;


import com.raman.lis.task03.grigorovich.model.PassengerCar;

public interface PassengerCarFactoryInterface {

    PassengerCar createNewPassengerCar(String color, String model,
                                       int diameterOfWheels, double volumeOfEngine);

}
