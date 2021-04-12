package com.raman.lis.task03.bedareva;

public class ChangeWheelsService extends Service implements WheelChangeable {

    @Override
    public void changeWheels(Car car, WheelSize wheelSize) {
        car.changeWheels(wheelSize);
    }
}
