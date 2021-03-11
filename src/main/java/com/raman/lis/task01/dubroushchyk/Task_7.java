package com.raman.lis.task01.dubroushchyk;

public class Task_7 {

//    Задание *
//    Есть некоторый массив из целых положительних чисел. [1, 0, 4, 8, 9, 1]
//    Необходимо написать программу которая посчитает максимально возможную сумму
//    которую можно получить из данного массива, с условием что элементы включенные в
//    сумму не должны стоять на соседних индексах (должен быть минимум один елемент
//            между ними).
//
//    Для предложенного массива это: 1, 4, 9 = 14.

    public static void main(String[] args) {

        int[] mass = {1, 5, 3};
        int sum = mass[0];
        int a = 0;


        for (int i = 1; i < mass.length; i++) {
            int temp = sum;
            sum = Math.max(Math.max(a + mass[i], mass[i]), sum);
            a = temp;
        }

        System.out.println(sum);

    }
}
