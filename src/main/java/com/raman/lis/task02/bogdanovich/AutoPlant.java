package com.raman.lis.task02.bogdanovich;

public class AutoPlant {
    static final int YEAR = 2021;
    static Car[] cars = new Car[20];
    static int count = 0, on = 0;
    static String accModel[] = {"Bmw", "Kia", "Ford", "Opel"};
    static String accColor[] = {"Yellow", "Green", "White", "Black"};
    static int accWheel[] = {14, 15, 16, 17, 18, 19, 20, 21, 22};
    static float accEngine[] = {1.4f, 1.5f, 1.6f, 1.7f};

    static void setCars () { //создание склада авто
        cars[count] = new Car();
        cars[count].addCar("Yellow","Opel",2018,15,1.4f);
        count++;
        cars[count] = new Car();
        cars[count].addCar("White","Kia",2019,17,1.7f);
        count++;
        cars[count] = new Car();
        cars[count].addCar("Green","Bmw",2020,17,1.6f);
        count++;
        cars[count] = new Car();
        cars[count].addCar("Black","Ford",2021,14,1.4f);
        count++;
   }

   static void createCar (String col, String mod, int year, int whe, float eng) {
        for (int i = 0; i < accModel.length; i++){
            if (mod == accModel[i]) {
               on++;
            }
        }

       for (int i = 0; i < accColor.length; i++){
           if (col == accColor[i]) {
               on++;
           }
       }

       for (int i = 0; i < accWheel.length; i++){
           if (whe == accWheel[i]) {
               on++;
           }
       }

       for (int i = 0; i < accEngine.length; i++){
           if (eng == accEngine[i]) {
               on++;
           }
       }

       if (on == 4) {
           AutoPlant.cars[count] = new Car();
           AutoPlant.cars[count].addCarNew(col, mod, YEAR, whe, eng);
           on = 0;
           count++;
       } else {
           System.out.println("Данный автомобиль не может быть создан");
           on = 0;
       }
    }

    //вывод моделей авто которые можно создать
    static void printModel() {
        System.out.println("Список моделей авто, которые можно произвести на заводе:");
        for (int i = 0; i < accModel.length; i++) {
            System.out.print(accModel[i] + " ");
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

    //Вывод всех авто на складе
    static void printCarAll () {
        for(int i = 0; i < AutoPlant.count; i++) {
            cars[i].printCar();
        }
    }
}
