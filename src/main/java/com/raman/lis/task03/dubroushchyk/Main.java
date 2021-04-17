package com.raman.lis.task03.dubroushchyk;

//звёздочка потому-что мне все Enum константы из этих package надо
import com.raman.lis.task03.dubroushchyk.MenuVisualization.Salon_Visualization;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Salon_Visualization salon_visualization = new Salon_Visualization();
        salon_visualization.startProgram();
    }
}
