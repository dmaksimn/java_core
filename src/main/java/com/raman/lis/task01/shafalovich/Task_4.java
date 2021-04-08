package com.raman.lis.task01.shafalovich;

public class Task_4 {

    public static void main(String[] args) {
        int [][] matrix4 = {{1, -2, 3},
                {4, -5, 0},
                {7, -8, 9} };

        int positiveNum = 0, negativeNum = 0, zeroNum = 0;

        for (int i = 0; i < matrix4.length; i++){

            for (int j = 0; j < matrix4[i].length; j++){

                if (matrix4[i][j] == 0) zeroNum++;
                if (matrix4[i][j] < 0) negativeNum++;
                if (matrix4[i][j] > 0) positiveNum++;

            }
        }
        System.out.println("Задание 4 " + "Нулевых значений: " + zeroNum + " "
                + "Отрицательных значений: " + negativeNum + " "
                + "Положительных значений: " + positiveNum);
    }
}
