package com.raman.lis.task01.bodrova;

public class Task_6 {

    public static void main(String[] args) {

        int[][] array1 = {{1, 1}, {1, 1}};
        int[][] array2 = {{2, 2}, {2, 2}};
        int sum1 = 0;
        int sum2 = 0;
        int sum;
        int sub;

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1.length; j++) {
                sum1 = sum1 + array1[i][j];
            }
        }

        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                sum2 = sum2 + array2[i][j];
            }
        }
        sum = sum1 + sum2;
        sub = sum1 - sum2;
        System.out.println("Сумма элементов двух матриц равна " + sum);
        System.out.println("Разность элементов двух матриц равна  " + sub);
    }
}
