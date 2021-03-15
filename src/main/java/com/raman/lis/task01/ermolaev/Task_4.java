package com.raman.lis.task01.ermolaev;

public class Task_4 {

    public static void main(String[] args) {
        int summch = 0;
        int summnech = 0;
        int[][] mass = {{15, 21, 16, 42, 73, 15, 58, 13, 51},
                {15, 25, 62, 35, 74},
                {54, 36, 74, 20, 98, 14}
        };
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                if (mass[i][j] % 2 == 0) {
                    summch = summch + 1;
                } else {
                    summnech = summnech + 1;
                }
            }
        }
        if (summch < summnech) {
            System.out.println("Больше нечетных");
        } else if (summch > summnech){
            System.out.println("Больше четных");
        } else {
            System.out.println("Четных и нечетных ПОРОВНУ");
        }
    }
}
