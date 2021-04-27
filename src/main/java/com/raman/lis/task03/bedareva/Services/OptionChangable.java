package com.raman.lis.task03.bedareva.Services;

import com.raman.lis.task03.bedareva.Cars.Car;
import com.raman.lis.task03.bedareva.Enum.Option;

public interface OptionChangable {

    Car addOptionToList(Car car, Option newOption);

    Car deleteOptionFromList(Car car, Option option);
}
