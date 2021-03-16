package com.raman.lis.task01.dubroushchyk;

public class Task_8_star_2 {

    public static void main(String[] args) {
        int[] array = new int[1];

        int sum = 1;
        int preLastValueArray = 1;
        int lowToHighSum = 2;
        int highToLowSum = 2;
        int lengthArray = 0;

        if (array.length > 1) {
            if (array[1] < array[0]) {
                sum = 2;
                highToLowSum++;
            }
            for (int i = 1; i < array.length - 1; i++) {
                if (array[i] == 0) {
                    sum++;
                    highToLowSum = 2;
                    lowToHighSum = 2;
                    preLastValueArray = 1;
                } else if (((array[i] > array[i - 1]) && (array[i + 1] > array[i]))
                        | ((array[i] > array[i - 1]) && (array[i - 1] >= array[i + 1]))) {
                    highToLowSum = 1;
                    sum += lowToHighSum;
                    preLastValueArray = lowToHighSum;
                    lowToHighSum++;
                } else if (array[i] > array[i - 1]) {
                    lowToHighSum = 1;
                    sum += highToLowSum;
                    preLastValueArray = highToLowSum;
                    highToLowSum++;
                } else if (array[i] < array[i - 1]) {
                    sum = sum + highToLowSum;
                    preLastValueArray = highToLowSum;
                    highToLowSum++;
                    lowToHighSum = 2;
                } else {
                    sum++;
                    preLastValueArray = 1;
                    highToLowSum = 2;
                    lowToHighSum = 2;
                }
                lengthArray++;
            }
            if (array[lengthArray + 1] <= array[lengthArray]) {
                sum++;
            } else if (array[lengthArray + 1] > array[lengthArray]) {
                sum = sum + (++preLastValueArray);
            }
        }
        System.out.println(sum);
    }
}
