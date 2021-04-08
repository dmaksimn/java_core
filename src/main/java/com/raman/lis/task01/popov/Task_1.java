package com.raman.lis.task01.popov;

import java.util.Arrays;

public class Task_1 {

    //Есть некоторый массив, состоящий из целых чисел, также есть некоторое число
    //"n". Суть задания посчитать сумму всех элементов массива, однако если в массиве
    //встречается число "n" то в сумму его включать не нужно.

    public static int[] createArray(int sizeArray, int maxSizeElement) {
        int[] array = new int[sizeArray];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (1 + Math.random() * maxSizeElement);
        }
        return array;
    }

    public static int sumElementArrayIgnoreOneElement(int ignoreElement, int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == ignoreElement) {
                continue;
            }
            sum += array[i];
        }
        return sum;
    }

    public static void main(String... args) {
        int[] array = createArray(15, 15);
        System.out.println(Arrays.toString(array));
        System.out.println(sumElementArrayIgnoreOneElement(5, array));
    }

}
