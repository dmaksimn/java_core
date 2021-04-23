package com.raman.lis.task04.shafalovich;


import java.util.Random;
import java.util.concurrent.LinkedBlockingDeque;

public class Factory implements Runnable{

    private Random random = new Random();
    private static final LinkedBlockingDeque<Details> STORAGE = new LinkedBlockingDeque<>();

    public void create() {
        int i = random.nextInt(Details.values().length);
        STORAGE.add(Details.values()[i]);
        //System.out.println(STORAGE);
    }

    @Override
    public void run() {
        create();
    }

    public static Details checkDetail() {
        return STORAGE.getLast();
    }

    public static Details getDetail() {
        return STORAGE.pollLast();
    }
}
