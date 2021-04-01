package com.raman.lis.task03.dubroushchyk.Enum.Bmw;

public enum CarColorBmw {
    YELLOW("YELLOW"),
    RED("RED"),
    BLACK("BLACK");

    private String string;

    CarColorBmw(String string) {
        this.string = string;
    }

    public String getColor() {
        return string;
    }
}
