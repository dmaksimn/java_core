package com.raman.lis.task02.popov;

import java.util.ArrayList;

public class Service extends Car {

    protected static ArrayList<String> listOption = new ArrayList<>();

    {
        Service.listOption.add("LCD - display");
        Service.listOption.add("Leather of car");
        Service.listOption.add("Electric mirror");
        Service.listOption.add("Conditioner");
        Service.listOption.add("Add airbag");
        Service.listOption.add("Anti-fog lamp");
    }

    Service() {
    }

    void changeColor(Car car, int colour) {
        car.colour = listColour.get(colour - 1);
    }

    void changeSizeWheels(Car car, int sizeWheels) {
        car.sizeWheels = listSizeWheels.get(sizeWheels - 1);
    }

    void addOption(Car car, int option){
        car.option.add(listOption.get(option - 1));
    }

    void removeOption(Car car, int option){
        car.option.remove(listOption.get(option - 1));
    }
}