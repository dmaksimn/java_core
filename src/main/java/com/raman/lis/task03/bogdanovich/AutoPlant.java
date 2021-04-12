package com.raman.lis.task03.bogdanovich;

import java.util.ArrayList;

interface AutoPlants {

}

abstract class AutoPlant implements AutoPlants {
    static final int YEAR = 2021;
    static String accModel;
    static ArrayList <String> accColor = new ArrayList<>();
    static ArrayList <Integer> accWheel = new ArrayList<>();
    static ArrayList <Float> accEngine = new ArrayList<>();
    static void setCars () {
        //создание склада авто
        StockCar.cars.add(new AllCar("White","Kia",
                2019, 17,1.7f));
        StockCar.cars.add(new AllCar("Green","Bmw",
                2020, 17,1.6f));
        StockCar.cars.add(new AllCar("Black","Ford",
                2021, 14,1.4f));

    }
        }

class BmwAutoPlant extends AutoPlant {

    static void createCar(String color, String model, int year,
                          int wheel, float engine) throws MyException {
        accColor.clear();
        accWheel.clear();
        accEngine.clear();
        accModel = "Bmw";
        accColor.add("Yellow");
        accColor.add("Brown");
        accColor.add("White");
        accColor.add("Green");
        accWheel.add(14);
        accWheel.add(15);
        accWheel.add(16);
        accWheel.add(17);
        accWheel.add(18);
        accWheel.add(19);
        accWheel.add(20);
        accWheel.add(21);
        accWheel.add(22);
        accEngine.add(1.6f);
        accEngine.add(1.9f);
        accEngine.add(2.0f);
        accEngine.add(2.3f);
        accEngine.add(2.7f);
        accEngine.add(3.0f);
        accEngine.add(3.3f);
        if (model == accModel) {
            if ((accColor.contains(color)) && (accWheel.contains(wheel))
                    && (accEngine.contains(engine)) && (year == YEAR)) {
                StockCar.cars.add(new AllCar(color, accModel,
                        year, wheel, engine));
                System.out.println("Автомобиль успешно создан");
            } else {
                throw new MyException("Данный автомобиль завод " + accModel +
                        " не может создать");
            }
        } else {
            throw new MyException("Автомобиль " + model + " завод " + accModel +
                    " не может создать");
        }
    }

    //вывод цветов в которые можно покрасить авто
    static void printColor() {
        System.out.println("На заводе " + accModel + " доступны цвета :" + accColor);
    }

    //вывод дисков колес которые можно установить
    static void printWheel() {
        System.out.println("На заводе " + accModel + " доступны диски для колес :" + accWheel);
    }

    //вывод двигателей которые можно установить
    static void printEngine() {
        System.out.println("На заводе " + accModel + " доступны двигатели :" +accEngine);
    }
}

class FordAutoPlant extends AutoPlant{

    static void createCar (String color, String model, int year,
                           int wheel, float engine) throws MyException{
        accColor.clear();
        accWheel.clear();
        accEngine.clear();
        accModel = "Ford";
        accColor.add("Yellow");
        accColor.add("Green");
        accColor.add("White");
        accColor.add("Black");
        accColor.add("Blue");
        accWheel.add(14);
        accWheel.add(15);
        accWheel.add(16);
        accWheel.add(17);
        accWheel.add(18);
        accWheel.add(19);
        accEngine.add(1.4f);
        accEngine.add(1.5f);
        accEngine.add(1.6f);
        accEngine.add(1.7f);
        accEngine.add(1.9f);
        accEngine.add(2.0f);

        if (model == accModel) {
            if ((accColor.contains(color)) && (accWheel.contains(wheel))
                    && (accEngine.contains(engine))) {
                StockCar.cars.add(new AllCar(color, accModel,
                        YEAR, wheel, engine));
                System.out.println("Автомобиль успешно создан");
            } else {
                throw new MyException("Данный автомобиль завод " + accModel +
                        " не может создать");
            }
        } else {
            throw new MyException("Автомобиль " + model + " завод " + accModel +
                    " не может создать");
        }
    }

    //вывод цветов в которые можно покрасить авто
    static void printColor() {
        System.out.println("На заводе " + accModel + " доступны цвета :" + accColor);
    }

    //вывод дисков колес которые можно установить
    static void printWheel() {
        System.out.println("На заводе " + accModel + " доступны диски для колес :" + accWheel);
    }

    //вывод двигателей которые можно установить
    static void printEngine() {
        System.out.println("На заводе " + accModel + " доступны двигатели :" +accEngine);
    }
}

class KiaAutoPlant extends AutoPlant{

    static void createCar (String color, String model, int year,
                           int wheel, float engine) throws MyException {

        accColor.clear();
        accWheel.clear();
        accEngine.clear();
        accModel = "Kia";
        accColor.add("Yellow");
        accColor.add("Green");
        accColor.add("White");
        accColor.add("Black");
        accColor.add("Red");
        accWheel.add(15);
        accWheel.add(16);
        accWheel.add(17);
        accWheel.add(18);
        accEngine.add(1.4f);
        accEngine.add(1.6f);
        accEngine.add(1.7f);
        accEngine.add(1.9f);
        accEngine.add(2.0f);
        accEngine.add(2.2f);

        if (model == accModel) {
            if ((accColor.contains(color)) && (accWheel.contains(wheel))
                    && (accEngine.contains(engine))) {
                StockCar.cars.add(new AllCar(color, accModel,
                        YEAR, wheel, engine));
                System.out.println("Автомобиль успешно создан");
            } else {
                throw new MyException("Данный автомобиль завод " + accModel +
                        " не может создать");
            }
        } else {
            throw new MyException("Автомобиль " + model + " завод " + accModel +
                    " не может создать");
        }
    }

    //вывод цветов в которые можно покрасить авто
    static void printColor() {
        System.out.println("На заводе " + accModel + " доступны цвета :" + accColor);
    }

    //вывод дисков колес которые можно установить
    static void printWheel() {
        System.out.println("На заводе " + accModel + " доступны диски для колес :" + accWheel);
    }

    //вывод двигателей которые можно установить
    static void printEngine() {
        System.out.println("На заводе " + accModel + " доступны двигатели :" +accEngine);
    }
}
