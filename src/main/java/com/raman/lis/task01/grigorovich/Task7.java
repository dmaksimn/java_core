package com.raman.lis.task01.grigorovich;

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
        int indexMax, indexMin;

        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {
                if (array[i] > array[i - 1]) {
                    max = array[i + 1];
                    indexMax = i + 1;
                    min = array[i - 1];
                    indexMin = i - 1;
                    if (indexMax - indexMin > 0) {
                        sum += min;
                        sum += max;
                        i++;
                    }
                } else if (array[i] > array[i - 1]) {
                    if (array[i + 1] > array[i]) {
                        max = array[i + 1];
                        indexMax = i + 1;
                        min = array[i];
                        indexMin = i;
                        if (indexMax - indexMin == 1) {
                            sum += max;
                        }
                    }
                } else if (array[i] == array[i - 1]) {
                }
            } else if (array[i] > array[i + 1]) {
                if (max > array[i + 1]) {
                    continue;
                }
            }
            if (array[i] > array[i - 1]) {
            } else if (array[i] < array[i - 1]) {
            } else if (array[i] == array[i - 1]) {
            } else if (array[i] > array[i + 1]) {
            }
        }

        System.out.println(sum);

    }
}
