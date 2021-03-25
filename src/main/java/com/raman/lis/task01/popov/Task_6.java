package com.raman.lis.task01.popov;

import java.util.Arrays;

public class Task_6 {

    //Даны две квадратные матрицы. Необходимо написать программу которая посчитает их
    //сумму и разности.

    public static int[][] createArray(int sizeArrayColumn, int sizeArrayString, int maxSizeElement) {
        int[][] array = new int[sizeArrayColumn][sizeArrayString];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = (int) (1 + Math.random() * maxSizeElement);

            }
        }
        return array;
    }

    public static int[][] sumTwoMatrix(int[][] array1, int[][] array2) {
        int[][] array3 = new int[array1.length][array1.length];
        if (array1.length - 1 == array2.length - 1 && array2[0].length - 1 == array1[0].length - 1) {
            for (int i = 0; i < array1.length; i++) {
                for (int j = 0; j < array1[0].length; j++) {
                    array3[i][j] = array1[i][j] + array2[i][j];
                }
            }
        } else {
            System.out.println("Матрицы не равны по количеству строк и столбцов, операция невозможна!");
        }
        return array3;
        //знал бы исключения в java реализовал бы без нулевой матрицы...
    }

    public static int[][] differenceTwoMatrix(int[][] array1, int[][] array2) {
        int[][] array3 = new int[array1.length][array1.length];
        if (array1.length - 1 == array2.length - 1 && array2[0].length - 1 == array1[0].length - 1) {
            for (int i = 0; i < array1.length; i++) {
                for (int j = 0; j < array1[0].length; j++) {
                    array3[i][j] = array1[i][j] - array2[i][j];
                }
            }
        } else {
            System.out.println("Матрицы не равны по количеству строк и столбцов, операция невозможна!");
        }
        return array3;

    }

    public static void main(String... args) {
        int[][] array1 = createArray(5, 5, 20);
        int[][] array2 = createArray(5, 5, 24);
        int[][] array3 = sumTwoMatrix(array1, array2);
        int[][] array4 = differenceTwoMatrix(array1, array2);

        for (int[] i : array1) {
            System.out.println(Arrays.toString(i));
        }
        System.out.println();
        for (int[] i : array2) {
            System.out.println(Arrays.toString(i));
        }
        System.out.println();
        for (int[] i : array3) {
            System.out.println(Arrays.toString(i));
        }
        System.out.println();
        for (int[] i : array4) {
            System.out.println(Arrays.toString(i));
        }
    }
}
