package Task01;

public class Task_5 {
//            Задание 5
//        Дан некоторый двумерный массив. Нужно определить является ли он нижней
//        треугольной матрицей или же нет.

    public static void main(String[] args) {

        int[][] array = { {1, 0, 0, 0, 0},
                          {0, 1, 2, 0, 0},
                          {0, 0, 0, 0, 0},
                          {0, 0, 0, 1, 0},
                          {0, 0, 0, 0, 1} };

        boolean highMatrix = true, lowMatrix = true;
        boolean zeroUniMatrix = true, oneUniMatrix = true;
        boolean arrayOk = true;
        int stringArray = 0;
        int columnArray = 0;
        int preStringArray = array[0].length;

        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array[i].length; j++) {
                if ((preStringArray != array[i].length) && (arrayOk == true)) {
                    arrayOk = false;
                }
                preStringArray = array[i].length;
                stringArray = array[i].length;
            }
            columnArray++;
        }

        if (!arrayOk | (stringArray != columnArray)) {
            System.out.println("Матрица не квадратная");
            arrayOk = false;
        }

        while (arrayOk) {
            for (int i = 0; i < array.length; i++) {
                for (int j = i + 1; j < array[i].length; j++) {
                    if ((array[i][j]) != 0 && (highMatrix == true)) {
                        highMatrix = false;
                    }
                }

                for (int h = i; h > 0; h--) {
                    if (array[i][h - 1] != 0 && (lowMatrix == true)) {
                        lowMatrix = false;
                    }
                }

                if ((array[i][i] != 0) && (array[i][i] > 1)) {
                    zeroUniMatrix = false;
                    oneUniMatrix = false;
                } else if (array[i][i] == 0) {
                    oneUniMatrix = false;
                } else {
                    zeroUniMatrix = false;
                }
            }

            arrayOk = false;

            if (oneUniMatrix == true && (highMatrix == true || lowMatrix == true)) {
                System.out.println("Матрица: унитреугольная");
            } else if (highMatrix == true && lowMatrix == false && zeroUniMatrix == false) {
                System.out.println("Матрица: нижняя треугольная");
            } else if (highMatrix == false && lowMatrix == true && zeroUniMatrix == false) {
                System.out.println("Матрица: верхняя треугольная");
            } else if (highMatrix == true && lowMatrix == true && zeroUniMatrix == true) {
                System.out.println("Матрицы: нулевая");
            } else if (highMatrix == true && lowMatrix == true && oneUniMatrix == false) {
                System.out.println("Матрица: диагональная");
            } else {
                System.out.println("матрица: обычная :))");
            }

        }

    }
}
