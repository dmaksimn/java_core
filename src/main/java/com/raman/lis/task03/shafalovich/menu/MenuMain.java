package com.raman.lis.task03.shafalovich.menu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class MenuMain {
    private final List<MenuEntry> entries = new ArrayList<MenuEntry>();
    private boolean isExit = false;

    public MenuMain() {
        entries.add(new MenuEntry("Гараж") {
            @Override
            public void run() {
                MenuGarage menuGarage = new MenuGarage();

                System.out.println(menuGarage.print());

                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                try {
                    String line = reader.readLine();
                    int choice = Integer.parseInt(line);
                    MenuEntry entry = menuGarage.entries.get(choice - 1);
                    entry.run();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        entries.add(new MenuEntry("Заказ машины в салоне") {
            @Override
            public void run() {
                //salon.makeOrder(audiFactory, garage, 2021, CarEngines.ENGINE2_0, CarWheels.SIZE_20, CarColors.RED);
            }
        });
        entries.add(new MenuEntry("Выход") {
            @Override
            public void run() {
                isExit = true;
            }
        });
    }

    public String print() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n\tГлавное меню:")
                .append("\n\t1 - Гараж")
                .append("\n\t2 - Заказ машины в салоне")
                .append("\n\t3 - Выход")
                .append("\n");
        return sb.toString();
    }

    public void run() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (!isExit) {
            System.out.println(print());
            try {
                String line = reader.readLine();
                int choice = Integer.parseInt(line);
                MenuEntry entry = entries.get(choice - 1);
                entry.run();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
