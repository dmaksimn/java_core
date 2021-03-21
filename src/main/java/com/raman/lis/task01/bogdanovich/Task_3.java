package com.raman.lis.task01.bogdanovich;

public class Task_3 {

    public static void main(String[] args) {
        int l, n0, i, t, m=5, sum = 0;
        int array[] = new int[m];
        for(i = 0; i < m; i++) {
            array[i] = (int) (Math.random() * 10 + 3);
            System.out.println(array[i]);
        }
        l = m / 2;
        for(i = 0; i < l; i++) {
            t = array[i];
            array[i] = array[m - i - 1];
            array[m - i - 1] = t;

        }
        System.out.println("___________________________");
        for(i = 0; i < m; i++) {
            System.out.println(array[i]);}
        //System.out.println("Сумма = " + l);

    }
}
