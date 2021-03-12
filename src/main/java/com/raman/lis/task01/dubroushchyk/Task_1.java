package com.raman.lis.task01.dubroushchyk;

public class Task_1 {

//                Задание 1
//        Есть некоторый массив, состоящий из целых чисел, также есть некоторое число
//        "n". Суть задания посчитать сумму всех элементов массива, однако если в массиве
//        встречается число "n" то в сумму его включать не нужно.

    public static void main(String[] args) {

        int n = 10;
        int[] array = {2, 5, 7, 3, 6, 10};
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                continue;
            }
            sum += array[i];
        }

        System.out.println(sum);

    }
}
