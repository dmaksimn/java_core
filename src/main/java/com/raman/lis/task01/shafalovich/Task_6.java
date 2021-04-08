package com.raman.lis.task01.shafalovich;

public class Task_6 {

    public static void main(String[] args) {
        int [][] matrix61 = {{9, 8},
                            {7, 6}};
        int [][] matrix62 = {{1, 2},
                             {3, 4}};
        int[][] matrix63 = new int[2][2];
        int[][] matrix64 = new int[2][2];

        System.out.println("Задание 6 Заданные матрицы: ");
        for (int i = 0; i < matrix61.length; i++){

            for (int j = 0; j < matrix61[i].length; j++){

                matrix63[i][j] = matrix61[i][j] + matrix62 [i][j];
                matrix64[i][j] = matrix61[i][j] - matrix62 [i][j];

                System.out.print(matrix61[i][j] + " ");
                System.out.print(matrix62[i][j] + " ");
                System.out.println(" ");
            }
            System.out.println(" ");

        }
        System.out.println("Задание 6 Сумма матриц: ");

        for (int i = 0; i < matrix63.length; i++){

            for (int j = 0; j < matrix63[i].length; j++){

                System.out.print(matrix63[i][j] + " ");

            }
            System.out.println(" ");
        }
        System.out.println("Задание 6 Разность матриц: ");

        for (int i = 0; i < matrix64.length; i++){

            for (int j = 0; j < matrix64[i].length; j++){

                System.out.print(matrix64[i][j] + " ");

            }
            System.out.println(" ");
        }
    }
}
