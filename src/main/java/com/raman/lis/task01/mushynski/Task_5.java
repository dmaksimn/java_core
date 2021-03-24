package com.raman.lis.task01.mushynski;

public class Task_5 {

    public static void main(String args[]){
//        int massiv[][] = {{0, 1, 2, 3},
//                          {2, 0, 3, 4},
//                          {0, 0, 2, 3},
//                          {5, 8, 9, 10}};
        int massiv[][] = {{1, 1, 2},
                          {0, 3, 1},
                          {0, 0, 3}};
        for (int i = 0; i < massiv.length; i++) {
            for (int j = 0; j < massiv[i].length; j++) {
                System.out.print(massiv[i][j] + " ");
            }
            System.out.println();
        }
        boolean triangle = true;
        for (int i = 0; i < massiv.length; i++) {
            int sumAll = 0, sumFirst = 0;
            for (int j = 0; j < massiv[i].length; j++) {
                sumAll += massiv[i][j];
            }
            for (int k = 0; k < i; k++) {
                sumFirst += massiv[i][k];
            }
            if (sumAll != sumFirst) {
                triangle = false;
            }
        }
        if(triangle){
            System.out.println("the matrix is triangle");
        } else {
            System.out.println("the matrix not triangle");
        }
    }
}
