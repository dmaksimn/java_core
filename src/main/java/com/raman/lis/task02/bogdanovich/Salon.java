package com.raman.lis.task02.bogdanovich;

public class Salon {
    static boolean on = false;
    static int number = 0;

    //заказ авто на заводе
    static void orderCar(String color, String model, int year, int wheelS, float engineV) {
        for (int i = 0; i < AutoPlant.count; i++) {
            if ((AutoPlant.cars[i].getModel() == model) & (AutoPlant.cars[i].getEngineVol() == engineV) &(AutoPlant.cars[i].getYear() == year)){
                on = true;
                number = i;
            }
        }
        if (on) {
            System.out.println("Автомобиль с заданными параметрами существует на складе");
            Service.chColor(number, color);
            Service.chWheel(number, wheelS);
            AutoPlant.cars[number].printCar();
        } else {
            AutoPlant.createCar(color, model, 2021, wheelS, engineV);
        }
    }

}
