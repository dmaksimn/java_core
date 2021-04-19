package com.raman.lis.task03.shafalovich.interfaces;

import com.raman.lis.task03.shafalovich.Car;
import com.raman.lis.task03.shafalovich.enums.CarWheels;

public interface WheelChangeable {

    void changeCarWheel(Car car, CarWheels wheels);
}
