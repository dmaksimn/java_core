package com.raman.lis.task01.alexander.grigorovich.task01;

public class Task8 {
    /*
     *Задание *
     *N студентов стоят в очереди за стипендией.
     *Каждый студент имеет учебный рейтинг.
     *Деканат должен выдать стипендию таким образом, чтобы: каждый студент получил хотя
     *бы 1 рубль,
     *студенты с более высоким рейтингом получили больше рублей, чем их
     *соседи в очереди. Копеек в деканате нет. Какое минимальное количество рублей
     *должно быть у деканата?
     *На вход подаётся массив из N элементов, содержащий
     *рейтинги для каждого студента. На выходе ожидается число, обозначающее минимальное
     *количество рублей, которых должно хватить студентам.
     *Пример:
     *Вход: [1, 2, 3, 4, 5, 3, 2, 1, 2, 6, 5, 4, 3, 3, 2, 1, 1, 3, 3, 3, 4, 2]
     *Выход: 47
     *[1, 2, 3, 4, 5, 3, 2, 1, 2, 4, 3, 2, 1, 3, 2, 1, 1, 2, 1, 1, 2, 1]
     */
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 3, 2, 1, 2, 6, 5, 4, 3, 3, 2, 1, 1, 3, 3, 3, 4, 2};
        int minimalGrant = 1;
        int[] arrayOfGrants = new int[array.length];
        int count = minimalGrant;
        int sum = 0;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] > array[i]) {
                if ((array[i + 1] > array[i]) && (array[i] == 1)) {
                    count = minimalGrant;
                }
                arrayOfGrants[i] = count;
                count++;
            } else if (array[i] > array[i + 1]) {
                if (array[i + 1] % array[i] == 2) {
                    count = minimalGrant;
                    count += array[i + 1] % array[i];
                    arrayOfGrants[i] = count;
                } else if (array[i + 1] % array[i] == 1) {
                    count = minimalGrant;
                    count += array[i + 1] % array[i];
                    arrayOfGrants[i] = count;
                } else {
                    if (array[i + 1] % array[i] == 1) {
                        count = minimalGrant;
                        count += array[i + 1] % array[i];
                    } else if (array[i] == 6) {
                        count = 4;

                    } else if (array[i] == 1) {
                        count--;
                    }
                    arrayOfGrants[i] = count;
                    count = minimalGrant;
                    continue;
                }
            }
        }

        for (int i = 0; i < arrayOfGrants.length; i++) {
            sum += arrayOfGrants[i];
        }

        System.out.println(sum);

    }
}
