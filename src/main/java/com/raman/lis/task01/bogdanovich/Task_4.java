package com.raman.lis.task01.bogdanovich;

public class Task_4 {

    public static void main(String[] args) {
        int znak, bB, pol = 0, otr = 0;
        int array[] [] = new int[5] [5];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                znak = (int) (Math.random() * 10 +i);
                if (znak < 5) {
                    bB = -1;
                } else {
                    bB = 1;
                }
                array[i] [j] = bB * (int) (Math.random() * 10 + i);
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i] [j] + " ");
                if (array[i] [j] < 0) {
                    otr++;
                } else {
                    pol++;
                }
            }
        }
        System.out.println("Положительных чисел " + pol);
        System.out.println("Отрицательных чисел " + otr);
        if (pol > otr) {
            System.out.println("Положительных чисел больше, чем отрицательных");
        }
        if (pol == otr) {
            System.out.println("Положительных чисел столько же, сколько и отрицательных");
        }
        if (pol < otr) {
            System.out.println("Положительных чисел меньше, чем отрицательных");
        }
    }
}
