package com.raman.lis.task01.darashenka;

public class Task_3 {
    public static void main(String... args) {
        int array[] = {2, 5, 7, 4, 6, 8, 9, 1};
        int ReverseArray[] = new int[array.length];
        for (int i = array.length - 1; i > 0; ) {
            for (int j = 0; j < array.length; j++) {
                ReverseArray[j] = array[i];
                i--;
                System.out.print(ReverseArray[j] + " ");
            }
        }
    }
}

