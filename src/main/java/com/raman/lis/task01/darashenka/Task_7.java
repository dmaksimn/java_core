package com.raman.lis.task01.darashenka;

public class Task_7 {
    public static void main (String... args) {
        int array[] = {1, 0, 4, 8, 9, 1};
        int sum = 0;
        for (int i = 0; i < array.length; i = i+2) {
            sum += array[i];
        }
        System.out.println("max possible sum = " + sum);
    }
}
