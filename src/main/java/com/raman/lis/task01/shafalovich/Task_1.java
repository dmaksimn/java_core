package com.raman.lis.task01.shafalovich;

public class Task_1 {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum1 = 0;
        int n1 = 5;

        for (int i = 0; i < array1.length; i++){

            if (array1[i] != n1){
                sum1 += array1[i];
            }
        }
        System.out.println("Задание 1 " + "Сумма: " + sum1);
    }
}
