package com.raman.lis.task03.bogdanovich;

interface AutoPlants {

}
abstract class AutoPlant implements AutoPlants {
    static final int YEAR = 2021;
    static void setCars () {
        //создание склада авто
        StockCar.cars[StockCar.count] = new allCar("White","Kia",
                2019, 17,1.7f);
        StockCar.count++;
        StockCar.cars[StockCar.count] = new allCar("Green","Bmw",
                2020, 17,1.6f);
        StockCar.count++;
        StockCar.cars[StockCar.count] = new allCar("Black","Ford",
                2021, 14,1.4f);
        StockCar.count++;
    }
        }

class BmwAutoPlant extends AutoPlant {

    static int on = 0;
    static String accModel = "Bmw";
    static String accColor[] = {"Yellow", "Green", "White", "Black"};
    static int accWheel[] = {14, 15, 16, 17, 18, 19, 20, 21, 22};
    static float accEngine[] = {1.6f, 1.9f, 2.8f, 2.3f, 2.7f, 3.0f, 3.3f};

    static void createCar(String color, String model, int year,
                          int wheel, float engine) {
        if (model == accModel) {
            on++;
        }

        for (int i = 0; i < accColor.length; i++) {
            if (color == accColor[i]) {
                on++;
            }
        }

        for (int i = 0; i < accWheel.length; i++) {
            if (wheel == accWheel[i]) {
                on++;
            }
        }

        for (int i = 0; i < accEngine.length; i++) {
            if (engine == accEngine[i]) {
                on++;
            }
        }

        if (on == 4) {
            StockCar.cars[StockCar.count] = new allCar(color, accModel,
                    YEAR, wheel, engine);
            on = 0;
            StockCar.count++;
        } else {
            System.out.println("Данный автомобиль не может быть создан");
            on = 0;
        }
    }

    //вывод цветов в которые можно покрасить авто
    static void printColor() {
        System.out.println("Список цветов, в которые можно покрасить авто:");
        for (int i = 0; i < accColor.length; i++) {
            System.out.print(accColor[i] + " ");
        }
    }

    //вывод дисков колес которые можно установить
    static void printWheel() {
        System.out.println("Список дисков колес, которые можно установить:");
        for (int i = 0; i < accWheel.length; i++) {
            System.out.print(accWheel[i] + " ");
        }
    }

    //вывод двигателей которые можно установить
    static void printEngine() {
        System.out.println("Список двигателей которые можно установить:");
        for (int i = 0; i < accEngine.length; i++) {
            System.out.print(accEngine[i] + " ");
        }
    }
}

class FordAutoPlant extends AutoPlant{

    static int on = 0;
    static String accModel = "Ford";
    static String accColor[] = {"Yellow", "Green", "White", "Black", "Blue"};
    static int accWheel[] = {14, 15, 16, 17, 18, 19, 20, 21, 22};
    static float accEngine[] = {1.4f, 1.5f, 1.6f, 1.7f, 1.9f, 2.0f};

    static void createCar (String color, String model, int year,
                           int wheel, float engine) {

        if (model == accModel) {
            on++;
        }

        for (int i = 0; i < accColor.length; i++){
            if (color == accColor[i]) {
                on++;
            }
        }

        for (int i = 0; i < accWheel.length; i++){
            if (wheel == accWheel[i]) {
                on++;
            }
        }

        for (int i = 0; i < accEngine.length; i++){
            if (engine == accEngine[i]) {
                on++;
            }
        }

        if (on == 4) {
            StockCar.cars[StockCar.count] = new allCar(color, accModel,
                    YEAR, wheel, engine);
            on = 0;
            StockCar.count++;
        } else {
            System.out.println("Данный автомобиль не может быть создан");
            on = 0;
        }
    }

    //вывод цветов в которые можно покрасить авто
    static void printColor() {
        System.out.println("Список цветов, в которые можно покрасить авто:");
        for (int i = 0; i < accColor.length; i++) {
            System.out.print(accColor[i] + " ");
        }
    }

    //вывод дисков колес которые можно установить
    static void printWheel() {
        System.out.println("Список дисков колес, которые можно установить:");
        for (int i = 0; i < accWheel.length; i++) {
            System.out.print(accWheel[i] + " ");
        }
    }

    //вывод двигателей которые можно установить
    static void printEngine() {
        System.out.println("Список двигателей которые можно установить:");
        for (int i =0; i < accEngine.length; i++) {
            System.out.print(accEngine[i] + " ");
        }
    }
}

class KiaAutoPlant extends AutoPlant{

    static int on = 0;
    static String accModel = "Kia";
    static String accColor[] = {"Yellow", "Green", "White", "Black", "Red"};
    static int accWheel[] = { 15, 16, 17, 18};
    static float accEngine[] = {1.4f, 1.6f, 1.7f, 1.9f, 2.0f, 2.2f};

    static void createCar (String color, String model, int year,
                           int wheel, float engine) {

        if (model == accModel) {
            on++;
        }

        for (int i = 0; i < accColor.length; i++){
            if (color == accColor[i]) {
                on++;
            }
        }

        for (int i = 0; i < accWheel.length; i++){
            if (wheel == accWheel[i]) {
                on++;
            }
        }

        for (int i = 0; i < accEngine.length; i++){
            if (engine == accEngine[i]) {
                on++;
            }
        }

        if (on == 4) {
            StockCar.cars[StockCar.count] = new allCar(color, accModel,
                    YEAR, wheel, engine);
            on = 0;
            StockCar.count++;
        } else {
            System.out.println("Данный автомобиль не может быть создан");
            on = 0;
        }
    }

    //вывод цветов в которые можно покрасить авто
    static void printColor() {
        System.out.println("Список цветов, в которые можно покрасить авто:");
        for (int i = 0; i < accColor.length; i++) {
            System.out.print(accColor[i] + " ");
        }
    }

    //вывод дисков колес которые можно установить
    static void printWheel() {
        System.out.println("Список дисков колес, которые можно установить:");
        for (int i = 0; i < accWheel.length; i++) {
            System.out.print(accWheel[i] + " ");
        }
    }

    //вывод двигателей которые можно установить
    static void printEngine() {
        System.out.println("Список двигателей которые можно установить:");
        for (int i =0; i < accEngine.length; i++) {
            System.out.print(accEngine[i] + " ");
        }
    }
}
