package com.raman.lis.task01.popov;

public class Task_2 {

    //Суть задания найти сумму всех четных чисел в последовательности Фибоначи, до определенного индекса "n".
    //Например: Последовательность: 0, 1, 1, 2, 3, 5, 8, 13, 21
    //n = 7 Сумма всех четных до 7го.  равна 2 + 8 = 10.

    public static int sumEvenElementFibonachi(int lastElement) {
        int element1 = 0;
        int element2 = 1;
        int element3 = 0;
        int n = 0;
        int sum = 0;

        while (n != (lastElement - 2)) {
            element3 = element2;
            element2 = element1 + element2;
            element1 = element3;
            System.out.println(element2);
            if (element2 % 2 == 0) {
                sum += element2;
            }
            n++;
        }
        return sum;
    }

    public static void main(String... args) {
        System.out.println(sumEvenElementFibonachi(15));
    }

}
