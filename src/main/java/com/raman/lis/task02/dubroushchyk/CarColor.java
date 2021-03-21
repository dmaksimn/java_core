package com.raman.lis.task02.dubroushchyk;

public enum CarColor {
    GREEN("GREEN"),
    BLUE("BLUE"),
    BLACK("BLACK");

    private String string;

    CarColor(String string) {
        this.string = string;
    }

    public String getColor() {
        return string;
    }
}
