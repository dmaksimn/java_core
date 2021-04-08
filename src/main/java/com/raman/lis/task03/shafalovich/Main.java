package com.raman.lis.task03.shafalovich;

public class Main {

    public static void main(String[] args) {

        ColorService colorService = new ColorService();
        WheelService wheelService = new WheelService();

        AudiFactory audiFactory = new AudiFactory();
        Garage garage = new Garage();
        Salon salon = new Salon(colorService, wheelService);

        System.out.println(garage);

        salon.printCarProperties();

//        Car audi = new AudiCar(2020,2.0,18,"Black");
//        System.out.println(audi);
//        salon.changeCarColorInColorService(audi, CarColors.RED);
//        salon.changeCarWheelsInWheelService(audi, CarWheels.SIZE_21);
//        System.out.println(audi);


        salon.makeOrder(audiFactory, 2019,CarEngines.ENGINE4,CarWheels.SIZE_21,CarColors.BLUE);
        System.out.println(garage.searchCarByOrder(audiFactory.getNewCar()));

        BmwCar bmw = new BmwCar(2020,3, 21,"Blue");
        AudiCar audi = new AudiCar(2019,2.5,21,"Blue");

        System.out.println(bmw.equals(audi));
        //System.out.println(garage);
    }
}

