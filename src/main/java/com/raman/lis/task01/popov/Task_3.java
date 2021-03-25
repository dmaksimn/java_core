package com.raman.lis.task01.popov;

import java.util.Arrays;

public class Task_3 {

    //Дан некоторый массив, суть задания инвертировать его.

    public static int[] createArray(int sizeArray, int maxSizeElement) {
        int[] array = new int[sizeArray];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (1 + Math.random() * maxSizeElement);
        }
        return array;
    }

    public static int[] invertArray(int[] array) {
        int[] invArray = new int[array.length];
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--, j++) {
            invArray[j] = array[i];
        }
        return invArray;
    }

    public static int[] invertArrayMethod2(int[] array) {
        int swap;
        for (int i = 0; i < array.length / 2; i++) {
            swap = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = swap;
        }
        return array;
    }

    public static void main(String... args) {
        int[] array = createArray(10, 25);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(invertArray(array)));
        System.out.println(Arrays.toString(invertArrayMethod2(array)));
    }
}
