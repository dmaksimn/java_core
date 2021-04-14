package com.raman.lis.task03.popov.factory;

import com.raman.lis.task03.popov.cars.CarAudi;

import java.util.LinkedList;

public class AutoFactoryAudi extends AutoFactory implements Print {

    public CarAudi createCar(String colour, int sizeWheels, int volumeEngine,
                             String date, String typeCar) {
        return new CarAudi(colour, sizeWheels, volumeEngine, date, typeCar);
    }

    public CarAudi createCar(String colour, int sizeWheels, int volumeEngine,
                             String option, String date, String typeCar) {
        return new CarAudi(colour, sizeWheels, volumeEngine, option, date, typeCar);
    }

    public void printList(String nameList) {
        String[] str = {"volumeengine", "colour", "sizewheels", "typecar"};
        if (nameList.toLowerCase().replaceAll(" ", "").equals(str[0])) {
            System.out.println("List of Volume Engine: ");
            printList(getListVolumeEngine());
        } else if (nameList.toLowerCase().replaceAll(" ", "").equals(str[1])) {
            System.out.println("List of Colour: ");
            printListString(getListColour());
        } else if (nameList.toLowerCase().replaceAll(" ", "").equals(str[2])) {
            System.out.println("List of Size Wheels: ");
            printList(getListSizeWheels());
        } else if (nameList.toLowerCase().replaceAll(" ", "").equals(str[3])) {
            System.out.println("List of TypeCar: ");
            printListString(getListTypeCar());
        }
    }

    public void printListString(LinkedList<String> list) {
        int i = 1;
        for (String mode : list) {
            System.out.println(i + ") " + mode);
            i++;
        }
    }

    public void printList(LinkedList<Integer> list) {
        int i = 1;
        for (int mode : list) {
            System.out.println(i + ") " + mode);
            i++;
        }
    }
}
