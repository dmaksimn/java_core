package com.raman.lis.task01.dubroushchyk;

public class Task_6 {

//        Задание 6
//        Даны две квадратные матрицы. Необходимо написать программу которая посчитает их
//        сумму и разности.

    public static void main(String[] args) {

        int[][] matrix1 = { {8, 2},
                            {3, 4} };

        int[][] matrix2 = { {1, 4},
                            {2, 6} };

//        int[][] matrixSum = new int[2][2];
//        int[][] matrixDif = new int[2][2];

//        for (int i = 0; i < matrix1.length; i++) {
//            for (int j = 0; j < matrix1[i].length; j++) {
//                matrixSum[i][j] = matrix1[i][j] + matrix2[i][j];
//                matrixDif[i][j] = matrix1[i][j] - matrix2[i][j];
//            }
//        }
//
//        System.out.println("Сумма матриц:");
//
//        for (int x[] : matrixSum) {
//            for (int y : x) {
//                System.out.print(y + "  ");
//            }
//            System.out.println("");
//        }
//
//        System.out.println("\nРазность матриц:");
//
//        for (int x[] : matrixDif) {
//            for (int y : x) {
//                System.out.print(y + "  ");
//            }
//            System.out.println("");
//        }

        System.out.println("Сумма матриц:");

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                System.out.print(matrix1[i][j] + matrix2[i][j] + "  ");
            }
            System.out.println("");
        }

        System.out.println("\nРазность матриц:");

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                System.out.print(matrix1[i][j] - matrix2[i][j] + "  ");
            }
            System.out.println("");
        }
    }
}


