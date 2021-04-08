package com.raman.lis.task03.darashenka;

public enum CarColor {
    RED("Red"),
    WHITE("White"),
    YELLOW("Yellow"),
    BLUE("Blue"),
    BLACK("Black"),
    ;
    private String string;

    CarColor(String string) {
        this.string = string;
    }

    public String getColor() {
        return string;
    }
}