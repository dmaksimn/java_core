package com.raman.lis.task02.bogdanovich;

public class Main {

    public static void main(String[] args) {
        AutoPlant.setCars();//Создание авто на складе
        AutoPlant.createCar("Black","Ford",2000,16,1.6f);//Создание нового авто
        //AutoPlant.printColor();//Вывод возможных цветов для покраски
        //AutoPlant.printModel();//Вывод возможных моделей авто для создания
        //AutoPlant.printWheel();//Вывод дисков для авто
        //AutoPlant.printEngine();//Вывод возможных двигателей
        //Service.chColor(0,"Green");//Смена цвета авто
        //Service.chWheel(0,16);//Замена дисков на авто
        //Salon.orderCar("Black", "Bmw",2018,16,1.7f);//Заказ авто
        AutoPlant.printCarAll();//Вывод всех авто на складе

    }

}
