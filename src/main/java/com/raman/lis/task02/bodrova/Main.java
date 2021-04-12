package com.raman.lis.task02.bodrova;

public class Main {

    public static void main(String[] args) {
        Factory factory = new Factory(new String[]{"CLS", "Maybach", "Vito"}, new int[]{1500, 2900, 3900},
                new String[]{"red", "silver", "black"}, new String[]{"R18", "R17", "R16"});

        Salon salon = new Salon(factory);
        factory.showStorage();
        System.out.println();

        factory.printModelsList(); //Выводим список моделей
        factory.printColorsList(); //Выводим список цветов
        factory.printEngineVolumesList(); //Выводим список двигателей
        factory.printWheelSizeList(); //Выводим список размеров колес
        System.out.println();

        //Перекрашиваем авто в красный
        salon.changeCarColor(3, "blu");
        System.out.println();
        factory.showStorage();

        System.out.println();
        salon.changeCarColor(2, "red");
        factory.showStorage();

        //Попытка заменить на R18
        salon.changeCarWheels(2, "R12");
        factory.showStorage();

        System.out.println();


        //Заказать новую машину
        salon.orderNewCar(new Car("Mercedes", "CLS", 2021,
                1500, "red", "R18"));

        System.out.println();

        //Такой машины на складе нет. Поэтому добавляем ее в список
        salon.orderNewCar(new Car("Mercedes", "CLS", 2021,
                3900,  "silver", "R17"));
        System.out.println("Добавлен автомобиль: ");
        factory.showStorage();

        System.out.println();


        //Добавление и удаление опций
        System.out.println("Добавим климат-контроль.");
        factory.getService().addOption(factory.getStorehouseCars().get(3), "Climate control");
        System.out.println("Опция добавлена:");
        System.out.println(factory.getStorehouseCars().get(3).toString());
        System.out.println("Добавим еще опцию!");
        factory.getService().addOption(factory.getStorehouseCars().get(3), "Seat heater");
        System.out.println("Опция добавлена:");
        System.out.println(factory.getStorehouseCars().get(3).toString());
        System.out.println();
        System.out.println("Удалим опцию");
        factory.getService().removeOption(factory.getStorehouseCars().get(3), "Climate control");
        System.out.println("Имеющиеся опции");
        System.out.println(factory.getStorehouseCars().get(3).toString());
    }

}
