package com.raman.lis.task03.popov.service;

import com.raman.lis.task03.popov.cars.Car;
import com.raman.lis.task03.popov.factory.AutoFactoryBMV;
import com.raman.lis.task03.popov.factory.Print;

import java.util.LinkedList;

public class ServiceCustomizationColor extends Service implements IndustryService, Print {
    AutoFactoryBMV autoFactoryBMV = new AutoFactoryBMV();
    public void changeColor(Car car, String colour) {
        car.setColour(colour);
    }

    public void printList() {
        int i = 1;
        System.out.println("List of Colour: ");
        for (String mode : autoFactoryBMV.getListColour()) {
            System.out.println(i + ") " + mode);
            i++;
        }
    }
}
