package com.raman.lis.task03.dubroushchyk;


public class ServiceOptional extends CarService {

    public void addOptionalInCar(Car car, String string) {
        car.addOptional(string);
    }

    public void removeOptionalInCar(Car car, String string) {
        car.removeOptional(string);
    }
}
