package com.raman.lis.task04.bogdanovich;

import java.util.HashSet;
import java.util.*;
import java.util.concurrent.*;

public class Main {
    private static final Set <Integer> ROBOT1 = new HashSet<>();
    private static final Set <Integer> ROBOT2 = new HashSet<>();
    private static final ArrayList <Integer> DETALS = new ArrayList<>();
    static int element;
    static boolean a;
    static int scoreTeam1 = 0;
    static int scoreTeam2 = 0;
    static int maxScore = 5;

    public static void main(String[] args) {

        Runnable plant = new Runnable() {
            @Override
            public void run() {
                Random random = new Random();
                element = random.nextInt(6) + 1;
                synchronized (DETALS) {
                    DETALS.add(element);
                }
                System.out.println("Создана деталь: " + element);
            }
        };

        Runnable country1 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < DETALS.size(); i++) {
                    if (!ROBOT1.contains(DETALS.get(i))) {
                        synchronized (DETALS) {
                            ROBOT1.add(DETALS.get(i));
                            System.out.println("Старана 1 взяла деталь: " + DETALS.get(i));
                            DETALS.remove(i);
                        }
                    }
                }

                if (ROBOT1.size() == 6) {
                    scoreTeam1++;
                    ROBOT1.clear();
                    System.out.println("Страна 1 [" + scoreTeam1 + " - "
                            + scoreTeam2 + "] Страна 2 ");
                }
            }
        };

        Runnable country2 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < DETALS.size(); i++) {
                    if (!ROBOT2.contains(DETALS.get(i))) {
                        synchronized (DETALS) {
                            ROBOT2.add(DETALS.get(i));
                            System.out.println("Старана 2 взяла деталь: " + DETALS.get(i));
                            DETALS.remove(i);
                        }
                    }
                }

                if (ROBOT2.size() == 6) {
                    scoreTeam2++;
                    ROBOT2.clear();
                    System.out.println("Страна 1 [" + scoreTeam1 + " - "
                            + scoreTeam2 + "] Страна 2 ");
                }

            }
        };

        ScheduledExecutorService executor = Executors.newScheduledThreadPool(3);
        ScheduledFuture<?> createDetals = executor.scheduleAtFixedRate(
                plant,0,500,TimeUnit.MILLISECONDS);
        ScheduledFuture<?> createRobotCountry2 = executor.scheduleAtFixedRate(
                country2,2,2,TimeUnit.SECONDS);
        ScheduledFuture<?> createRobotCountry1 = executor.scheduleAtFixedRate(
                country1,2,2,TimeUnit.SECONDS);

        Runnable stop = new Runnable() {
            @Override
            public void run() {
                if((scoreTeam1 >= maxScore) | (scoreTeam2 >= maxScore)) {
                    createDetals.cancel(false);
                    createRobotCountry1.cancel(false);
                    createRobotCountry2.cancel(false);
                    executor.shutdown();
                } else {
                    executor.schedule(this,400,TimeUnit.MILLISECONDS);
                }
            }
        };
        executor.schedule(stop,1,TimeUnit.SECONDS);
    }
}
