package com.raman.lis.task01.tsylko;

public class Task_6 {

    public static void main(String[] args) {
        int[][] mat1 = {{1, 3, 3, 6},
                {2, 8, 4, 8},
                {1, 7, 1, 2},
                {7, 6, 5, 1}};
        int[][] mat2 = {{4, 2, 1, 8},
                {3, 3, 8, 3},
                {2, 4, 3, 6},
                {5, 3, 8, 2}};
        int[][] summa = new int[4][4];
        System.out.println("Сумма матриц равна:");
        for (int i = 0; i < summa.length; i++) {
            for (int j = 0; j < summa[i].length; j++) {
                summa[i][j] = mat1[i][j] + mat2[i][j];
                System.out.print(" " + summa[i][j]);
            }
            System.out.println();
        }
        int[][] difference = new int[4][4];
        System.out.println("Разность матриц равна:");
        for (int i = 0; i < summa.length; i++) {
            for (int j = 0; j < summa[i].length; j++) {
                difference[i][j] = mat1[i][j] - mat2[i][j];
                System.out.print(" " + difference[i][j]);
            }
            System.out.println();
        }


    }
}
