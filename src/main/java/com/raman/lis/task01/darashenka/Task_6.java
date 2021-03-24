package com.raman.lis.task01.darashenka;

public class Task_6 {
    public static void main(String... args) {
        int matrix[][] = {{5, 4, 3, 6}, {8, 3, 1, 0}};
        int matrix2[][] = {{5, 4, 3, 6}, {8, 3, 1, 0}};
        int sum = 0;
        int sum1 = 0;
        int diff = 0;
        int diff1 = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                sum += matrix[i][j];
                if (i > j)
                    diff = i - j;
                else
                    diff = j - i;
            }
            for (int l = 0; l < matrix2.length; l++) {
                for (int m = 0; m < matrix2.length; m++) {
                    sum1 += matrix2[l][m];
                    if (l > m)
                        diff1 = l - m;
                    else
                        diff1 = m - l;
                }
            }
        }
        System.out.println("matrix sum = " + (sum + sum1));
        System.out.println("matrix differences = " + (diff + diff1));
    }
}
