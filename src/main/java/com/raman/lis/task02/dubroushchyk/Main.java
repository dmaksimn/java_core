package com.raman.lis.task02.dubroushchyk;

public class Main {

    public static void main(String[] args) {
        CarService service = new CarService();
        CarFactory factory = new CarFactory(service);
        CarSalon salon = new CarSalon(factory, service);
        factory.storageInfo();
        Car car1 = salon.createCarOnCarFactory(CarColor.GREEN, CarModel.MERCEDES, 2019,
                                                CarSizeWheels.HIGH, CarEngineVolume.LOW_VOLUME);

        car1.Info();
        factory.storageInfo();
        Car car2 = salon.getCarFromCarFactoryStorage(2);
        factory.storageInfo();
        car2.Info();
        salon.changeServiceColor(car2, "BLUE");
        System.out.println("");
        car2.Info();
        Car car3 = salon.createCarOnCarFactory(CarColor.BLUE, CarModel.BMW, 2020,
                CarSizeWheels.Low, CarEngineVolume.MIDDLE_VOLUME);
        System.out.println("");
        car3.Info();
        factory.storageInfo();
    }
}
