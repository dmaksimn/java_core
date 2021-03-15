package com.raman.lis.task01.ermolaev;

public class Task_6 {

    public static void main(String[] args) {
        int[][] summ = new int[5][5];
        int[][] razn = new int[5][5];
        int[][] mass1 = {
                {4, 12, 54, 6, 17},
                {15, 18, 22, 43, 14},
                {54, 36, 7, 21, 3},
                {35, 41, 6, 12, 8},
                {54, 31, 81, 8, 16}
        };
        int[][] mass2 = {
                {21, 4, 45, 24,28},
                {17, 2, 31, 14, 6},
                {18, 27, 36, 7, 16},
                {17, 48, 26, 20, 0},
                {23, 15, 41, 5, 36}
        };
        System.out.println("Сумма матриц:");
        for (int i = 0; i < summ.length; i++) {
            for (int j = 0; j < summ.length; j++) {
                summ[i][j] = mass1[i][j] + mass2[i][j];
                System.out.print(summ[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Разница матриц:");
        for (int i = 0; i < razn.length; i++) {
            for (int j = 0; j < razn.length; j++) {
                razn[i][j] = mass1[i][j] - mass2[i][j];
                System.out.print(razn[i][j] + " ");
            }
            System.out.println();
        }
    }

}
