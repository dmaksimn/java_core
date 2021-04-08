package com.raman.lis.task02.bodrova;


public class Main {

    public static void main(String[] args) {

        Salon salon = new Salon();
        Car car3 = salon.getCarFromFactory("CLS", 2900, "red", "R16", "");
        System.out.println("Вы купили эту машину");
        car3.printCar();
        System.out.println();

        Factory FACTORY  = new Factory();
        FACTORY.carProperties();

        Salon salon1 = new Salon();
        Car car_with_parctronic = salon.getCarFromFactory("Maybach", 3900, "black", "R18", "parktronic");
        System.out.println("Вы купили эту машину");
        car_with_parctronic.printCar();
    }
}
