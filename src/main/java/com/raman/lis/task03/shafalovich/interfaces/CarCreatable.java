package com.raman.lis.task03.shafalovich.interfaces;

import com.raman.lis.task03.shafalovich.Car;
import com.raman.lis.task03.shafalovich.enums.CarColors;
import com.raman.lis.task03.shafalovich.enums.CarEngines;
import com.raman.lis.task03.shafalovich.enums.CarWheels;

public interface CarCreatable {

    Car createCar(int year, CarEngines volume,
                  CarWheels wheels, CarColors color);
}
