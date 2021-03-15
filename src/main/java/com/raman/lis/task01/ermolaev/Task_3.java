package com.raman.lis.task01.ermolaev;

public class Task_3 {

    public static void main(String[] args) {
        int [] mass = {15, 21, 16, 42, 73, 15, 58, 13, 51};
        int x = 0;
        int c = mass.length;
        for (int i = 0; i < c / 2; i++) {
            x = mass[c - i - 1];
            mass[c - i - 1] = mass[i];
            mass[i] = x;
        }
        for (int j = 0; j < mass.length; j++){
            System.out.print(mass[j] + " ");
        }
    }
}
