package com.raman.lis.task01.bedareva;

public class Task_1 {

    public static void main(String[] args) {
        int[] array  = {2, 5, 36, 11, 8, 9, 4, 23};
        int n = 11;
        int sum = 0;

        for (int j = 0; j < array.length; j++)
            if (array[j] != n) {
                sum += array[j];
            }
        System.out.println(sum);
    }
}
