package com.raman.lis.task01.bogdanovich;

public class Task_2 {

    public static void main(String[] args) {
        int tek = 1, pred = 1, predPred = 0, n = 10, sum = 0;
        for(int i = 3; i <= n; i++) {
            System.out.println(tek);
            if (tek % 2 == 0) {
                sum += tek;
            }
            predPred = pred;
            pred = tek;
            tek = pred + predPred;
        }
        System.out.println(sum);
    }
}
