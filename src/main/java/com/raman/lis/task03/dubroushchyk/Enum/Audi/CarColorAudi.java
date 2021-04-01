package com.raman.lis.task03.dubroushchyk.Enum.Audi;

public enum CarColorAudi {
    WHITE("WHITE"),
    PINK("PINK"),
    BLACK("BLACK");

    private String string;

    CarColorAudi(String string) {
        this.string = string;
    }

    public String getColor() {
        return string;
    }
}
