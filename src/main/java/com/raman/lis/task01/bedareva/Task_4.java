package com.raman.lis.task01.bedareva;

public class Task_4 {

    public static void main(String[] args) {
        int[][] Array = {{5, -7, 3, -17}, {7, 0, -1, 12}, {-8, -1, 2, 3}};
        int k = 0;
        int p = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if (Array[i][j] != 0) {
                    if (Array[i][j] > 0) {
                        k +=1;
                    } else {
                        p +=1;
                    }
                }
            }
        }
        if (k > p) {
            System.out.println("положительных чисел больше");
        } else if (k < p) {
            System.out.println("Отрицательных чисел больше");
        } else if (k == p) {
            System.out.println("кол-во отрицательных и положительных чисел равно");
        }
    }
}
