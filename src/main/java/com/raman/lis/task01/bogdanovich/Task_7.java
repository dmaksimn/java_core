package com.raman.lis.task01.bogdanovich;

public class Task_7 {

    public static void main(String[] args) {
        int i, j, y, num, maxNum = 0, sum, st, maxSum = 0;
        int array[]  = {1, 0, 4, 8, 9, 1};
        for (i = 0; i < array.length; i++){
            sum = array[i];
            num = i + 1;
            st = i;
            y = i;
            while (y < array.length) {
                for (j = y; j < array.length; j++) {
                    if (j - st > 1) {
                        sum = sum + array[j];
                        num = num * 10 + (j + 1);
                        st = j;
                    }
                }
                if (sum > maxSum) {
                    maxSum = sum;
                    maxNum = num;
                }
                y++;
                st = y;
                System.out.println(sum);
                sum = array[i];
                num = i + 1;
            }
        }
        System.out.println("Позиции цифр в массиве: " + maxNum);
        System.out.println("Скмма = " + maxSum);
    }
}
