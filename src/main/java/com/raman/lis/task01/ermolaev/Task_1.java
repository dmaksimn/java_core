package com.raman.lis.task01.ermolaev;

public class Task_1 {

    public static void main(String[] args) {
        int [] mass = {4, 25, 12, 65, 43,5};
        int n = 65;
        int summ = 0;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] != n) {
                summ = summ + mass[i];
            }
        }
        System.out.println(summ);
    }
}
