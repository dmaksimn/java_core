package com.raman.lis.task02.shafalovich;

public class Main {

    public static void main(String[] args) {

        Car car1 = new Car("BMW", "Blue", 2010, 2.5d, 19, "Подогрев сидения");
        Car car2 = new Car("Audi", "White", 2012, 1.8d, 17, "Подогрев руля");
        Car car3 = new Car("Mercedes", "Black", 2015, 2.0d, 19);

        Factory factory = new Factory(car1, car2, car3);

        Service service = new Service();

        Salon salon = new Salon();

        factory.setModels("BMW", "Audi", "Mercedes", "Tesla", "Mazda", "Geely", "Ford");
        factory.setColors("Black", "White", "Red", "Blue", "Green", "Yellow", "Pink");
        factory.setEngineValues(1.5d, 1.8d, 2.0d, 2.5d, 3.0d);
        factory.setWheelSizes(14, 15, 16, 17, 18, 19, 20, 21);

        System.out.println("Машины на складе изначально: ");
        factory.showCarInCarWarehouse();

        //изменяет существующую машину
        salon.setOrder("BMW", "Black", 2000, 20, 2.5d, "Забавный гудок");
        System.out.println("Параметры вашего заказа: " + salon.getOrder());
        factory.doCar(salon, service);

        factory.showCarInCarWarehouse();

        //добавляет новую машину
        salon.setOrder("Tesla", "White", 2021, 19, 3.0d);
        System.out.println("Параметры вашего заказа: " + salon.getOrder());
        factory.doCar(salon, service);

        factory.showCarInCarWarehouse();

        //не добавляет машину если параметры указаны не верно
        salon.setOrder("Volvo", "Pink", 1777, 25, 6.0d, "Беспилотник");
        System.out.println("Параметры вашего заказа: " + salon.getOrder());
        factory.doCar(salon, service);

        factory.showCarInCarWarehouse();

        //не добавляет машину, если хотя бы один параметр заказа указан не верно
        salon.setOrder("Mazda", "Orange", 1777, 17, 1.8d);
        System.out.println("Параметры вашего заказа: " + salon.getOrder());
        factory.doCar(salon, service);

        factory.showCarInCarWarehouse();
    }
}
