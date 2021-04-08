package com.raman.lis.task03.dubroushchyk;

import com.raman.lis.task03.dubroushchyk.Enum.EServiceColor;

public class ServiceColor extends CarService {

    public void changeCarColorInCar(Car car, EServiceColor color) {
        car.setColor(color.getColor());
    }
}
