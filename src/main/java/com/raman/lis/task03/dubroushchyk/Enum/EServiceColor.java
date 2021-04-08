package com.raman.lis.task03.dubroushchyk.Enum;

public enum EServiceColor {

    WHITE("WHITE"),
    PINK("PINK"),
    BLACK("BLACK"),
    BROWN ("BROWN"),
    RED("RED"),
    YELLOW("YELLOW");

    private String string;

    EServiceColor(String string) {
        this.string = string;
    }

    public String getColor() {
        return string;
    }
}
