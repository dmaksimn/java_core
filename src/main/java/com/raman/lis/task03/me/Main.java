package com.raman.lis.task03.me;

import com.raman.lis.task03.me.model.car.AudiCar;
import com.raman.lis.task03.me.model.car.BMWCar;
import com.raman.lis.task03.me.model.car.FordCar;
import com.raman.lis.task03.me.service.impl.Salon;

public class Main {

    public static void main(String[] args) {
        Salon salon = new Salon();
        salon.printAudiFactorySetup();
        System.out.println();
        salon.printBMWFactorySetup();
        System.out.println();
        salon.printFordFactorySetup();
        System.out.println();

        AudiCar audiCar = salon.createAudi();
        System.out.println(audiCar.getForPrint());
        System.out.println();

        BMWCar bmwCar = salon.createBMW();
        System.out.println(bmwCar.getForPrint());
        System.out.println();

        FordCar fordCar = salon.createFord();
        System.out.println(fordCar.getForPrint());
        System.out.println();
    }
}
