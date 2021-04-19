package com.raman.lis.task03.shafalovich;

import com.raman.lis.task03.shafalovich.enums.CarColors;
import com.raman.lis.task03.shafalovich.menu.MenuMain;
import com.raman.lis.task03.shafalovich.services.ColorService;
import com.raman.lis.task03.shafalovich.services.OptionsService;
import com.raman.lis.task03.shafalovich.services.WheelService;

public class Main {

    public static void main(String[] args) {

        ColorService colorService = new ColorService();
        WheelService wheelService = new WheelService();
        OptionsService optionsService = new OptionsService();

        AudiFactory audiFactory = new AudiFactory();
        BmwFactory bmwFactory = new BmwFactory();
        GeelyFactory geelyFactory = new GeelyFactory();

        Garage garage = new Garage();
        Salon salon = new Salon(colorService, wheelService, optionsService);



    }
}

