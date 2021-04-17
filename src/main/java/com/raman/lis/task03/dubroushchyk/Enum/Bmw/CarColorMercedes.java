package com.raman.lis.task03.dubroushchyk.Enum.Bmw;

import com.raman.lis.task03.dubroushchyk.ICarColor;

public enum CarColorMercedes implements ICarColor {
    YELLOW("YELLOW"),
    RED("RED"),
    BLACK("BLACK");

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
