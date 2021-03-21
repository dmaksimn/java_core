package com.raman.lis.task01.bedareva;

public class Task_6 {

    public static void main(String[] args) {
        int[][] a = {{5, 7, 3, 17}, {7, 0, 1, 12}, {8, 1, 2, -3}, {2, -9, 0, 6}};
        int[][] b = {{3, -7, 2, -11}, {2, 6, 10, -3}, {18, 6, 7, 13}, {5, 7, 7, -12}};
        int[][] c = new int[4][4];
        int[][] d = new int [4][4];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                c[i][j] = a[i][j] + b[i][j];
                d[i][j] = a[i][j] - b[i][j];
            }
        }
        for (int x = 0; x < c.length; x++) {
            System.out.println();
            for (int y = 0; y < c[x].length; y++) {
                System.out.print(c[x][y] + " ");
            }
        }
        System.out.println();

        for (int k = 0; k < d.length; k++) {
            System.out.println();
            for (int p = 0; p < d[k].length; p++) {
                System.out.print(d[k][p] + " ");
            }
        }
    }
}
