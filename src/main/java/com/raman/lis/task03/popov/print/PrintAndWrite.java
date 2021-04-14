package com.raman.lis.task03.popov.print;

import com.raman.lis.task03.popov.factory.AutoFactoryAudi;
import com.raman.lis.task03.popov.print.GeneralPrint;
import com.raman.lis.task03.popov.print.InputCreateCar;
import com.raman.lis.task03.popov.service.ServiceCustomizationColor;
import com.raman.lis.task03.popov.service.ServiceCustomizationOption;

import java.util.Scanner;

public class PrintAndWrite extends GeneralPrint {
    AutoFactoryAudi autoFactoryAudi = new AutoFactoryAudi();
    ServiceCustomizationColor serviceCustomizationColor = new ServiceCustomizationColor();
    ServiceCustomizationOption serviceCustomizationOption = new ServiceCustomizationOption();
    InputCreateCar inputCreateCar = new InputCreateCar();

    public void startProgram() {
        int number = 0;
        System.out.println("Начало работы программы!");
        StringBuilder str = new StringBuilder();
        System.out.println("Выбирете из предложенного списка подходящий номер действия: ");
        str.append("1) Список доступных характеристик авто и моделей;\n" +
                "2) Список услуг сервиса(в разработке);\n" +
                "3) Поиск подходящего варианта авто на складе(в разработке);\n" +
                "4) Создание нового авто;\n" +
                "5) Вывезти созданное авто или со склада в файл(в разработке)");
        System.out.println(str);
        Scanner scanner = new Scanner(System.in);
        try {
            number = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Ввдите число!");
            number = scanner.nextInt();
        } finally {
            if (number == 1) {
                lists();
            }else if(number == 4){
                inputCreateCar.createCar();
            }
        }
    }

    void lists() {
        String s = "work";
        while (!"Exit".equals(s)) {
            System.out.println("Выбирите из списка моделей нужную: ");
            StringBuilder str = new StringBuilder("Достпные модификации для ");

            for (int i = 0; i < autoFactoryAudi.getListModels().size(); i++) {
                System.out.println((i + 1) + ") " + autoFactoryAudi.getListModels().get(i));
            }
            int check = 0;
            while (check == 0) {
                Scanner scanner = new Scanner(System.in);
                String strin = scanner.nextLine();
                if (strin.equals("Audi")) {
                    System.out.println(str.append(strin));
                    gettersLists();
                    autoFactoryAudi.printList("typeCar");
                    serviceCustomizationOption.printList();
                    check = 1;
                } else if (strin.equals("BMV")) {
                    System.out.println(str.append(strin));
                    gettersLists();
                    serviceCustomizationOption.printList();
                    check = 1;
                } else if (strin.equals("Ferrari")) {
                    System.out.println(str.append(strin));
                    gettersLists();
                    serviceCustomizationOption.printList();
                    check = 1;
                } else {
                    System.out.println("Введена неверная модель");
                }
            }
            s = continueWork();
        }

    }

    void gettersLists() {
        autoFactoryAudi.printList("colour");
        autoFactoryAudi.printList("sizeWheels");
        autoFactoryAudi.printList("volumeEngine");
    }

    public String continueWork()  {
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
            startProgram();
        } else if(number == 2) {
            return "Exit";
        }
        System.out.println("Ввeден неверный номер.");
        return continueWork();
    }
}
