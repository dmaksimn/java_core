package com.raman.lis.task01.ermolaev;

public class Task_2 {

    public static void main(String[] args) {
        int summ = 0;
        int n = 12;
        int [] mass = new int[n];
        mass[0] = 0;
        mass[1] = 1;
        for (int j = 2; j < n; j++){
            mass[j] = mass[j-1] + mass [j-2];
        }
        for (int i = 0; i < n; i++) {
            if (mass[i] % 2 == 0) {
                summ = summ + mass[i];
            }
        }
        System.out.println("Сам массив Фибоначи до n-го элемента:");
        for (int k = 0; k < n; k++) {

            System.out.print(mass[k] + " ");
        }
        System.out.println();
        System.out.println("Сумма четных - " + summ);
    }
}
