package com.raman.lis.task01.dubroushchyk;

public class Task_2 {

//            Задание 2
//        Суть задания найти сумму всех четных чисел в последовательности Фибоначи, до
//        определенного индекса "n".
//                Например:
//        Последовательность: 0, 1, 1, 2, 3, 5, 8, 13, 21
//        n = 7
//        Сумма всех четных до 7го.  равна 2 + 8 = 10

    public static void main(String[] args) {

        int firstVal = 0;
        int secondVal = 1;
        int sum = 0;
        int n = 7;

        for (int i = 2; i < n; i++) {
            int temp = firstVal + secondVal;

            if (temp % 2 == 0) {
                sum += temp;
            }

            firstVal = secondVal;
            secondVal = temp;
        }

        System.out.println(sum);

    }
}
