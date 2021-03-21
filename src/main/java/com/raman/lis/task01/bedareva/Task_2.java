package com.raman.lis.task01.bedareva;

public class Task_2 {

    public static void main(String[] args) {

        int n = 7;
        int sum = 0;
        int[] array = new int[n];
        array[0] = 0;
        array[1] = 1;
        for (int j = 2; j < n; j++) {
            array[j] = array[j - 1] + array[j - 2];
            if (array[j] % 2 == 0) {
                sum += array[j];
            }
        }
        System.out.println(sum);
    }
}
