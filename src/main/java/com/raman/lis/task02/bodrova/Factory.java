package com.raman.lis.task02.bodrova;



/* Автозавод (Должен быть создан в методе "mein", использоваться же может автосолоном).
   Имеет следующие особености:
       * Имеет список моделей которые может создавать. Этот список должен задаваться
         во время создания.
       * Имеет список с объемами двигателей которые можно установить на автомобиль.
         Этот список должен задаваться во время создания.
       * Имеет Список цветов в которые можно покрасить автомобиль. Этот список
         должен задаваться во время создания.
       * Имеет список размеров колес которые можно установить на автомобиль. Этот
         список должен задаваться во время создания.
       * Завод имеет склад, во время создания завода он производит некоторое кол-во
         автомобилей и хранит их на складе.
       * Имеет доступ к сервису.
   Имеет следующие возможности:
        * Ожидается возможность вывода на печать возможных для производства
          цветов/обьемов двигателей/моделей/размеров дисков
        * Создать автомобиль по заказу салона. Однако если автомобиль есть на
          складе он должен быть использован вместо создания нового.
        * Ожидается возможность выбора со склада наиболее подходяшего автомобиля
          и изменения его согласно заказу.  */

public class Factory {

    String[] model = {"CLS", "Maybach", "Vito"};      //список моделей
    int[] engine_volume = {1500, 2900, 3900};         //список объемов двигателя
    String[] color = {"red", "silver", "black"};      //список цветов
    String[] wheel_size = {"R18", "R17", "R16"};      //список размеров колес
    String[] option = {"heated seats","parktronic",""};  //список опций
    Car[] carPark = new Car[2];

    //конструктор завода с одновременным созданием двух автомобилей на склад
    public Factory(){
        Car car1 = new Car("Maybach", 3900, "silver", "R18", "heated seats");
        carPark[0] = car1;
        Car car2 = new Car("Vito", 2900, "black", "R17", "");
        carPark[1] = car2;
        System.out.println("На складе в наличии следующие автомобили:");
        car1.printCar();
        System.out.println();
        car2.printCar();
    }

    //метод создания нового автомобиля
    Car create(String model, int engine_volume, String color, String wheel_size, String option) {
        Car car = new Car(model, engine_volume, color, wheel_size, option);
        return car;
    }

    //метод вывода возможных характеристик автомобилей
    public void carProperties() {
        System.out.println();
        System.out.println("Завод производит следующие модели:");
        for (int i = 0; i < model.length; i++) {
            System.out.println(model[i]);
        }
        System.out.println("Завод производит двигатели объемом:");
        for (int i = 0; i < engine_volume.length; i++) {
            System.out.println(engine_volume[i]);
        }
        System.out.println("Завод производит автомобили цветов:");
        for (int i = 0; i < color.length; i++) {
            System.out.println(color[i]);
        }
        System.out.println("Завод производит размеры колес:");
        for (int i = 0; i < wheel_size.length; i++) {
            System.out.println(wheel_size[i]);
        }
    }

}
