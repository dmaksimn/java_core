package com.raman.lis.task02.bodrova;

/* Класс "Car" представляет собой автомобиль.
    Имеет следующие свойства:
        * Цвет
        * Модель (неизменяемая)
        * Год выпуска (неизменяемый)
        * Размер колес
        * Обьем двигателя (неизменяемая)
        * Список опций (Могут быть, а могут и нет)
    Автомобилю можно:
        * Сменить цвет
        * Сменить размер колес
        * Изменять список опций (Добавлять\Удалять)
    Ожидается возможность вывода на экран информации об автомобиле. */

public class Car {

    private final String BREND = "Mercedes"; //сделала неизменяемой марку
    private final int YEAR = 2021; //год выпуска неизменяемый
    private String model; //модели оставила изменяемыми
    private String color;
    private int engine_volume;
    private String wheel_size;
    private String option;

    //конструктор автомобиля
    public Car(String model, int engine_volume, String color, String wheel_size, String option) {
        this.model = model;
        this.engine_volume = engine_volume;
        this.color = color;
        this.wheel_size = wheel_size;
        this.option = option;
    }

    //вывод на экран информации об автомобиле
    public void printCar() {
        System.out.println("Марка: " + BREND);
        System.out.println("Модель: " + model);
        System.out.println("Год: " + YEAR);
        System.out.println("Цвет: " + color);
        System.out.println("Объем двигателя: " + engine_volume);
        System.out.println("Размер колес: " + wheel_size);
        System.out.println("Дополнительная опция: " + option);
    }

}
