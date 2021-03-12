package com.raman.lis.task01.dubroushchyk;

public class Task_4 {

//            Задание 4
//        Дан некоторый двумерный массив. Нужно определить каких чисел в нем больше,
//                положительных или отрицательных.

    public static void main (String[] args) {

        int[][] array = { {3, 4, -2, 7, -1, -2},
                          {-5, 2, -1, -5, -1, 2} };
        int pos = 0;
//        int neg = 0;

        for (int x[] : array) {
            for (int y : x) {
                if (y >= 0) {
                    pos++;
                } else {
                    pos--;
                }
            }
        }

//        System.out.println("Положительных чисел: " + pos + "    Отрицательных чисел: " + neg);

        if (pos > 0) {
            System.out.println("Положительных чисел больше");
        } else if (pos < 0) {
            System.out.println("Отрицытельных чисел больше");
        } else {
            System.out.println("Положительных и отрицательных чисел одинаково");
        }
    }
}
