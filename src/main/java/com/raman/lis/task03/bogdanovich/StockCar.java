package com.raman.lis.task03.bogdanovich;

public class StockCar {
    static int count = 0;
    static allCar[] cars = new allCar[30];

    //Вывод всех авто на складе
    static void printCarAll () {
        for (int i = 0; i < count; i++) {
            cars[i].printCar();
        }
    }
}
