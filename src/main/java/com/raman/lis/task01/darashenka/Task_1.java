package com.raman.lis.task01.darashenka;

public class Task_1 {
    public static void main(String... args) {
        int array[] = {2, 5, 7, 4, 6, 8, 9, 1};
        int n = 5;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != n) {
                sum += array[i];
            }
        }
        System.out.println("sum without n = " + sum);
    }
}
