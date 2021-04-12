package com.raman.lis.task03.bogdanovich;

abstract class Salon {
    static boolean on;
    static int number = 0;
}

class BmwSalon extends Salon {

     static String accModel = "Bmw";

    //заказ авто на заводе
    static void orderCar(String color, String model, int year, int wheelS,
                         float engineV) {
        if (model == accModel) {
            //on = false;
            for (int i = 0; i < StockCar.count; i++) {
                if ((StockCar.cars[i].getModel() == model) &&
                        (StockCar.cars[i].getEngineVol() == engineV) &&
                        (StockCar.cars[i].getYear() == year)) {
                    on = true;
                    number = i;
                }
            }
            if (on) {
                System.out.println("Автомобиль с заданными параметрами существует на складе");
                ColorService.change(number, color);
                WheelService.change(number, wheelS);
                StockCar.cars[number].printCar();
            } else {
                BmwAutoPlant.createCar(color, accModel, AutoPlant.YEAR,
                        wheelS, engineV);
            }
        } else {
            System.out.println("Данный салон не может заказать такой автомобиль");
        }
    }
}

class FordSalon extends Salon {

    static String accModel = "Ford";

    //заказ авто на заводе
    static void orderCar(String color, String model, int year, int wheelS,
                         float engineV) {
        if (model == accModel) {
            for (int i = 0; i < StockCar.count; i++) {
                if ((StockCar.cars[i].getModel() == model) &&
                        (StockCar.cars[i].getEngineVol() == engineV) &&
                        (StockCar.cars[i].getYear() == year)) {
                    on = true;
                    number = i;
                }
            }
            if (on) {
                System.out.println("Автомобиль с заданными параметрами существует на складе");
                ColorService.change(number, color);
                WheelService.change(number, wheelS);
                StockCar.cars[number].printCar();
            } else {
                FordAutoPlant.createCar(color, accModel, AutoPlant.YEAR,
                        wheelS, engineV);
            }
        } else {
            System.out.println("Данный салон не может заказать такой автомобиль");
        }
    }
}

class KiaSalon extends Salon {

    static String accModel = "Kia";

    //заказ авто на заводе
    static void orderCar(String color, String model, int year, int wheelS,
                         float engineV) {
        if (model == accModel) {
            for (int i = 0; i < StockCar.count; i++) {
                if ((StockCar.cars[i].getModel() == model) &&
                        (StockCar.cars[i].getEngineVol() == engineV) &&
                        (StockCar.cars[i].getYear() == year)) {
                    on = true;
                    number = i;
                }
            }
            if (on) {
                System.out.println("Автомобиль с заданными параметрами существует на складе");
                ColorService.change(number, color);
                WheelService.change(number, wheelS);
                StockCar.cars[number].printCar();
            } else {
                KiaAutoPlant.createCar(color, accModel, AutoPlant.YEAR,
                        wheelS, engineV);
            }
        } else {
            System.out.println("Данный салон не может заказать такой автомобиль");
        }
    }
}
