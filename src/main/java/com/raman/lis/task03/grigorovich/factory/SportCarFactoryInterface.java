package com.raman.lis.task03.grigorovich.factory;


import com.raman.lis.task03.grigorovich.model.SportCar;

public interface SportCarFactoryInterface {

    SportCar createNewSportCar(String color, String model,
                               int diameterOfWheels, double volumeOfEngine,
                               int numberOfSeats, int weightSportCar);

}
