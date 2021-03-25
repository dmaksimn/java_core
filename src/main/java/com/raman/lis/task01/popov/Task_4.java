package com.raman.lis.task01.popov;

import java.util.Arrays;

public class Task_4 {

    //Дан некоторый двумерный массив. Нужно определить каких чисел в нем больше,
    //положительных или отрицательных.

    public static int[][] createArray(int sizeArrayColumn, int sizeArrayString, int maxSizeElement, int minSizeElement) {
        int[][] array = new int[sizeArrayColumn][sizeArrayString];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = (int) ((Math.random() * maxSizeElement) + minSizeElement);
                //как здесь сделать тот максимальный элемент, который задается методом.....
            }
        }
        return array;
    }

    public static void whichNumberMore(int[][] array) {
        int positiveNumber = 0;
        int negativeNumber = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] >= 0) {
                    positiveNumber++;
                } else {
                    negativeNumber++;
                }
            }
        }
        if (positiveNumber > negativeNumber) {
            System.out.println("Положительных чисел в массиве больше!");
        } else if (positiveNumber == negativeNumber) {
            System.out.println("Положительных и отрицательных чисел в массиве одинаково!");
        } else {
            System.out.println("Отрицательных чисел в массиве больше!");
        }
    }

    public static void main(String... args) {
        int[][] array = createArray(4, 5, 30, -10);
        for (int[] i : array) {
            System.out.println(Arrays.toString(i));
        }
        whichNumberMore(array);


    }
}
