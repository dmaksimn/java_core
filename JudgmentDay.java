package com.Task.Task08_Robots;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class JudgmentDay {

    enum PartsRobots {
        LEFTHAND,
        RIGHTHAND,
        LEFTLEG,
        RIGHTLEG,
        BODY,
        HEAD,
        ;

        public static PartsRobots getRandom() {
            Random random = new Random();
            return values()[random.nextInt(values().length)];
        }
    }

    private static final ArrayList<PartsRobots> USAROBOT = new ArrayList<>();
    private static final ArrayList<PartsRobots> USSRROBOT = new ArrayList<>();
    private static final ArrayList<PartsRobots> DETAILS = new ArrayList<>();
    private static int countRobotUSA = 0;
    private static int countRobotUSSR = 0;
    private static final int maxRobots = 0;
    private static boolean win = false;
    static PartsRobots newPartsRobots;

    public static void main(String... args) throws InterruptedException {

        Thread USA = new Thread(() -> {
            while (!win) {
                synchronized (USAROBOT) {
                    for (int i = 0; i < DETAILS.size(); i++) {
                        if (!USAROBOT.contains(DETAILS.get(i))) {
                            USAROBOT.add(DETAILS.get(i));
                            System.out.println("USA take part: "
                                    + DETAILS.get(i));
                            DETAILS.remove(DETAILS.get(i));
                        }
                    }
                    if (USAROBOT.size() == 5) {
                        countRobotUSA++;
                        USAROBOT.clear();
                        System.out.println("In USA: "
                                + countRobotUSA + "robots");
                    }
                }
            }
        });

        Thread USSR = new Thread(() -> {
            while (!win) {
                synchronized (USAROBOT) {
                    for (int i = 0; i < DETAILS.size(); i++) {
                        if (!USSRROBOT.contains(DETAILS.get(i))) {
                            USSRROBOT.add(DETAILS.get(i));
                            System.out.println("USSR take part: "
                                    + DETAILS.get(i));
                            DETAILS.remove(DETAILS.get(i));
                        }
                    }
                    if (USSRROBOT.size() == 5) {
                        countRobotUSSR++;
                        USSRROBOT.clear();
                        System.out.println("In USSR: "
                                + countRobotUSSR + "robots");
                    }
                }
            }
        });

        Runnable list = () -> {
            newPartsRobots = PartsRobots.getRandom();
            DETAILS.add(newPartsRobots);
            System.out.println("Part create: "
                    + newPartsRobots);
        };
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(3);
        executor.scheduleAtFixedRate(list, 0, 100, TimeUnit.MILLISECONDS);

        USA.start();
        USSR.start();

        Runnable stop = new Runnable() {
            @Override
            public void run() {
                if ((countRobotUSA >= maxRobots) || (countRobotUSSR >= maxRobots)) {
                    executor.shutdown();
                    win = true;
                } else {
                    executor.schedule(this, 400, TimeUnit.MILLISECONDS);
                }
            }
        };
        executor.schedule(stop, 1, TimeUnit.SECONDS);
        USA.join();
        USSR.join();
        System.out.println("Winner: "
                + (countRobotUSA >= 5 ? "USA " : "USSR ") + (countRobotUSSR >= 5 ? "USSR " : "USA "));
    }
}