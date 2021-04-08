package com.raman.lis.task03.shafalovich;

public class AudiFactory extends Factory {

    private AudiCar newCar;
    @Override
    public void createCar(int year, CarEngines volume,
                          CarWheels wheels, CarColors color) {
        newCar = new AudiCar(year, volume.getEngine(), wheels.getWheels(), color.getColor());
    }

    public AudiCar getNewCar() {
        return newCar;
    }

    public void setNewCar(AudiCar newCar) {
        this.newCar = newCar;
    }
}
