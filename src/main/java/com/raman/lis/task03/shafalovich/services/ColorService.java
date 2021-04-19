package com.raman.lis.task03.shafalovich.services;

import com.raman.lis.task03.shafalovich.Car;
import com.raman.lis.task03.shafalovich.enums.CarColors;
import com.raman.lis.task03.shafalovich.exceptions.ColorException;
import com.raman.lis.task03.shafalovich.interfaces.ColorChangeable;

public class ColorService extends Service implements ColorChangeable {

    @Override
    public void changeCarColor(Car car, CarColors color) {
        try {
            if (color == null)
                throw new ColorException("!Цвет машины введен не корректно");
        } catch (ColorException e) {
            color = CarColors.BLACK;
            System.err.println(e.getMessage());
            System.err.println("Был установлен цвет машины по умолчанию: Black");
        }
        car.setColor(color.getColor());
    }
}
