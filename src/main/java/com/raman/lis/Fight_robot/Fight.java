package com.raman.lis.Fight_robot;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Fight {

    private static final ArrayList<PartsForRobots> EUROPEROBOT = new ArrayList<>();
    private static final ArrayList<PartsForRobots> AMERICAROBOT = new ArrayList<>();
    private static final ArrayList<PartsForRobots> DETAILS = new ArrayList<>();
    private static int countRobotsEurope = 0;
    private static int countRobotsAmerica = 0;
    private static final int maxRobots = 5;
    private static boolean win = false;
    static PartsForRobots newPartForRobots;

    public static void main(String[] args) throws InterruptedException {

        Thread Europe = new Thread(new Runnable() {
            @Override
            public void run() {
                while (!win) {
                    synchronized (EUROPEROBOT) {
                        for (int i = 0; i < DETAILS.size(); i++) {
                            if (!EUROPEROBOT.contains(DETAILS.get(i))) {
                                EUROPEROBOT.add(DETAILS.get(i));
                                System.out.println("Европа взяла деталь: " + DETAILS.get(i));
                                DETAILS.remove(DETAILS.get(i));
                            }
                        }
                        if (EUROPEROBOT.size() == 5) {
                            countRobotsEurope++;
                            EUROPEROBOT.clear();
                            System.out.println("В Европе: " + countRobotsEurope + " роботов");
                        }
                    }
                }
            }
        });

        Thread America = new Thread(new Runnable() {
            @Override
            public void run() {
                while (!win) {
                    synchronized (EUROPEROBOT) {
                        for (int i = 0; i < DETAILS.size(); i++) {
                            if (!AMERICAROBOT.contains(DETAILS.get(i))) {
                                AMERICAROBOT.add(DETAILS.get(i));
                                System.out.println("Америка взяла деталь: " + DETAILS.get(i));
                                DETAILS.remove(i);
                            }
                        }
                        if (AMERICAROBOT.size() == 5) {
                            countRobotsAmerica++;
                            AMERICAROBOT.clear();
                            System.out.println("В Америке: " + countRobotsAmerica + " роботов");
                        }
                    }
                }
            }
        });

        Runnable schedule = new Runnable() {
            @Override
            public void run() {
                newPartForRobots = PartsForRobots.getRandom();
                DETAILS.add(newPartForRobots);
                System.out.println("Создана деталь: " + newPartForRobots);
            }
        };

        ScheduledExecutorService executor = Executors.newScheduledThreadPool(3);
        executor.scheduleAtFixedRate(schedule, 0, 100, TimeUnit.MILLISECONDS);

        Europe.start();
        America.start();

        Runnable stop = new Runnable() {
            @Override
            public void run() {
                if ((countRobotsEurope >= maxRobots) || (countRobotsAmerica >= maxRobots)) {
                    executor.shutdown();
                    win = true;
                } else {
                    executor.schedule(this, 400, TimeUnit.MILLISECONDS);
                }
            }
        };
        executor.schedule(stop, 1, TimeUnit.SECONDS);

        Europe.join();
        America.join();

        System.out.println("Победитель: " + (countRobotsEurope >= 5 ? "Европа" : "Америка"));
    }
}

enum PartsForRobots {
    LEFTHAND,
    RIGHTHAND,
    LEFTLEG,
    RIGHTLEG,
    HEAD;

    public static PartsForRobots getRandom() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }
}
