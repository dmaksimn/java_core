package com.raman.lis.task01.tsylko;

public class Task_1 {

    public static void main(String[] args) {
        int[] mass = {5, 6, 3, 1, 4, 2};
        int n = 3;
        int summa = 0;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] == n) {
                continue;
            } else {
                summa = summa + mass[i];
            }
        }
        System.out.println("Сумма элементов массива, кроме числа n = " + summa);
    }
}
