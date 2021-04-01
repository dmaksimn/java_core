package com.raman.lis.task03.dubroushchyk.Enum.Mercedes;

public enum CarColorMercedes {
    BLACK("BLACK"),
    GREY("GREY"),
    ORANGE("ORANGE");

    private String string;

    CarColorMercedes(String string) {
        this.string = string;
    }

    public String getColor() {
        return string;
    }
}
