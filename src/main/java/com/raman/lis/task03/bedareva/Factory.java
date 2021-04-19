package com.raman.lis.task03.bedareva;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Factory implements Printable {

    protected final List<Car> warehouse = new ArrayList<>();

    public Factory(ChangeWheelsService changeWheelsService, ChangeColorService changeColorService,
                   ChangeOption changeOption) {
    }

    public void printCarOption() {
        StringBuilder builder = new StringBuilder("Информация о возможных для производства характеристиках: ")
                .append("Выбор цветов автомобиля: ")
                .append(Arrays.toString(Color.values()))
                .append("Выбор объёма двигателя: ")
                .append(Arrays.toString(EngineVolume.values()))
                .append("Выбор размера колес: ")
                .append(Arrays.toString(WheelSize.values()));
        System.out.println(builder);
    }

    public Car searchCarAtWarehouse(Color color, Model model, int year,
                                    WheelSize wheelSize, EngineVolume engineVolume) {
        for (int i = 0; i < warehouse.size(); i++) {
            Car checkedCar = warehouse.get(i);
            if (checkedCar.compareCarAtWarehouse(color, model, year, wheelSize, engineVolume)) {
                warehouse.remove(i);
                System.out.println("Данное авто есть на складе");
                return checkedCar;
            }
        }
        System.out.println("Данного авто нет на складе");
        return null;
    }

    public Car searchAppropriateCarAtWarehouse(Color color, Model model, int year,
                                               WheelSize wheelSize, EngineVolume engineVolume) {
        if (color != null && wheelSize != null) {
            for (int i = 0; i < warehouse.size(); i++) {
                Car checkedCar = warehouse.get(i);
                if (checkedCar.searchCarForChanges(model, year, engineVolume)) {
                    checkedCar.changeColor(color);
                    checkedCar.changeWheels(wheelSize);
                    warehouse.remove(i);
                    System.out.println("Есть подходящее авто для апгрейда");
                    return checkedCar;
                }
            }
        }
        System.out.println("подходящего авто для апгрейда нет");
        return null;
    }

    public abstract Car createNewCar(Color color, Model model, int year,
                                     WheelSize wheelSize, EngineVolume engineVolume);
}

