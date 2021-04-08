package com.raman.lis.task03.popov.factory;

import com.raman.lis.task03.popov.cars.CarBMV;

import java.util.LinkedList;

public class AutoFactoryBMV extends AutoFactory implements Print {

    public CarBMV createCar(String colour, int sizeWheels,
                            int volumeEngine, String option, String date) {
        return new CarBMV(colour, sizeWheels, volumeEngine, option, date);
    }

    public CarBMV createCar(String colour, int sizeWheels, int volumeEngine, String date) {
        return new CarBMV(colour, sizeWheels, volumeEngine, date);
    }

    public void printList(String nameList) {
        String[] str = {"volumeengine", "colour", "sizewheels"};
        if (nameList.toLowerCase().replaceAll(" ", "").equals(str[0])) {
            System.out.println("List of Volume Engine: ");
            printList(getListVolumeEngine());
        } else if (nameList.toLowerCase().replaceAll(" ", "").equals(str[1])) {
            System.out.println("List of Colour: ");
            printList1(getListColour());
        } else if (nameList.toLowerCase().replaceAll(" ", "").equals(str[2])) {
            System.out.println("List of Size Wheels: ");
            printList(getListSizeWheels());
        }
    }

    public void printList1(LinkedList<String> list) {
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
