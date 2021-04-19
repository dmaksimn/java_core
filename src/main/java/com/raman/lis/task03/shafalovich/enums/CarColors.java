package com.raman.lis.task03.shafalovich.enums;

public enum CarColors {
    BLACK("Black"),
    WHITE("White"),
    RED("Red"),
    BLUE("Blue");

    private String color;

    CarColors(String str) {
        color = str;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return String.valueOf(color);
    }

    public static String print() {
        StringBuilder sb = new StringBuilder();
        sb.append(BLACK).append(" ").
                append(WHITE).append(" ").
                append(RED).append(" ").
                append(BLUE);
        return sb.toString();
    }
}
