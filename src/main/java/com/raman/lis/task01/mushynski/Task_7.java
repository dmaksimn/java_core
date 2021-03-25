package com.raman.lis.task01.mushynski;

public class Task_7 {

    public static void main(String[] args) {
        // write your code here
        int sum1 = 0, sum2 = 0;
        int arr[] = {1, 0, 4, 8, 9, 1, 13};
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                sum1 += arr[i];
            }

            for (i = 0; i < arr.length; i++) {
                if (i % 2 == 0) {
                    sum2 += arr[i];
                }
            }
            if (sum1 > sum2) {
                System.out.println(sum1);
            } else {
                System.out.println(sum2);
            }


        }
    }
}
