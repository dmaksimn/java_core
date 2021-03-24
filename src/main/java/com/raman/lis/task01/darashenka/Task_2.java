package com.raman.lis.task01.darashenka;

public class Task_2 {
    public static void main(String... args) {
        int array[] = {0, 1, 1, 2, 3, 5, 8, 13, 21};
        int n = array[6];
        int sum = 0;
        for (int i = 0;i < n; i++) {
            if (array[i] % 2 == 0) {
                sum += array[i];
        }
        }
            System.out.println("sum of all even numbers until the 7th = " + sum);
        }
    }
