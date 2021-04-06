package com.raman.lis.task03.mihnevich.factories;

import com.raman.lis.task03.mihnevich.cars.Car;
import com.raman.lis.task03.mihnevich.cars.Model;

import java.util.List;

public interface IFactory {
    Car createCar(String color, List<String> options, Model model,
                  int year, int wheelSize, double engineVolume);

    Car getMostSuitableCar(String color, List<String> options, Model model,
                           int year, int wheelSize, double engineVolume);

    void printModels();

    void printColors();

    void printWheelSizes();

    void printEngineVolumes();
}
