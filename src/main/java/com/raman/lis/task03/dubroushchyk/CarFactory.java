package com.raman.lis.task03.dubroushchyk;

public abstract class CarFactory implements ICarFactory {

    private ServiceColor serviceColor;
    private ServiceWheels serviceWheels;
    private ServiceOptional serviceOptional;

    public CarFactory(ServiceColor serviceColor, ServiceWheels serviceWheels, ServiceOptional serviceOptional) {
        this.serviceColor = serviceColor;
        this.serviceWheels = serviceWheels;
        this.serviceOptional = serviceOptional;
    }

    public abstract void printPropertyCar();

    public void changeServiceColor(Car car, String color) {
        serviceColor.changeCarColorInCar(car, color);
    }

    public void changeServiceWheels(Car car, int wheels) {
        serviceWheels.changeCarWheelsInCar(car, wheels);
    }

    public void addServiceOptional(Car car, String string) {
        serviceOptional.addOptionalInCar(car, string);
    }

    public void removeServiceOptional(Car car, String string) {
        serviceOptional.removeOptionalInCar(car, string);
    }

    public Car createCar(String color, String model, int yearProduction,
                         int wheels, int engineVolume) {
        return new CarAudi("GreenFFFF", "BMW", 2020, 20,2000);
    }

    public abstract Car getCarFromStorage(int number);

}






