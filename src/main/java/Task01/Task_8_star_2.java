package com.nikolay_dubroushchyk.Task01;

public class Task_8_star_2 {
//
//       Вход: [1, 2, 3, 4, 5, 3, 2, 1, 2, 6, 5, 4, 3, 3, 2, 1, 1, 3, 3, 3, 4, 2]
//       Выход: 47
//
//             [1, 2, 3, 4, 5, 3, 2, 1, 2, 4, 3, 2, 1, 3, 2, 1, 1, 2, 1, 1, 2, 1]

    public static void main(String[] args) {

        int[] array = {5, 0, 0};
        // 1, 2, 1, 2, 1, 2, 3, 1, 2, 4, 3, 2, 1, 3, 2, 1, 1, 2, 1, 1, 2, 1,

        int sum = 1;
        int preLastValueArray = 1;
        int lowToHighSum = 2;
        int highToLowSum = 2;
        int lengthArray = 0;
        int firstIf = 2;

        if (array.length > 1) {
            for (int i = 1; i < array.length - 1; i++) {
                if (((array[i] > array[i - 1]) && (array[i + 1] > array[i]))
                        | ((array[i] > array[i - 1]) && (array[i - 1] >= array[i + 1]))) {
                    highToLowSum = 1;
                    sum += firstIf;
                    firstIf++;
                } else if (array[i] > array[i - 1]) {
                    preLastValueArray = lowToHighSum;
                    sum += preLastValueArray;
                    lowToHighSum++;
                    highToLowSum = 2;
                    preLastValueArray = 1;
                } else if (array[i] < array[i - 1]) {
                    preLastValueArray = highToLowSum;
                    sum += preLastValueArray;
                    highToLowSum++;
                    lowToHighSum = 1;
                    firstIf = 2;
                } else {
                    sum++;
                    preLastValueArray = 1;
                    highToLowSum = 2;
                    lowToHighSum = 2;
                }
                lengthArray++;
            }

            if (array[lengthArray + 1] < array[lengthArray] && highToLowSum > 2) {
                sum = sum + (++preLastValueArray);
            } else if (array[lengthArray + 1] > array[lengthArray]) {
                sum += firstIf;
            } else if ((array.length == 2) && (array[1] < array[0])){
                sum = 3;
            } else {
                sum++;
            }
            System.out.println(sum);
        }
    }
}
