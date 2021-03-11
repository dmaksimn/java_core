package Task01;

public class Task_3 {

//            Задание 3
//        Дан некоторый массив, суть задания инвертировать его.

    public static void main(String[] args) {

        int[] arrayFirst = {3, 5, -2, 4, 4, 2, 8, 1};
        int[] arraySecond = new int[arrayFirst.length];

        for (int i = 0; i < arrayFirst.length; i++) {
            arraySecond[(arrayFirst.length - 1) - i] = arrayFirst[i];
        }

        for (int i = 0; i < arraySecond.length; i++) {
            System.out.print(arraySecond[i] + " ");
        }

    }
}
