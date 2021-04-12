package com.raman.lis.task03.shafalovich;

public enum CarColors {
    BLACK("Black"),
    WHITE("White"),
    RED("Red"),
    BLUE("Blue");

    private String string;

    CarColors(String str) {
        string = str;
    }

    public String getColor() {
        return string;
    }

    @Override
    public String toString() {
        return String.valueOf(string);
    }
}
