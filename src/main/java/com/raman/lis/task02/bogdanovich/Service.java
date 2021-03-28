package com.raman.lis.task02.bogdanovich;

public class Service {
    //смена цвета авто
    static void chColor(int count, String color) {
        boolean on = false;
        for (int i = 0; i < AutoPlant.accColor.length; i++) {
            if (color == AutoPlant.accColor[i]) {
                on = true;
            }
        }
        if (on == true) {
            AutoPlant.cars[count].setColor(color);
            on = false;
        } else {
            System.out.println("В данный цвет автомобиль покрасить невозможно");
            on = false;
        }

    }
//смена дисков на авто
    static void chWheel(int count, int wheel) {
        boolean on = false;
        for (int i = 0; i < AutoPlant.accWheel.length; i++) {
            if (wheel == AutoPlant.accWheel[i]) {
                on = true;
            }
        }
        if (on == true) {
            AutoPlant.cars[count].setWheel(wheel);
            on = false;
        } else {
            System.out.println("Данные диски на автобобиль невозможно установить");
            on = false;
        }
    }


}

