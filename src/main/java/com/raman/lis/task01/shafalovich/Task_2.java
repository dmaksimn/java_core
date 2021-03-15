package com.raman.lis.task01.shafalovich;

public class Task_2 {


    public static void main(String[] args) {
        int[] array2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum2 = 0;
        int n2 = 7;

        for (int i = 0; i < array2.length; i++){

            if (array2[i] % 2 == 0 && i != n2){
                sum2 += array2[i];
            }
        }
        System.out.println("Задание 2 " + "Сумма: " + sum2);
    }
}
