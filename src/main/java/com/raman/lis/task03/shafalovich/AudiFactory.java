package com.raman.lis.task03.shafalovich;

public class AudiFactory extends Factory {

    @Override
    public Car createCar(int year, CarEngines value,
                         CarWheels wheels, CarColors color) {
        try {
            if (year < 1990 || year > 2021)
                throw new CarCreateException("!Год выпуска машины введен не корректно");
        } catch (CarCreateException e) {
            System.err.println(e.getMessage());
            if (year < 1990) {
                year = 1990;
                System.err.println("Был установлен минимальный год выпуска: 1990");
            } else {
                year = 2021;
                System.err.println("Был установлен максимальный год выпуска: 2021г");
            }
        }
        try {
            if (value == null)
                throw new CarCreateException("!Объем двигателя машины введен не корректно");
        } catch (CarCreateException e) {
            value = CarEngines.ENGINE1_5;
            System.err.println(e.getMessage());
            System.err.println("Был установлен объем двигателя по умолчанию: 1.5");
        }
        try {
            if (wheels == null)
                throw new CarCreateException("!Размер колес машины введен не корректно");
        } catch (CarCreateException e) {
            wheels = CarWheels.SIZE_16;
            System.err.println(e.getMessage());
            System.err.println("Был установлен размер колес по умолчанию: 16");
        }
        try {
            if (color == null)
                throw new CarCreateException("!Цвет машины введен не корректно");
        } catch (CarCreateException e) {
            color = CarColors.BLACK;
            System.err.println(e.getMessage());
            System.err.println("Был установлен цвет машины по умолчанию: Black");
        }
        AudiCar car = new AudiCar(year, value, wheels, color);
        return car;
    }

}
