package com.raman.lis.task01.bogdanovich;

public class Task_1 {

    public static void main(String[] args) {
        int l = 10, n = 10, i, sum = 0;
        int array[] = new int[10];
        for(i = 0; i < 10; i++) {
            array[i] = (int) (Math.random() * 10 + 3);
            n = array[2];
            System.out.println(array[i]);
            if (array[i] != n) {
                sum += array[i];
            }
        }
        System.out.println("n = " + n);
        System.out.println("Сумма = " + sum);
    }
}
