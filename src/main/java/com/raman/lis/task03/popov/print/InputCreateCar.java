package com.raman.lis.task03.popov.print;

import com.raman.lis.task03.popov.cars.*;
import com.raman.lis.task03.popov.factory.AutoFactoryAudi;
import com.raman.lis.task03.popov.service.ServiceCustomizationOption;

import java.util.Date;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Scanner;

public class InputCreateCar extends GeneralPrint {
    AutoFactoryAudi autoFactoryAudi = new AutoFactoryAudi();
    ServiceCustomizationOption sco = new ServiceCustomizationOption();
    final String str = "Если требуется список доступных модификаций, введите \"Да\"!";

    public void createCar() {
        Scanner scanner = new Scanner(System.in);

        StringBuilder stringBuilder = new StringBuilder();
        String s = "work";
        while (!"Exit".equals(s)) {
            System.out.println("Для создания машины ответьте на следуйщий перечень вопросов: ");
            System.out.println(stringBuilder.append("Какую модель будем создавать?"));
            stringBuilder.setLength(0);
            String strin;

            boolean tr = true;
            while (tr) {
                strin = scanner.nextLine();
                if (strin.equals("Audi")) {
                    Cars car = createCarStudiesTwo(strin);
                    System.out.println("Вот ваша машина:");
                    car.printCharacteristicCar((Car) car);
                    tr = false;
                } else if (strin.equals("BMV")) {
                    Cars car = createCarStudiesTwo(strin);
                    System.out.println("Вот ваша машина:");
                    car.printCharacteristicCar((Car) car);
                    tr = false;
                } else if (strin.equals("Ferrari")) {
                    Cars car = createCarStudiesTwo(strin);
                    System.out.println("Вот ваша машина:");
                    car.printCharacteristicCar((Car) car);
                    tr = false;
                } else {
                    System.out.println("Такой марки нет");
                }
            }
            s = continueWork();
        }
    }

    private Cars createCarStudiesTwo(String model) {
        StringBuilder stringBuilder = new StringBuilder();

        System.out.println(stringBuilder.append("Какога цвета будет машина?"));
        System.out.println(str);
        String s = input();
        String colour;
        if (s.toLowerCase(Locale.ROOT).equals("да")) {
            autoFactoryAudi.printList("colour");
            s = input();
            colour = findElement(autoFactoryAudi.getListColour(), s);
        } else {
            colour = findElement(autoFactoryAudi.getListColour(), s);
        }
        stringBuilder.setLength(0);

        System.out.println(stringBuilder.append("Какой размер колес?"));
        stringBuilder.setLength(0);
        int sizeWheels;
        System.out.println(str);
        int a;
        s = input();
        if (s.toLowerCase(Locale.ROOT).equals("да")) {
            autoFactoryAudi.printList("sizeWheels");
            a = inputInt();
            sizeWheels = findElement(autoFactoryAudi.getListSizeWheels(), a);
        } else {
            try {
                a = Integer.parseInt(s);
            } catch (NumberFormatException e) {
                a = inputInt();
            }
            sizeWheels = findElement(autoFactoryAudi.getListSizeWheels(), a);
        }

        System.out.println(stringBuilder.append("Какой объём двигателя?"));
        stringBuilder.setLength(0);
        int sizeVolumeEngine;
        System.out.println(str);
        s = input();
        if (s.toLowerCase(Locale.ROOT).equals("да")) {
            autoFactoryAudi.printList("volumeEngine");
            a = inputInt();
            sizeVolumeEngine = findElement(autoFactoryAudi.getListVolumeEngine(), a);
        } else {
            try {
                a = Integer.parseInt(s);
            } catch (NumberFormatException e) {
                a = inputInt();
            }
            sizeVolumeEngine = findElement(autoFactoryAudi.getListVolumeEngine(), a);
        }

        Date dat = new Date();
        System.out.println(String.format("Дата выставлена автоматически, днем создания: " + dat));
        stringBuilder.setLength(0);
        String date = dat.toString();

        String typeCar = null;
        if (model.equals("Audi")) {
            System.out.println(stringBuilder.append("Какой тип кузова?"));
            stringBuilder.setLength(0);
            System.out.println(str);
            s = input();
            if (s.toLowerCase(Locale.ROOT).equals("да")) {
                autoFactoryAudi.printList("typeCar");
                s = input();
                typeCar = findElement(autoFactoryAudi.getListTypeCar(), s);
            } else {

                typeCar = findElement(autoFactoryAudi.getListTypeCar(), s);
            }
        }

        System.out.println("Желаете ли добавить опцию?(Да/Нет)");
        String option = null;
        s = input();
        if (s.toLowerCase(Locale.ROOT).equals("да")) {
            System.out.println(("Какую опцию будем добавлять?"));
            System.out.println(str);
            s = input();
            if (s.toLowerCase(Locale.ROOT).equals("да")) {
                sco.printList();
            } else {
                s = input();
                option = findElement(sco.getListOption(), s);
            }
        }
        while (!s.toLowerCase(Locale.ROOT).equals("нет")) {
            if (s.toLowerCase(Locale.ROOT).equals("да")) {
                System.out.println(("Какую опцию будем добавлять?"));
                s = input();
                option = findElement(sco.getListOption(), s);
                break;
            }
            System.out.println("Введена неверная команда!");
            s = input();
        }

        if (model.equals("Audi")) {
            if (option != null) {
                return new CarAudi(colour, sizeWheels, sizeVolumeEngine, option, date, typeCar);
            } else {
                return new CarAudi(colour, sizeWheels, sizeVolumeEngine, date, typeCar);
            }
        } else if (model.equals("BMV")) {
            if (option != null) {
                return new CarBMV(colour, sizeWheels, sizeVolumeEngine, option, date);
            } else {
                return new CarBMV(colour, sizeWheels, sizeVolumeEngine, date);
            }
        } else {
            if (option != null) {
                return new CarFerrari(colour, sizeWheels, sizeVolumeEngine, option, date);
            } else {
                return new CarFerrari(colour, sizeWheels, sizeVolumeEngine, date);
            }
        }
    }

    public String findElement(LinkedList<String> list, String element) {
        for (String anyElement : list) {
            if (element.equals(anyElement)) {
                return element;
            }
        }
        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("Такого элемента нет " + element + "\n" +
                    "Введите другой элемент");
            String s = input();
            return findElement(list, s);
        }
    }

    public int findElement(LinkedList<Integer> list, int element) {
        for (Integer anyElement : list) {
            if (element == (anyElement)) {
                return element;
            }
        }
        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("Такого элемента нет " + element + "\n" +
                    "Введите другой элемент");
            int s = inputInt();
            return findElement(list, s);
        }
    }

    String input() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    int inputInt() {
        Scanner scanner = new Scanner(System.in);
        try {
            return scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Введено не число! Пожалуйста ввидите число!");
            return inputInt();
        }
    }

    public String continueWork() {
        System.out.println("Если хотите продолжить работу и вернуться к начальному выбору введите 1.\n" +
                "Если работа окончена 2");
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        try {
            number = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Ввeдена неверная команда.");
            continueWork();
        }
        if (number == 1) {
            PrintAndWrite printAndWrite = new PrintAndWrite();
            printAndWrite.startProgram();
        } else if (number == 2) {
            return "Exit";
        }
        System.out.println("Ввeден неверный номер.");
        return continueWork();
    }

}