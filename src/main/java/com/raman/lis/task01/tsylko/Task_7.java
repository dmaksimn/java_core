package com.raman.lis.task01.tsylko;

public class Task_7 {

    public static void main(String[] args) {
        int[] array = {2, 1, 5, 6, 0, 3, 10, 20, 0, 0, 0, 0, 30};
        int index = 0;
        int summaMax = array[index];
        for (int i = 1; i < array.length; i++) {
            int dop = summaMax;
            summaMax = Math.max(index + array[i], array[i]);
            index = dop;
            summaMax = Math.max(dop, summaMax);

        }
        System.out.println("Максимально возможная сумма: "+ summaMax);
    }
}
