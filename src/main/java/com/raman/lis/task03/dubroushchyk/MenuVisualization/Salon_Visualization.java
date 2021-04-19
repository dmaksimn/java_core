package com.raman.lis.task03.dubroushchyk.MenuVisualization;

import com.raman.lis.task03.dubroushchyk.*;
import com.raman.lis.task03.dubroushchyk.Enum.Audi.CarColorAudi;
import com.raman.lis.task03.dubroushchyk.MenuVisualization.CarFactory.AudiCarFactoryVis;
import com.raman.lis.task03.dubroushchyk.MenuVisualization.CarFactory.BmwCarFactoryVis;
import com.raman.lis.task03.dubroushchyk.MenuVisualization.CarFactory.MercedesCarFactoryVis;

public class Salon_Visualization {

    ServiceColor serviceColor = new ServiceColor();
    ServiceWheels serviceWheels = new ServiceWheels();
    ServiceOptional serviceOptional = new ServiceOptional();
    CarFactoryAudi carFactoryAudi = new CarFactoryAudi(serviceColor, serviceWheels, serviceOptional);
    CarFactoryBmw carFactoryBmw = new CarFactoryBmw(serviceColor, serviceWheels, serviceOptional);
    CarFactoryMercedes carFactoryMercedes = new CarFactoryMercedes(serviceColor, serviceWheels, serviceOptional);
    AudiCarFactoryVis audiCarFactoryVis = new AudiCarFactoryVis(carFactoryAudi);
    BmwCarFactoryVis bmwCarFactoryVis = new BmwCarFactoryVis(carFactoryBmw);
    MercedesCarFactoryVis mercedesCarFactoryVis = new MercedesCarFactoryVis(carFactoryMercedes);

    public void startProgram() {
        while(true) {
            System.out.print("\n\t\tАВТОСАЛОН\nВыберите необходимое действие:\n" +
                    "\t 1.Заказать авто;\n" +
                    "\t 2.Гаражи автосалонов\n" +
                    "\t 3.Выход из системы\n" +
                    "Введите число: ");
            String valueForSwitch = Main.scanner.nextLine();
            switch (valueForSwitch) {
                case "1":
                    carModel();
                    break;
                case "2":
                    storageVis();
                    break;
                case "3":
                    System.exit(0);
                default:
                    System.out.println("Введено не верное значение");
//                    continue;
            }
        }
    }

    void carModel() {
        while (true) {
            System.out.print("\nВыберите модель авто:\n" +
                    "\t 1.АУДИ;\n" +
                    "\t 2.БМВ.\n" +
                    "\t 3.МЕРСЕДЕС.\n" +
                    "\t 4.Назад.\n" +
                    "\t 5.Выход из системы\n" +
                    "Введите число: ");
            String valueForSwitch = Main.scanner.nextLine();
            switch (valueForSwitch) {
                case "1":
                    Car carAudi = audiCarFactoryVis.carCreateVis();
                    carAudi.info();
                    break;
                case "2":
                    Car carBmw = bmwCarFactoryVis.carCreateVis();
                    carBmw.info();
                    break;
                case "3":
                    Car carMercedes = mercedesCarFactoryVis.carCreateVis();
                    carMercedes.info();
                    break;
                case "4":
                    return;
                case "5":
                    System.exit(0);
                default:
                    System.out.println("Введено не верное значение");
            }
        }
    }


    void storageVis() {
        while (true) {
            System.out.print("\nВыберите гараж:\n" +
                    "\t 1.АУДИ;\n" +
                    "\t 2.БМВ.\n" +
                    "\t 3.МЕРСЕДЕС.\n" +
                    "\t 4.Назад.\n" +
                    "\t 5.Выход из системы\n" +
                    "Введите число: ");
            String valueForSwitch = Main.scanner.nextLine();
            switch (valueForSwitch) {
                case "1":
                    carFactoryAudi.storageInfo();
                    break;
                case "2":
                    carFactoryBmw.storageInfo();
                    break;
                case "3":
                    carFactoryMercedes.storageInfo();
                    break;
                case "4":
                    return;
                case "5":
                    System.exit(0);
                default:
                    System.out.println("Введено не верное значение");
            }
        }
    }
}
