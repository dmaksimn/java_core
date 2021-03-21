package com.raman.lis.task02.dubroushchyk;


public class CarSalon {

    private CarFactory factory;
    private CarService service;

    CarSalon(CarFactory factory, CarService service) {
        this.factory = factory;
        this.service = service;
    }

    Car createCarOnCarFactory(CarColor color, CarModel model, int yearProduction,
                              CarSizeWheels sizeWheels, CarEngineVolume engineVolume) {
            return factory.createCar(color.getColor(), model.getModel(), yearProduction,
                    sizeWheels.getSizeWheels(), engineVolume.getVolume());
    }

    Car getCarFromCarFactoryStorage(int number) {
        return factory.getCarFromStorage(number);
    }

    void changeServiceColor(Car car, String color) {
        service.changeCarColorInCar(car, color);
    }

    void changeServiceWheels(Car car, int wheels) {
        service.changeCarWheelsInCar(car, wheels);
    }

    void addServiceOptional(Car car, String string) {
        service.addOptionalInCar(car, string);
    }

    void removeServiceOptional(Car car, String string) {
        service.removeOptionalInCar(car, string);
    }
}
