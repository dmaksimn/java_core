package com.raman.lis.task03.badrova.company1;

import com.raman.lis.task03.badrova.company2.MercedesCar;
import com.raman.lis.task03.badrova.company2.MercedesFactory;
import com.raman.lis.task03.badrova.company2.MercedesSalon;

public class Main {

    public static void main(String[] args) {

        //создание завода BMW
        BMWFactory bmwFactory = new BMWFactory(new String[]{"X5", "X3", "i3"}, new int[]{3000, 2000, 1600},
                new String[]{"red", "silver", "black"}, new String[]{"R21", "R18", "R16"});

        bmwFactory.showStorage(); //склад готовых автомобилей
        System.out.println();
        bmwFactory.printModelsList(); //доступные модели
        System.out.println();
        bmwFactory.printColorsList(); //доступные цвета
        System.out.println();
        bmwFactory.printEngineVolumesList(); //доступные объемы двигателя
        System.out.println();
        bmwFactory.printWheelSizeList(); //доступные размер колес
        System.out.println();

        BMWSalon bmwSalon = new BMWSalon(bmwFactory); //создание салона BMW
        bmwSalon.changeCarColor(1, "black"); //перекрашиваем складской автомобиль 1 автомобиль
        System.out.println();
        bmwFactory.showStorage(); //проверяем смену цвета
        System.out.println();
        bmwSalon.changeCarWheels(1,"R16"); //меняем колеса автомобиля 1
        System.out.println();
        bmwFactory.showStorage(); //проверяем изменения
        bmwSalon.changeCarWheels(1, "R12"); //попытка поменять колеса на недоступный размер

        //заказываем новый автомобиль
        bmwSalon.orderNewCar(new BMWCar(
                "i3",
                2021,
                1500,
                "silver",
                "R16" ));
        System.out.println("Добавлен автомобиль: ");
        bmwFactory.showStorage();
        System.out.println();

        //Добавление и удаление опций
        System.out.println("Добавим климат-контроль.");
        bmwFactory.getBmwServise().addOption(bmwFactory.getStorehouseCars().get(3), "Climate control");
        System.out.println("Опция добавлена:");
        bmwFactory.showStorage();

        bmwFactory.getBmwServise().removeOption(bmwFactory.getStorehouseCars().get(3), "Climate control");
        bmwFactory.showStorage();
        System.out.println();

        //создание завода Mercedes
        MercedesFactory mercedesFactory = new MercedesFactory(new String[]{"CLS", "Maybach", "Vito"}, new int[]{1500, 2900, 3900},
                new String[]{"red", "silver", "black"});
        mercedesFactory.showStorage(); //просмотр склада готовых автомобилей
        System.out.println();
        mercedesFactory.printModelsList();
        System.out.println();
        mercedesFactory.printColorsList();
        System.out.println();
        mercedesFactory.printEngineVolumesList();
        System.out.println();

        MercedesSalon mercedesSalon = new MercedesSalon(mercedesFactory);
        mercedesSalon.changeCarColor(1, "red");
        mercedesFactory.showStorage();
        System.out.println();
        mercedesSalon.orderNewCar(new MercedesCar("M5", 4400, "black"));
        mercedesFactory.showStorage();
        System.out.println();

        //Добавление и удаление опций
        System.out.println("Добавим климат-контроль.");
        mercedesFactory.getMercedesService().addOption(mercedesFactory.getStorehouseCars().get(2), "Climate control");
        System.out.println("Опция добавлена:");
        bmwFactory.showStorage();




















    }

}
