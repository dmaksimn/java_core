package com.raman.lis.task03.badrova.company1;

public class BMWFactory extends Factory {

    private BMWServise bmwServise = new BMWServise(this);

    public BMWServise getBmwServise() {
        return bmwServise;
    }

    public BMWFactory(String[] models, int[] engineVolumes,
                      String[] colors, String[] wheelSizes) {
        this.models = models;
        this.engineVolumes = engineVolumes;
        this.colors = colors;
        this.wheelSizes = wheelSizes;
        storehouseCars.add(new BMWCar("X3", 2019, 2000,
                "red", "R16"));
        storehouseCars.add(new BMWCar("X5", 2020, 3000,
                "black", "R21"));
        storehouseCars.add(new BMWCar("M5", 2021, 4400,
                "silver",  "R18"));
    }

}
