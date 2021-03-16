package com.raman.lis.task01.bedareva;

public class Task_8 {

    public static void main(String[] args) {
        int[] a = {};
        int[] b = new int[a.length]; // массив с суммами стипендий
        int[] c = new int[a.length]; // промежут. массив с суммами стипендий при возрастании рейтингов
        int[] d = new int[a.length]; // промежут. массив с суммами стипендий при убывании рейтингов
        int min = a[0];
        int sum = 0;
        // находим минимальный рейтинг(стипендия будет равна 1р)
        for (int j = 1; j < a.length; j++) {
            if (a[j] < min) {
                min = a[j];
            }
        }
        if (a.length == 1) {
            sum = 1;
            System.out.println(sum);
        }
        if (a.length > 1) {
            // присваиваем промежуточным массивам и итоговому массиву 1 р, в позициях где ретинг минимальный илм минимальный по отношению к соседям
            for (int i = 0; i < a.length; i++) {
                if (i < a.length - 1 && i > 0) {
                    if (a[i] == min || (a[i] <= a[i + 1] && a[i] <= a[i - 1])) {
                        b[i] = c[i] = d[i] = 1;
                    }
                }
                if (i == 0) {
                    if (a[i] == min || a[i] < a[i + 1]) {
                        b[i] = c[i] = d[i] = 1;
                    }
                    if (a[i] > a[i + 1]) {
                        b[i] = c[i] = d[i] = 0;
                    }
                }
                if (i == a.length - 1) {
                    if (a[i] < a[i - 1] || a[i] == min) {
                        b[i] = c[i] = d[i] = 1;
                    } else {
                        b[i] = c[i] = d[i] = 0;
                    }
                }
            }
            // заполняем промежут. массив с суммами стипендий при возрастании рейтингов
            for (int t = 0; t < b.length; t++) {
                if (c[t] == 1) {
                    for (int l = 0; l < b.length && t + l <= b.length - 2; l++) {
                        if (a[t + l] < a[t + l + 1]) {
                            c[t + l + 1] = c[t + l] + 1;
                        } else {
                            break;
                        }
                    }
                }
            }
            // заполняем промежут. массив с суммами стипендий при убывании рейтингов
            for (int h = d.length - 1; h >= 0; h--) {
                if (d[h] == 1) {
                    if (h > 0) {
                        for (int n = 0; n < d.length && h - n <= b.length - 1 && h - n >= 1; n++) {
                            if (a[h - n] < a[h - n - 1]) {
                                d[h - n - 1] = d[h - n] + 1;
                            } else {
                                break;
                            }
                        }
                    }

                    if (h == 0) {
                        d[h] = 1;
                    }
                }
            }
            // сращиваем промежут массивы c и d в единый b. При этом учитывыем, что могут быть разные значения в промеж. массивах на одном и том же месте.
            for (int y = 0; y < a.length; y++) {
                b[y] = Math.max(c[y], d[y]);
            }
            // высчитываем сумму значений массива b
            for (int s = 0; s < b.length; s++) {
                sum = sum + b[s];
            }
            System.out.print(sum);
        }
    }
}
