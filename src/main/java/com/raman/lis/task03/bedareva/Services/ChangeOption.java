package com.raman.lis.task03.bedareva.Services;

import com.raman.lis.task03.bedareva.Cars.Car;
import com.raman.lis.task03.bedareva.Enum.Option;

public class ChangeOption extends Service implements OptionChangable {

    @Override
    public Car addOptionToList(Car car, Option option) {
        if (car != null && option != null) {
            if (car.addOption(option)) {
                return car;
            }
        }
        return null;
    }

    @Override
    public Car deleteOptionFromList(Car car, Option option) {
        if (car != null && option != null) {
            if (car.deleteOptionFromList(option)) {
                return car;
            }
        }
        return null;
    }
}
