package com.raman.lis.task03.popov.service;

import com.raman.lis.task03.popov.cars.Car;
import com.raman.lis.task03.popov.factory.AutoFactoryBMV;
import com.raman.lis.task03.popov.factory.Print;

public class ServiceCustomizationWheels extends Service implements Print {
    AutoFactoryBMV autoFactoryBMV = new AutoFactoryBMV();

    public void changeSizeWheels(Car car, int sizeWheels) {
        car.setSizeWheels(sizeWheels);
    }

    public void printList() {
        int i = 1;
        System.out.println("List of Wheels: ");
        for (int mode : autoFactoryBMV.getListSizeWheels()) {
            System.out.println(i + ") " + mode);
            i++;
        }
    }
}
