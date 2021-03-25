package com.raman.lis.task01.shafalovich;

public class Task_3 {

    public static void main(String[] args) {
        int[] array3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int b = 0;

        System.out.print("Задание 3: Заданный массив - ");
        for (int i = 0, k = 1; i < array3.length; i++, k++) {

            System.out.print(array3[i] + " ");
        }

        for (int i = 0, k = 1; i < array3.length/2; i++, k++){

            b = array3[i];
            array3[i] = array3[array3.length - k];
            array3[array3.length - k] = b;

        }

        System.out.print("Инверсированный массив - ");
        for (int i = 0, k = 1; i < array3.length; i++, k++) {

            System.out.print(array3[i] + " ");
        }
        System.out.println(" ");
    }
}
