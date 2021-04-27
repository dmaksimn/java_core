package com.raman.lis.task01.badrova;

public class Task_1 {

    public static void main(String[] args) {
        int[] numbers = {10, 10, 10, 2, 1, 1};
        int sum = 0;
        int n = 1;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != n) {
                sum = sum + numbers[i];
            }
        }
        System.out.println(sum);
    }
}
