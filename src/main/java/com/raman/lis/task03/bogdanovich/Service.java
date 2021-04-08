package com.raman.lis.task03.bogdanovich;

abstract class Service {
}

class ColorService extends Service {
    //смена цвета авто
    static void change(int count, String color) {
        String accColor[] = {"Yellow", "Green", "White", "Black", "Brown", "Blue"};
        boolean on = false;
        for (int i = 0; i < accColor.length; i++) {
            if (color == accColor[i]) {
                on = true;
            }
        }
        if (on == true) {
            StockCar.cars[count].setColor(color);
            on = false;
        } else {
            System.out.println("В данный цвет автомобиль покрасить невозможно");
            on = false;
        }

    }
}

    class WheelService extends Service{
//смена дисков на авто
    static void change(int count, int wheel) {
        int accWheel[] = {14, 15, 16, 17, 18, 19, 20, 21, 22};
        boolean on = false;
        for (int i = 0; i < accWheel.length; i++) {
            if (wheel == accWheel[i]) {
                on = true;
            }
        }
        if (on == true) {
            StockCar.cars[count].setWheel(wheel);
            on = false;
        } else {
            System.out.println("Данные диски на автобобиль невозможно установить");
            on = false;
        }
    }
}

