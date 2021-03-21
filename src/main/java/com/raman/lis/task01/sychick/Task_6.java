package com.raman.lis.task01.sychick;

public class Task_6 {

    public static void main(String[] args) {

        int[][] matrixOne = { {7, 3},
                {2, 5} };

        int[][] matrixTwo = { {1, 7},
                {4, 8} };

        int[][] matrixSumma = new int[2][2];
        int[][] matrixDifference = new int[2][2];

        for (int i = 0; i < matrixOne.length; i++) {
            for (int j = 0; j < matrixOne[i].length; j++) {
                matrixSumma[i][j] = matrixOne[i][j] + matrixTwo[i][j];
                matrixDifference[i][j] = matrixOne[i][j] - matrixTwo[i][j];
            }
        }

        System.out.println("Сумма матриц:");

        for (int a[] : matrixSumma) {
            for (int b : a) {
                System.out.print(b + "  ");
            }
            System.out.println("");
        }

        System.out.println("Разность матриц:");

        for (int a[] : matrixDifference) {
            for (int b : a) {
                System.out.print(b + "  ");
            }
            System.out.println("");
        }

    }
}
