package com.raman.lis.task01.ermolaev;

public class Task_5 {

    public static void main(String[] args) {
        int t = 0;
        int[][] mass = {
                {4, 0, 0, 0, 0},
                {15, 18, 0, 0, 0},
                {54, 36, 7, 0, 0},
                {35, 41, 6, 12, 0},
                {54, 31, 81, 8, 16}
        };
        for (int i = 0; i < mass.length - 1; i++) {
            for (int j = i +1; j < mass.length; j++) {
                if (mass[i][j] != 0) {
                    t = 1;
                    break;
                }
            }
        }
        if (t == 0) {
            System.out.println("Данный двумерный Массив - является нижней треугольной матрицей");
        } else {
            System.out.println("Данный двумерный Массив - не является нижней треугольной матрицей");
        }
        int summ = 0;
        for (int k = 0; k < mass.length; k++) {
            for (int l = 0; l < mass.length; l++) {
                summ = summ + mass [k][l];
            }
        }
        System.out.println("Сумма всех элементов матрицы = " + summ);
    }
}
