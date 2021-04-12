package com.raman.lis.task03.mihnevich.main;

import com.raman.lis.task03.mihnevich.cars.Car;
import com.raman.lis.task03.mihnevich.cars.Model;
import com.raman.lis.task03.mihnevich.cars.impl.Audi;
import com.raman.lis.task03.mihnevich.factories.Factories;
import com.raman.lis.task03.mihnevich.factories.Factory;
import com.raman.lis.task03.mihnevich.salon.Salon;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Audi audi = new Audi("Red", null, 2021, 18, 2.0);
        audi.printCar();
        // Создание авто по заказу
        Salon salon = new Salon();
        Car carOrder = salon.createCarOrder("Blue", Arrays.asList("Cruize control"),
                Model.FIAT, 2021, 14, 1.2);

        carOrder.printCar();
        // Изменение машины в салоне
        Car changedCar = salon.changeCarColor(carOrder, "Yellow");
        changedCar = salon.changeCarWheelSize(changedCar, 15);
        changedCar = salon.changeCarOptions(changedCar, Arrays.asList("Cruize control", "Led light"));
        changedCar.printCar();

        // Поиск наиболее подходящей машины и изменение её на заводе
        Car mostSuitableCar = salon.getMostSuitableCar("Red", Arrays.asList("parktronik"), Model.BMW, 2021, 20, 2.0);
        if (mostSuitableCar == null) {
            System.out.println("Нет подходящего авто");
        } else {
            mostSuitableCar.printCar();
        }

        // Печать списков цветов, моедлей, объемов двигателей, размеров колес
        for (Factory factory : Factories.getFactories()) {
            System.out.println(factory.getClass());
            factory.printColors();
            factory.printModels();
            factory.printEngineVolumes();
            factory.printWheelSizes();
        }
    }
}
