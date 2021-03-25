package com.raman.lis.task01.darashenka;

public class Task_8 {
    public static void main(String... args) {
        int array[] = {1, 2, 3, 4, 5, 3, 2, 1, 2, 6, 5, 4, 3, 3, 2, 1, 1, 3, 3, 3, 4, 2};
        int money[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int sum = 1;
        for (int i = 0; i < array[i]; i++) {
            if (array[i] < array.length) {
                array[i] = array[i] + array.length;
            }
                sum += array[i];
            System.out.println("min number of roubles must have = " + sum);
        }
    }
}
