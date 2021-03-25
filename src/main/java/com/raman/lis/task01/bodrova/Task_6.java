package com.raman.lis.task01.bodrova;

public class Task_6 {

    public static void main(String[] args) {
        int n = 2;
        int[][] array1 = {{2, 2}, {2, 2}};
        int[][] array2 = {{1, 1}, {1, 1}};
        int sumArray[][] = new int[n][n];
        int subArray[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sumArray[i][j] = array1[i][j] + array2[i][j];
                subArray[i][j] = array1[i][j] - array2[i][j];
            }
        }

    }

}
