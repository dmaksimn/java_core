package com.raman.lis.task01.sychick;

public class Task_1 {

    public static void main(String[] args) {

        int n = 9;
        int [] array = {1, 5, 3, 6, 9, 10};
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] == n){
                continue;
            }
            sum= sum + array[i];
        }
        System.out.print(sum);
    }
}
