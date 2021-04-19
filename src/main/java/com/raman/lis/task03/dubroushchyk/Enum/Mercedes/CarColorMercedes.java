package com.raman.lis.task03.dubroushchyk.Enum.Mercedes;

import com.raman.lis.task03.dubroushchyk.ICarColor;

public enum CarColorMercedes implements ICarColor {
    BLACK("BLACK"),
    GREY("GREY"),
    ORANGE("ORANGE");

    private String string;

    CarColorMercedes(String string) {
        this.string = string;
    }

    @Override
    public String getColor() {
        return string;
    }

    @Override
    public String toString() {
        return String.valueOf(string);
    }
}
