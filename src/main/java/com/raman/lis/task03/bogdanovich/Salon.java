package com.raman.lis.task03.bogdanovich;

abstract class Salon {
    static int number;
    static String accModel;
    static boolean reColor;
}

class BmwSalon extends Salon {

    //заказ авто на заводе
    static void orderCar(String color, String model, int year, int wheelS,
                         float engineV) throws MyException{
        accModel = "Bmw";
        number = -1;
        if (model == accModel) {
            for (int i = 0; i < StockCar.cars.size(); i++) {
                if ((StockCar.cars.get(i).year == year) &&
                        (StockCar.cars.get(i).model == model) &&
                        (StockCar.cars.get(i).engineVol == engineV)) {
                    number = i;
                }
            }
            if (number != -1) {
                System.out.println("Автомобиль с такими характеристиками есть " +
                        "на складе номер " + (number + 1) + ", но его нужно перекрасить" +
                        " и/или заменить диски");
            } else {
                try {
                    BmwAutoPlant.createCar(color, accModel, year,
                            wheelS, engineV);
                } catch (MyException e) {
                    System.out.println(e.getMessage());
                }
            }
        } else {
            throw new MyException("Салон " + accModel + " не может заказать " +
                    "автомобиль " + model);
        }
    }
}

class FordSalon extends Salon {

    //заказ авто на заводе
    static void orderCar(String color, String model, int year, int wheelS,
                         float engineV) throws MyException {
        accModel = "Ford";
        number = -1;
        if (model == accModel) {
            for (int i = 0; i < StockCar.cars.size(); i++) {
                if ((StockCar.cars.get(i).year == year) &&
                        (StockCar.cars.get(i).model == model) &&
                        (StockCar.cars.get(i).engineVol == engineV)) {
                    number = i;
                }
            }
            if (number != -1) {
                System.out.println("Автомобиль с такими характеристиками есть " +
                        "на складе номер " + (number + 1) + ", но его нужно перекрасить" +
                        " и/или заменить диски");
            } else {
                try {
                    FordAutoPlant.createCar(color, accModel, year,
                            wheelS, engineV);
                } catch (MyException e) {
                    System.out.println(e.getMessage());
                }
            }
        } else {
            throw new MyException("Салон " + accModel + " не может заказать автомобиль " + model);
        }
    }
}

class KiaSalon extends Salon {

    //заказ авто на заводе
    static void orderCar(String color, String model, int year, int wheelS,
                         float engineV) throws MyException {
        accModel = "Kia";
        number = -1;
        if (model == accModel) {
            for (int i = 0; i < StockCar.cars.size(); i++) {
                if ((StockCar.cars.get(i).year == year) &&
                        (StockCar.cars.get(i).model == model) &&
                        (StockCar.cars.get(i).engineVol == engineV)) {
                    number = i;
                }
            }
            if (number != -1) {
                System.out.println("Автомобиль с такими характеристиками есть " +
                        "на складе номер " + (number + 1) + ", но его нужно перекрасить" +
                        " и/или заменить диски");
            } else {
                try {
                    KiaAutoPlant.createCar(color, accModel, year,
                            wheelS, engineV);
                } catch (MyException e) {
                    System.out.println(e.getMessage());
                }
            }
        } else {
            throw new MyException("Салон " + accModel + " не может заказать автомобиль " + model);
        }
    }
}
