package com.raman.lis.task01.popov;

import java.util.Arrays;

public class Task_5 {


    //Дан некоторый двумерный массив. Нужно определить является ли он нижней
    //треугольной матрицей или же нет.

    public static void triangularMatrixYesOrNo(int[][] array) {
        int n = array.length - 1;
        for (int i = array.length - 2; i >= 0; i--) {
            for (int j = array.length - 1; j >= n; j--) {
                if (array[i][j] != 0) {
                    System.out.println("Данный массив неявляется нижней треугольной матрицей!");
                    n = j;
                    break;
                }
            }
            if (array[i][n] != 0) {
                break;
            }
            if (i == 0) {
                System.out.println("Данный массив является нижней треугольной матрицей!");
            }
            n--;
        }

    }

    public static void main(String... args) {
        int[][] array = {{3, 0, 0, 0, 0}, {4, 1, 0, 1, 1}, {1, 2, 3, 0, 0}, {2, 3, 1, 6, 0}, {2, 6, 3, 1, 7}};
        triangularMatrixYesOrNo(array);

        for (int[] i : array) {
            System.out.println(Arrays.toString(i));
        }
    }
}
