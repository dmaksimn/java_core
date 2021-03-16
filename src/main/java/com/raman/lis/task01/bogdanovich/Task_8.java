package com.raman.lis.task01.bogdanovich;

public class Task_8 {

    public static void main(String[] args) {
        // write your code here
        int i, y, schet = 0, sum = 0;
        int array[] = {5, 4, 3, 2, 1, 5, 4, 3, 2, 1, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5};
        int money[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        for (i = 0; i < array.length - 1; i++) {
            array[i] = (int) (Math.random() * 10);
        }

        for (i = 0; i < array.length - 1; i++) {
            if (array[i + 1] > array[i]){
                money[i + 1] = money[i] + 1;
            }
            if (array[i + 1] == array[i]){
                money[i + 1] = money[i];
            }
        }

        for(i = array.length - 1; i > 1; i--) {
            if ((array[i - 1] > array[i]) & (array[i] + 1 != array[i - 2])) {
                money[i - 1] = money[i] + 1;
            }
            if ((array[i - 1] > array[i]) & (array[i - 1]  == array[i - 2])) {
                money[i - 1] = money[i] + 1;
            }
            if (array[i - 1] == array[i]) {
                money[i - 1] = money[i];
            }
        }

        for (i = 0; i < array.length; i++) {
            money[i]++;
        }

        for (i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]){
                if (money[i] <= money[i + 1]){
                    money[i] = money[i + 1] + 1;
                }
            }
        }

        for (i = array.length - 1; i > 0; i--){
            if (array[i] > array[i - 1]){
                if (money[i] <= money[i - 1]){
                    money[i] = money[i - 1] + 1;
                }
            }
        }

        for (i = array.length - 1; i > 0; i--){
            if (array[i] == array[i - 1]){
                if (money[i] != money[i - 1]){
                    money[i] = money[i - 1];
                }
            }
        }

        for (i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1]){
                if (money[i] != money[i + 1]){
                    money[i] = money[i + 1];
                }
            }
        }

        for (i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }

        System.out.println(" ");

        for (i = 0; i < money.length; i++) {
            System.out.print(" " + money[i]);
            sum = sum + money[i];
        }

        System.out.println(" " + sum);
    }
}
