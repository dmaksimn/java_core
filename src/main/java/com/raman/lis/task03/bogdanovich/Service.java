package com.raman.lis.task03.bogdanovich;

import java.util.ArrayList;

abstract class Service {
    static ArrayList<String> accColor = new ArrayList<>();
    static ArrayList<Integer> accWheel = new ArrayList<>();
}

class ColorService extends Service {
    //смена цвета авто
    static void change (int count, String color) throws MyException {
        accColor.add("Green");
        accColor.add("White");
        accColor.add("Brown");
        accColor.add("Blue");

        if (accColor.contains(color)) {
            StockCar.cars.get(count).setColor(color);
            System.out.println("Автомобиль успешно перекрашен");
        } else {
            throw new MyException("Сервис не может покрасить авто в цвет " + color);
        }
    }
}

    class WheelService extends Service{
//смена дисков на авто
    static void change(int count, int wheel) throws MyException {
        accWheel.add(14);
        accWheel.add(15);
        accWheel.add(16);
        accWheel.add(17);
        accWheel.add(18);
        accWheel.add(19);
        accWheel.add(20);
        accWheel.add(21);
        accWheel.add(22);

        if (accWheel.contains(wheel)) {
            StockCar.cars.get(count).setWheel(wheel);
            System.out.println("Диски успешно заменены");
        } else {
            throw new MyException("Сервис не может заменить диски в авто на " + wheel);
        }
    }
}

