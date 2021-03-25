package com.raman.lis.task01.mushynski;

public class Task_8 {
    public static void main(String[] args) {
        // write your code here
        int rating[] = {1, 2, 3, 4, 5, 3, 2, 1, 2, 6, 5, 4, 3, 3, 2, 1, 1, 3, 3, 3, 4, 2};
        int cash = 0;
        int rouble1 = 0;
        int rouble = 0;
        int rouble2 = 0;
        for (int i : rating) {
            if (rating[i] == 1 || rating[i] == 3) {
                rouble += 3;


            }

        }

        for (int i : rating) {
            if (rating[i] == 4 || rating[i] == 5) {
                rouble1 += 4;
            }
        }

        for (int i : rating) {
            if (rating[i] == 6) {
                rouble2 += 5;
            }
        }
        cash = rouble + rouble2 + rouble1;
        System.out.println(cash);

    }
}
