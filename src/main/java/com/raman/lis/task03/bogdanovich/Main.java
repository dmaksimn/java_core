package com.raman.lis.task03.bogdanovich;

public class Main {

    public static void main(String[] args) {
        AutoPlant.setCars();//Создание авто на складе

        /*try{//Создание нового авто Bmw
            KiaAutoPlant.createCar("White","Kia",2000,15,1.6f);
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
        */

        //BmwAutoPlant.printColor();//Вывод возможных цветов для покраски
        //BmwAutoPlant.printWheel();//Вывод дисков для авто
        //BmwAutoPlant.printEngine();//Вывод возможных двигателей

        StockCar.printCarAll();//Вывод авто, которые есть на складе

        try {
            FordSalon.orderCar("Дфдф", "Audi",2020,30,1.4f);//Заказ авто Bmw
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }

        /*try {
            ColorService.change(1, "Orange");//смена цвета авто
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }*/

        /*try {
            WheelService.change(1, 25);//смена дисков
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
        */
        StockCar.printCarAll();
    }
}
