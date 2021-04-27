package com.raman.lis.task03.badrova.company1;

import java.util.List;

public class BMWSalon extends Salon{

    private final BMWFactory bmwFactory;
    private final List<Car> storeBmwList;

    public BMWSalon(BMWFactory bmwFactory) {
        this.bmwFactory = bmwFactory;
        this.storeBmwList = bmwFactory.getStorehouseCars();
    }

    @Override
    public void orderNewCar(Car newCar) {
        bmwFactory.createCar(newCar);
    }

    public void changeCarColor (int carNumber, String newColor){
        System.out.println("Изменение цвета для автомобиля No. " + carNumber);
        bmwFactory.getBmwServise().changeColor(storeBmwList.get(carNumber-1), newColor);
    }

    public void changeCarWheels (int carNumber, String newWheelSize){
        System.out.println("Замена колес на машину No. " + carNumber);
        bmwFactory.getBmwServise().changeWheelSize(storeBmwList.get(carNumber-1), newWheelSize);
    }

}
