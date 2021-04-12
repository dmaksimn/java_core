package com.raman.lis.task03.shafalovich;

public class Main {

    public static void main(String[] args) {

        ColorService colorService = new ColorService();
        WheelService wheelService = new WheelService();
        OptionsService optionsService = new OptionsService();

        AudiFactory audiFactory = new AudiFactory();
        Garage garage = new Garage();
        Salon salon = new Salon(colorService, wheelService, optionsService);

        System.out.println(garage);

        salon.printCarProperties();

        salon.makeOrder(audiFactory, garage, -1337, null, null, null);

        System.out.println(garage);
    }
}

