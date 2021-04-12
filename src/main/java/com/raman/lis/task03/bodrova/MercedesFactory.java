package com.raman.lis.task03.bodrova;

import java.util.ArrayList;
import java.util.List;

public abstract class MercedesFactory extends Factory {

    private List<Car> storehouseCar = new ArrayList<>();

    @Override
    public List<Car> getStorehouseCar() {
        return super.getStorehouseCar();
    }

    public ColorServise colorServise;

    public MercedesFactory(String[] models, int[] engineVolumes, String[] colors, String[] wheelSizes) {
        super(models, engineVolumes, colors, wheelSizes);
        storehouseCar.add(new MercedesCar("CLS", 2021, 2900,
                "red", "R18"));
        storehouseCar.add(new MercedesCar("Vito", 2021, 1500,
                "silver", "R16"));
        storehouseCar.add(new MercedesCar("Maybach", 2021, 3900,
                "black", "R17"));
    }


    @Override
    public void createCar(Car orderedCar) {
        super.createCar(orderedCar);
    }

    @Override
    public void showStorage() {
        super.showStorage();
    }

    @Override
    public void printEngineVolumesList() {
        super.printEngineVolumesList();
    }

    @Override
    public void printColorsList() {
        super.printColorsList();
    }

    @Override
    public void printWheelSizeList() {
        super.printWheelSizeList();
    }
}
