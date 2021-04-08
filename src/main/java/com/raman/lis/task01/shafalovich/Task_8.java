package com.raman.lis.task01.shafalovich;

public class Task_8 {

    public static void main(String[] args) {
        int[] arrayPlus2 = {1, 2, 3, 4, 5, 3, 2, 1, 2, 6, 5, 4, 3, 3, 2, 1, 1, 3, 3, 3, 4, 2};
        int pay = 1;
        int fullPay = 0;

        System.out.println("Задание 2*: ");
        System.out.print("Заданный массив: ");

        for (int i = 0; i < arrayPlus2.length; i++){

            if (i == 0) fullPay += pay;

            if (i < arrayPlus2.length - 1 && i != 0) {
                if (arrayPlus2[i] < arrayPlus2[i+1]) fullPay += ++pay;

                if (arrayPlus2[i] > arrayPlus2[i+1]) {
                    if (pay >= 2) fullPay += --pay;
                    else fullPay++;
                }

                if (arrayPlus2[i] == arrayPlus2[i+1]) fullPay += ++pay;
            }

            if (i == arrayPlus2.length - 1) {
                if (arrayPlus2[i] < arrayPlus2[i-1]) fullPay += --pay;

                if (arrayPlus2[i] > arrayPlus2[i-1]) {
                    if (pay >= 2) fullPay += ++pay;
                    else fullPay++;
                }

                if (arrayPlus2[i] == arrayPlus2[i-1]) fullPay += ++pay;
            }


            System.out.print(arrayPlus2[i] + " ");
        }
        System.out.println("У деканата должно быть минимум " + fullPay + " рублей");
    }
}
