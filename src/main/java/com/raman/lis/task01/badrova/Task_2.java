package com.raman.lis.task01.badrova;

public class Task_2 {

    public static void main(String[] args) {
        int n = 9;
        int[] fibonacci = new int[n];
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for (int i = 2; i < fibonacci.length; ++i) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        for (int i = 0; i < fibonacci.length; ++i) {
            System.out.println(fibonacci[i]);
        }

        System.out.println();

        int sum = 0;

        for (int i = 0; i < fibonacci.length; i++) {
            if (fibonacci[i] % 2 == 0) {
                sum = sum + fibonacci[i];
            }
        }
        System.out.println("Сумма всех четных чисел в последовательности равна " + sum);
    }
}
