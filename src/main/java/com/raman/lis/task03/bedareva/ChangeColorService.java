package com.raman.lis.task03.bedareva;

public class ChangeColorService extends Service implements ColorChangeable {

    @Override
    public void changeColor(Car car, Color color) {
        car.changeColor(color);
    }
}
