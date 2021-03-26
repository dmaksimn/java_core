package com.raman.lis.task02.bogdanovich;

public class Car {
    private String color;
    private String model;
    private int year;
    private int wheelSize;
    private float engineVol;
    private final int YEAR = 2021;

     //добавить авто на склад
    public void addCar (String color, String model, int year, int wheelSize, float engineVol) {
        this.color = color;
        this.model = model;
        this.year = year;
        this.wheelSize = wheelSize;
        this.engineVol = engineVol;
    }
//создание нового авто
    public void addCarNew (String color, String model, int YEAR, int wheelSize, float engineVol) {
        this.color = color;
        this.model = model;
        this.year = YEAR;
        this.wheelSize = wheelSize;
        this.engineVol = engineVol;
    }

    String setColor (String color) {
         this.color = color;
         return color;
    }

    String getModel () {
         return model;
    }

    float getEngineVol () {
         return engineVol;
    }

    int getYear () {
        return year;
    }

    int setWheel (int wheel) {
        this.wheelSize = wheel;
        return wheel;
    }

     void printCar () {
    System.out.println("Модель: " + model+ " Цвет: " + color + " Год выпуска: " + year + " Диаметр дисков: "+ wheelSize + " Объем двигателя: " +engineVol);
     }

}
