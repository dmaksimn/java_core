package com.raman.lis.task01.sychick;

public class Task_3 {

    public static void main(String[] args) {

        int [] array1 = {3, 1 , 5 ,-1, 6 ,8, 2};
        int [] array2 = new int [array1.length];

        for (int i = 0; i < array1.length; i++){
            array2 [(array1.length - 1) - i] = array1[i];
        }

        for (int i = 0; i < array2.length; i++){
            System.out.print(array2[i] + "\t");

        }

    }
}
