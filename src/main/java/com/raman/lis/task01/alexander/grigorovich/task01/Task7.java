package com.raman.lis.task01.alexander.grigorovich.task01;

public class Task7 {
    /*
     *Задание *
     *Есть некоторый массив из целых положительних чисел. [1, 0, 4, 8, 9, 1]
     *Необходимо написать программу которая посчитает максимально возможную сумму
     *которую можно получить из данного массива, с условием что элементы включенные в
     *сумму не должны стоять на соседних индексах (должен быть минимум один елемент
     *между ними).
     *Для предложенного массива это: 1, 4, 9 = 14.
     */
    public static void main(String[] args) {

         int[] array = {1, 0, 4, 8, 9, 1};
        int sum = 0;
        int max = 0, min = 0;
        int indexMax = 0, indexMin = 0;

        for (int i = 0; i < array.length - 2; i++) {
            if (array[i] > array[i + 1]) {
                max = array[i];
                indexMax = i;
            } else if (array[i] < array[i + 1]) {
                max = array[i + 1];
                indexMax = i + 1;
                if (max > min && indexMax % indexMin == 1) {
                    continue;
                } else if (max > min && indexMax % indexMin == 0) {
                    sum += min;
                    sum += max;
                }
            }

            i++;
            min = max;
            indexMin = indexMax;

            if (array[i + 1] > min && (i - indexMin) != 0) {
                max = array[i + 1];
                indexMax = i + 1;
                sum += min;
                min = max;
                indexMin = indexMax;
            } else if (array[i + 1] < min && (i % indexMin) != 0) {
            }
        }

        System.out.println("Max sum of array elements is " + sum);

    }
}
