package com.raman.lis.task01.shafalovich;

public class Task_7 {

    public static void main(String[] args) {
        int[] arrayPlus1 = {2, 0, 2, 0, 0, 0, 10, 20};
        int sumNeChet = 0;
        int sumChet = 0;

        System.out.println("Задание 1*: ");
        System.out.print("Заданный массив: ");
        for (int i = 0; i < arrayPlus1.length; i++ ){
            if (i % 2 != 0) sumNeChet += arrayPlus1[i];
            else sumChet += arrayPlus1[i];

            System.out.print(arrayPlus1[i] + " ");
        }

        if (sumNeChet > sumChet) System.out.println("Максимально возможная сумма: " + sumNeChet);
        else if (sumChet > sumNeChet) System.out.println("Максимально возможная сумма: " + sumChet);
        else System.out.println("Суммы одинаковы и равны: " + sumChet);
    }
}
