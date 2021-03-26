package com.raman.lis.task02.bodrova;

 /* Автосалон  (Должен быть создан в методе "mein"). Используется для заказа
         автомобиля на заводе, или же изменения уже существующего авто на сервисе. */

public class Salon {

    private static final Factory FACTORY = new Factory();

    Car getCarFromFactory(String model, int engine_volume, String color, String wheel_size, String option) {
        Car car = FACTORY.create(model, engine_volume, color, wheel_size, option);
        return car;
    }

}
