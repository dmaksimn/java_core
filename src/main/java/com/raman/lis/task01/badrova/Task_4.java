package com.raman.lis.task01.badrova;

public class Task_4 {

    public static void main(String[] args) {

        int[][] array = {{0, 2, -3, 6, -1, -5, 8, 4}, {-2, 0, 3, 5, -9, -3, 7, 5}};
        int positiveCount = 0;
        int negativeCount = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

                if (array[i][j] < 0) {
                    negativeCount++;
                }

                if (array[i][j] >= 0) {
                    positiveCount++;
                }
            }
        }

        System.out.println("Отрицательных чисел в массиве " + negativeCount);
        System.out.println("Положительных чисел в массиве " + positiveCount);

        if (positiveCount > negativeCount) {
            System.out.println("В массиве больше положительных чисел");
        } else {
            System.out.println("В массиве больше отрицательных чисел");
        }
    }
}
