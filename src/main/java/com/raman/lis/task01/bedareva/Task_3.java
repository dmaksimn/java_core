package com.raman.lis.task01.bedareva;

public class Task_3 {

    public static void main(String[] args) {
        int[] Array = {3, 2, 26, 9, 8, 12, 0, 1, 4};
        for (int j = 0; j <Array.length; j++) {
            System.out.print(Array[j] + " ");
        }
        System.out.println();

        int n = Array.length;
        int temp;
        for (int i = 0; i < n/2; i++) {
            temp = Array[n - i - 1];
            Array[n - i - 1] = Array[i];
            Array[i] = temp;
        }
        for (int i = 0; i <Array.length; i++){
            System.out.print(Array[i] + " ");
        }
    }

}
