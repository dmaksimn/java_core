package com.raman.lis.task01.mushynski;

public class Task_6 {

    public static void main(String[] args) {
        int matrix1[][] = {{2, 4, 6, 7}, {5, 8, 9, 0}, {1, 2, 3, 4}, {2, 4, 5, 0}};
        int matrix2[][] = {{4, 4, 4, 4}, {5, 5, 5, 5}, {6, 6, 6, 6}, {7, 7, 7, 7}};
        int sumMatrix1 = 0;
        int sumMatrix2 = 0;
        int commonSum = 0;
        int difference = 0;
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                sumMatrix1 += matrix1[i][j];
            }
            for (int k = 0; k < matrix2.length; k++){
                for(int l =0; l < matrix2[k].length; l++ ){
                    sumMatrix2 += matrix2[k][l];
                }

            }

        } commonSum = sumMatrix1 + sumMatrix2;
        System.out.println(commonSum);
        difference = sumMatrix1 - sumMatrix2;
        System.out.println(difference);
    }
}
