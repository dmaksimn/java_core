package com.raman.lis.task03.badrova.company1;

public abstract class Salon {

    protected abstract void orderNewCar(Car newCar);

    public void changeCarColor (int carNumber, String newColor){
        System.out.println("Изменение цвета для автомобиля No. " + carNumber);
    }

    public void changeCarWheels (int carNumber, String newWheelSize){
        System.out.println("Замена колес на машину No. " + carNumber);
    }

}
