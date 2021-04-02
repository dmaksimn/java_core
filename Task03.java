package com.Lesson10;

import java.util.ArrayList;
import java.util.List;

public class Task03 {

    public static void main(String... args) {
        addListElement("hi");
        addListElement("hihi");
        Print();
        getFromHead("hi");
        Print();
        removeFromHead("hi");
        Print();
    }

    private static List<String> List = new ArrayList<>();

    public static String addListElement(String str) {
        List.add(str);
        return List.toString();
    }

    public static String getFromHead(String str) {
       return List.get(0);
    }

    public static String removeFromHead(String str) {

        List.remove("hi");

        if (!List.isEmpty()) {
            return "object from list";
        }
        else {
            return null;
        }
    }
    public static void Print() {
        System.out.println(List.toString());
    }
}