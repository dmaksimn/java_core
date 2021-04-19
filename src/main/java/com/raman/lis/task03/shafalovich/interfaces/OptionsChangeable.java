package com.raman.lis.task03.shafalovich.interfaces;

import com.raman.lis.task03.shafalovich.Car;

public interface OptionsChangeable {

    void addCarOptions(Car car, String option);

    void removeCarOptions(Car car);
}
