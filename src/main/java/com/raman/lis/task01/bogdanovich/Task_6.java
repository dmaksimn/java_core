package com.raman.lis.task01.bogdanovich;

public class Task_6 {

    public static void main(String[] args) {
        int array1[][] = new int[3][3];
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                array1[i][j] = (int) (Math.random() * 10 + i);

            }
        }
        int array2[][] = new int[3][3];
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                array2[i][j] = (int) (Math.random() * 10 + i);
            }
        }
        int array3[][] = new int[3][3];
        int array4[][] = new int[3][3];
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                array3[i] [j] = array1[i] [j] + array2[i] [j];
                array4[i] [j] = array1[i] [j] - array2[i] [j];
            }
        }
        for (int i = 0; i < array1.length; i++){
            for (int j = 0; j < array1[i].length; j++){
                System.out.print(array1[i] [j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
        for (int i = 0; i < array2.length; i++){
            for (int j = 0; j < array2[i].length; j++){
                System.out.print(array2[i] [j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
        for (int i = 0; i < array3.length; i++){
            for (int j = 0; j < array3[i].length; j++){
                System.out.print(array3[i] [j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
        for (int i = 0; i < array4.length; i++){
            for (int j = 0; j < array4[i].length; j++){
                System.out.print(array4[i] [j] + " ");
            }
            System.out.println("");
        }
    }
}
