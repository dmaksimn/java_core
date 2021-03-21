package com.raman.lis.task01.tsylko;

public class Task_2 {

    public static void main(String[] args) {
        int n = 7;
        int a = 0;
        int b = 1;
        int next;
        int summa = 0;
        for (int i = 2; i < n; i++) {
            next = a + b;
            a = b;
            b = next;
            if (next % 2 == 0) {
                summa += next;
            }
        }
        System.out.print("Сумма всех четных чисел до n равна: " + summa);
    }
}
