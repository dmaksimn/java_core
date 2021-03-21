package com.raman.lis.task01.sychick;

public class Task_2 {

    public static void main(String[] args) {

        int value1 = 0;
        int value2 = 1;
        int n = 7;
        int sum = 0;



        for (int i = 0; i < n; i++){
            int valueCom = value1 + value2;
            if (valueCom % 2 == 0){
                sum = sum + valueCom;
            }
            value1 = value2;
            value2 = valueCom;
        }
        System.out.print(sum);

    }
}
