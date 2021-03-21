package com.raman.lis.task01.tsylko;

public class Task_3 {

    public static void main(String[] args) {
        int[] mass = {8, 4, 6, 3, 1, 2, 5, 9, 6, 3};
        for (int i = 0; i < mass.length / 2; i++) {
            int var = mass[i];
            mass[i] = mass[mass.length - i - 1];
            mass[mass.length - i - 1] = var;
        }
        System.out.println("Инвертированный массив: ");
        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i] + " ");
        }
    }
}
