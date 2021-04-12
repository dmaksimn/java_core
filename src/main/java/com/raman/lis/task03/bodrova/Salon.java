package com.raman.lis.task03.bodrova;

import java.util.List;

public class Salon {

    private final Factory factory;
    private final List<Car> storehouseList;

    public Salon(Factory factory) {
        this.factory = factory;
        this.storehouseList = factory.getStorehouseCar();
    }

    public void orderNewCar(Car newCar){
        factory.createCar(newCar);
    }

    public void changeCarColor (int carNumber, String newColor){
        System.out.println("Изменение цвета для автомобиля No. " + carNumber);
//        factory.getService().changeColor(storehouseList.get(carNumber-1), newColor);
    }

    public void changeCarWheels (int carNumber, String newWheelSize){
        System.out.println("Замена колес на машину No. " + carNumber);
//        factory.getService().changeWheelSize(storehouseList.get(carNumber-1), newWheelSize);
    }
}
