package com.raman.lis.task03.popov.service;

import com.raman.lis.task03.popov.cars.Car;
import com.raman.lis.task03.popov.factory.Print;

public class ServiceCustomizationOption extends Service implements Print {

    public void addOption(Car car, String option) {
        car.getOption().add(option);
    }

    public void removeOption(Car car, String option) {
        car.getOption().remove(option);
    }

    public void printList() {
        int i = 1;
        System.out.println("List of Option: ");
        for (String mode : getListOption()) {
            System.out.println(i + ") " + mode);
            i++;
        }
    }
}

