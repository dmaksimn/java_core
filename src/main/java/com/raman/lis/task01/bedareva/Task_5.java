package com.raman.lis.task01.bedareva;

public class Task_5 {

    public static void main(String[] args) {
        int[][] Array = {{1, 3, 5, 4, 6 }, {0, 2, 3, 9, 4}, {0, 0, 6, 5, 9}, {0, 0, 0, 7, 5}, {0, 0, 0, 0, 3}};
        boolean z = true;
        boolean k = true;

        for (int i = 0; i < Array.length; i++) {
            for (int j = 0; j < Array[i].length; j++) {
                if (Array.length == Array[i].length) {
                    if (i > j && Array[i][j] != 0) {
                        z = false;
                    }
                } else {
                    k = false;
                }
            }
        }
        if (k ==false) {
            System.out.println("Матрица не является квадратой");
        }
        else if (z == true) {
            System.out.println("Матрица является нижней треугольной");
        } else if (z == false) {
            System.out.println("Матрица не является нижней треугольной");
        }
    }
}
