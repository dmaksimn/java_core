package com.raman.lis.task02.popov;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Car_Salon car_salon = new Car_Salon();
        Service service = new Service();
        Auto_Factory plant = new Auto_Factory();
        //plant.printListModel();
        //plant.printListVolumeEngine();
        plant.printListColour();
        //plant.printListSizeWheels();
        System.out.println();

        Car car1 = car_salon.orderCar(4, 2, 3, 4);
        Car car2 = car_salon.orderCar(2, 2, 2, 2,1);
        Car car3 = car_salon.orderCar(3, 2, 3, 2,3);

        plant.addManyCarToStorage(3, car1, car2, car3);
        service.addOption(car2,2);

        car2.printCharacteristicCar(car2);
        System.out.println();

        service.changeColor(car2, 4);
        service.changeSizeWheels(car2,3);
        service.removeOption(car2,1);
        car2.printCharacteristicCar(car2);
        System.out.println();

        Car car4 = car_salon.orderCar(3, 1, 3, 1);
        Car car5 = car_salon.orderCar(4, 2, 3, 2);

        System.out.println(Auto_Factory.storage.size());


    }
}
