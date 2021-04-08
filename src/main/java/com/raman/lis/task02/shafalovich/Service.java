package com.raman.lis.task02.shafalovich;

public class Service {

    public void changeCarColor(Car car, String color) {

        car.setColor(color);
    }

    public void changeCarWheels(Car car, int wheelSize) {

        car.setWheelSize(wheelSize);
    }

    public void addCarOption(Car car, String option) {

        if (car.getOptions().equals("Отсутствуют") || car.getOptions() == null)
            car.setOptions(option);
        else car.setOptions(car.getOptions() + ", " + option);
    }

    public void deleteCarOption(Car car){

        car.setOptions("Отсутствуют");
    }
}
