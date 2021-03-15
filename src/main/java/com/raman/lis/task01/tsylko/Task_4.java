package com.raman.lis.task01.tsylko;

public class Task_4 {

    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int[][] massiv = {{-2, -9, 6, 8, -2, -5},
                {-4, -3, -6, 7, 3}};
        for (int i = 0; i < massiv.length; i++) {
            for (int j = 0; j < massiv[i].length; j++) {
                if (massiv[i][j] > 0) {
                    a++;
                } else {
                    b++;
                }
            }
        }
        if (a > b) {
            System.out.println("В массиве положительных чисел больше, чем отрицательных");
        } else if(a < b) {
            System.out.println("В массиве отрицательных чисел больше, чем положительных");
        } else {
            System.out.println("В массиве одинаковое количество положительных и отрицательных чисел");
        }
    }
}
