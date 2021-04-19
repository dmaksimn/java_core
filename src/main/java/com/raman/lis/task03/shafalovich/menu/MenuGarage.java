package com.raman.lis.task03.shafalovich.menu;

import com.raman.lis.task03.shafalovich.Garage;
import com.raman.lis.task03.shafalovich.enums.CarColors;
import com.raman.lis.task03.shafalovich.Salon;
import com.raman.lis.task03.shafalovich.enums.CarWheels;
import com.raman.lis.task03.shafalovich.services.ColorService;
import com.raman.lis.task03.shafalovich.services.OptionsService;
import com.raman.lis.task03.shafalovich.services.WheelService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class MenuGarage {
    protected final List<MenuEntry> entries = new ArrayList<MenuEntry>();
    private Garage garage = new Garage();

    ColorService colorService = new ColorService();
    WheelService wheelService = new WheelService();
    OptionsService optionsService = new OptionsService();
    Salon salon = new Salon(colorService, wheelService, optionsService);


    public MenuGarage() {

        entries.add(new MenuEntry("Список машин в гараже") {
            @Override
            public void run() {

                showCarsInGarage();
            }
        });
        entries.add(new MenuEntry("Изменить цвет машины") {
            @Override
            public void run() {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                try {
                    System.out.println("Под каким номером машина, в которой вы хотите изменить цвет?");
                    String line1 = reader.readLine();
                    int numberOfCar = Integer.parseInt(line1);
                    System.out.println("Выберете и введите один из предлагаемых цветов: " + CarColors.print());
                    String color = reader.readLine();
                    salon.changeCarColorInColorService(
                            garage.getCar(numberOfCar - 1),
                            CarColors.valueOf(color.toUpperCase(Locale.ROOT))
                    );
                    System.out.println("Машина " + numberOfCar + " была покрашена в " + color + " цвет");
                    System.out.println(garage.getCar(numberOfCar - 1));
                    showCarsInGarage();
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    try {
                        reader.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        entries.add(new MenuEntry("Изменить размер колес машины") {
            @Override
            public void run() {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                try {
                    System.out.println("Под каким номером машина, в которой вы хотите изменить колеса?");
                    String line1 = reader.readLine();
                    int numberOfCar = Integer.parseInt(line1);
                    System.out.println("Выберете и введите один из предлагаемых размеров: " + CarWheels.print());
                    String wheelSize = reader.readLine();
                    salon.changeCarWheelsInWheelService(
                            garage.getCar(numberOfCar - 1),
                            (CarWheels) CarWheels.valueOf(wheelSize) // ошибка
                    );
                    System.out.println("Машина " + numberOfCar + " была покрашена в " + wheelSize + " цвет");
                    System.out.println(garage.getCar(numberOfCar - 1));
                    showCarsInGarage();
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    try {
                        reader.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        entries.add(new MenuEntry("Изменить/Удалить опции машины") {
            @Override
            public void run() {

            }
        });
    }

    public void showCarsInGarage() {
        System.out.println(garage);
    }

    public String print() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n\t1 - Список машин в гараже")
                .append("\n\t2 - Изменить цвет машины")
                .append("\n\t3 - Изменить размер колес машины")
                .append("\n\t4 - Изменить/Удалить опции машины")
                .append("\n");
        return sb.toString();
    }
}
