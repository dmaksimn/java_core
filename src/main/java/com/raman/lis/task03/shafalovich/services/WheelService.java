package com.raman.lis.task03.shafalovich.services;

import com.raman.lis.task03.shafalovich.Car;
import com.raman.lis.task03.shafalovich.enums.CarWheels;
import com.raman.lis.task03.shafalovich.exceptions.WheelException;
import com.raman.lis.task03.shafalovich.interfaces.WheelChangeable;

public class WheelService extends Service implements WheelChangeable {

    @Override
    public void changeCarWheel(Car car, CarWheels wheels) {
        try {
            if (wheels == null)
                throw new WheelException("!Размер колес машины введен не корректно");
        } catch (WheelException e) {
            wheels = CarWheels.SIZE_16;
            System.err.println(e.getMessage());
            System.err.println("Был установлен размер колес по умолчанию: 16");
        }
        car.setWheelSize(wheels.getWheels());
    }
}
