public class Task5 {
    public static void main (String... args) {
        int array[][] = {{25, 34, 43, 65,}, {98, 52, 62, 12}};
        int diagCounter = 0;
        int otherCounter = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (j == i && array[i][j] == 1)
                    diagCounter++;
                if (j != i && array[i][j] == 0)
                    otherCounter++;
            }
        }
            if (diagCounter == array.length && otherCounter == (array.length * (array.length - 1)))
                System.out.println("this massive is not triangle matrix");
            else
                System.out.println("this massive is triangle matrix");
        }
    }
