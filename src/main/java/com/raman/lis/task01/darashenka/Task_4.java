package com.raman.lis.task01.darashenka;

public class Task_4 {
    public static void main(String... args) {
        int array[][] = {{25, -34, -43, -65,}, {98, 52, 62, 12}};
        int positive = 0;
        int negative = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i][j] >= 0)
                    positive++;
                else
                    negative++;
            }
        }
            if (positive > negative)
                System.out.println("In this massive more positive numbers");
            else
                System.out.println("In this massive more negative numbers");
        }
    }
