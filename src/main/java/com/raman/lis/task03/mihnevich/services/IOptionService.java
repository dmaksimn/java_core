package com.raman.lis.task03.mihnevich.services;

import com.raman.lis.task03.mihnevich.cars.Car;

public interface IOptionService {
    void addOption(Car car, String option);

    void deleteOption(Car car, String option);
}
