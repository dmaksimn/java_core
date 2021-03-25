package com.raman.lis.task01.bodrova;

public class Task_5 {

    public static void main(String[] args) {
        int a = 10;
        boolean b = true;
        int[][] trMatrix = new int[a][a];

        for (int i = 0; i < trMatrix.length; i++) {
            for (int j = 0; j < trMatrix.length; j++) {

                if (i != j && i < j)
                    b = trMatrix[i][j] == 0 ? true : false;
            }
        }
        if (b == true) {
            System.out.print("Массив является нижней треугольной матрицей");
        } else {
            System.out.print("Массив не является нижней треугольной матрицей");
        }
    }

}
