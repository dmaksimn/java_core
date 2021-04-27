package com.raman.lis.task04.bedareva;

import java.util.ArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {

    private static final ArrayList<PartsOfRobot> warehouse = new ArrayList<>();
    private static final ArrayList<PartsOfRobot> warehouseOfPartsCountryA = new ArrayList<>();
    private static final ArrayList<PartsOfRobot> warehouseOfPartsCountryB = new ArrayList<>();
    private static int countRobotsCountryA = 0;
    private static int countRobotsCountryB = 0;
    private static boolean victory = false;
    static PartsOfRobot newPartOfRobots;

    public static void main(String[] args) throws InterruptedException {

        Runnable schedule = () -> {
            newPartOfRobots = PartsOfRobot.getRandom();
            warehouse.add(newPartOfRobots);
            System.out.println("создана " + newPartOfRobots);
        };
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(3);
        executor.scheduleAtFixedRate(schedule, 0, 5, TimeUnit.SECONDS);

        Thread CountryA = new Thread(() -> {
            while (!victory) {
                synchronized (warehouse) {
                    for (int i = 0; i < warehouse.size(); i++) {
                        PartsOfRobot currentPart = warehouse.get(i);
                        if (!warehouseOfPartsCountryA.contains(currentPart) && currentPart != null) {
                            warehouseOfPartsCountryA.add(currentPart);
                            System.out.println("Страна А взяла деталь: " + currentPart);
                            warehouse.remove(currentPart);
                        }
                    }
                    if (warehouseOfPartsCountryA.size() == 6) {
                        countRobotsCountryA++;
                        warehouseOfPartsCountryA.clear();
                        System.out.println("В стане А: " + countRobotsCountryA + " роботов");
                    }
                }
            }
        });

        Thread CountryB = new Thread(() -> {
            while (!victory) {
                synchronized (warehouse) {
                    for (int i = 0; i < warehouse.size(); i++) {
                        PartsOfRobot currentPart = warehouse.get(i);
                        if (!warehouseOfPartsCountryB.contains(currentPart) && currentPart != null) {
                            warehouseOfPartsCountryB.add(currentPart);
                            System.out.println("Страна В взяла деталь: " + currentPart);
                            warehouse.remove(currentPart);
                        }
                    }
                    if (warehouseOfPartsCountryB.size() == 6) {
                        countRobotsCountryB++;
                        warehouseOfPartsCountryB.clear();
                        System.out.println("В стране В: " + countRobotsCountryB + " роботов");
                    }
                }
            }
        });


        CountryA.start();
        CountryB.start();

        Runnable stop = new Runnable() {
            @Override
            public void run() {
                if ((countRobotsCountryA >= 20) || (countRobotsCountryB >= 20)) {
                    executor.shutdown();
                    victory = true;
                } else {
                    executor.schedule(this, 500, TimeUnit.MILLISECONDS);
                }
            }
        };
        executor.schedule(stop, 1, TimeUnit.SECONDS);

        CountryA.join();
        CountryB.join();

        System.out.println("Победитель: " + (countRobotsCountryA >= 20 ? "Страна A" : "Страна В"));
    }
}




