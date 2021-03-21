package com.raman.lis.task01.bogdanovich;

public class Task_5 {

    public static void main(String[] args) {
        int prov = 0;
        int array[][] = new int[5][5];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i] [j] = (int) (Math.random() * 10 + i);
                // write your code here
            }
        }
        //сделаем массив который является нижней треугольной матрицей
        //for (int i = 0; i < array.length; i++){
        //   for (int j = i; j < array[i].length; j++){
        //      array[i] [j] = 0;
        //   }
        // }
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                System.out.print(array[i] [j] + " ");
            }
            System.out.println("");
        }
        for (int i = 0; i < array.length; i++){
            for (int j = i; j < array[i].length; j++){
                if (array[i] [j] != 0) {
                    prov = 1;
                }
            }
        }
        if (prov == 0) {
            System.out.println("Этот массив является нижней треугольной матрицей");
        } else {
            System.out.println("Этот массив не является нижней треугольной матрицей");
        }
    }
}
