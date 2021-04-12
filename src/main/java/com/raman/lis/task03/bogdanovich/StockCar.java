package com.raman.lis.task03.bogdanovich;

import java.util.ArrayList;

public class StockCar {
    static ArrayList <AllCar> cars = new ArrayList<>();

    //Вывод всех авто на складе
    static void printCarAll () {
        System.out.println(cars.toString());
    }

    static void  printCarAll2 () {
        for (int i = 0; i < cars.size(); i++) {
            System.out.print(cars.get(i));
        }
    }
}
