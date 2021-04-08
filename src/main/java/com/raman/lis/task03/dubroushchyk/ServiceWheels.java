package com.raman.lis.task03.dubroushchyk;

public class ServiceWheels extends CarService {

    public void changeCarWheelsInCar(Car car, int wheels) throws IllegalArgumentException {
        try {
            if (wheels > 20 || wheels < 16) {
                throw new IllegalArgumentException();
            }
            car.setSizeWheels(wheels);
        } catch (IllegalArgumentException e) {
            System.out.println("Wheels not install. Illegal size of wheels\n");
        }
    }
}
