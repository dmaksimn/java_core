package com.raman.lis.task03.shafalovich.services;

import com.raman.lis.task03.shafalovich.Car;
import com.raman.lis.task03.shafalovich.exceptions.OptionsException;
import com.raman.lis.task03.shafalovich.interfaces.OptionsChangeable;

public class OptionsService implements OptionsChangeable {

    @Override
    public void addCarOptions(Car car, String option) {
        try {
            if (option == null)
                throw new OptionsException("!Опция машины введена не корректно");
        } catch (OptionsException e) {
            option = "Отсутствует";
            System.err.println(e.getMessage());
            System.err.println("Опция не добавлена");
        }
        if (car.getOptions().equals("Отсутствуют")) {
            car.setOptions(option);
        } else car.setOptions(car.getOptions() + ", " + option);
    }

    @Override
    public void removeCarOptions(Car car) {
        car.setOptions("Отсутствуют");
    }
}
