package com.raman.lis.task01.sychick;

public class Task_4 {

    public static void main(String[] args) {

        int [][] array = {{3, 5, 1, 2, 0, -3}, {-2, 0, 5, -3, -4, -1}};
        int positive = 0;
        int negative = 0;

        for (int a [] : array) {
            for(int  b : a){
                if(b >= 0){
                    positive++;
                } else {
                    negative++;
                }
            }
        }
        System.out.println("Положительных: " + positive + " Отрицательных " + negative);

        if(positive > negative){
            System.out.println("Положительных больше");
        } else if (positive < negative){
            System.out.println("Отрицательных больше");
        } else {
            System.out.println("Положительных и отрицательных одикавовое количество");
        }
    }
}
