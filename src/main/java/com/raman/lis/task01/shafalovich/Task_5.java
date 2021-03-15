package com.raman.lis.task01.shafalovich;

public class Task_5 {

    public static void main(String[] args) {
        int [][] matrica = {{8, 4, 6, 2, 8, 5, 1, 3, 7},
                            {0, 5, 9, 6, 3, 1, 5, 4, 4},
                            {0, 0, 4, 0, 7, 1, 4, 9, 5},
                            {0, 0, 0, 9, 1, 8, 7, 1, 4},
                            {0, 0, 0, 0, 2, 9, 9, 6, 1},
                            {0, 0, 0, 0, 0, 6, 0, 8, 4},
                            {0, 0, 0, 0, 0, 0, 1, 1, 5},
                            {0, 0, 0, 0, 0, 0, 0, 7, 2},
                            {0, 0, 0, 0, 0, 0, 0, 0, 3}};

        boolean triangular = true;

        System.out.print("Задание 5: Является ли данная матрица нижнетреугольной? - ");

        for (int i = 0; i < matrica.length; i++){

            for (int j = 0; j < matrica[i].length; j++){

                if (matrica[i][j] != 0 && i > j) {

                    triangular = false;
                    break;
                }

            }
        }
        System.out.println(triangular == true?"ДА":"НЕТ");
    }
}
