package com.raman.lis.task01.badrova;

public class Task_3 {

    public static void main(String[] args) {

        String[] massive = {" вы. ", " должны ", " все ", " их ", " Испробовать ",
                " есть. ", " цель ", " достич ", " путей ", " много ", " Всегда "};

        for (int i = 0; i < massive.length; i++) {
            System.out.print(massive[i]);
        }

        System.out.println();

        String result = "";
        for (int i = massive.length - 1; i >= 0; i--) {
            result = result + massive[i];
        }
        System.out.println(result);
    }
}
