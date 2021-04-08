package com.raman.lis.task03.dubroushchyk.Enum.Bmw;

import com.raman.lis.task03.dubroushchyk.ICarColor;

public enum CarColorBmw implements ICarColor {
    YELLOW("YELLOW"),
    RED("RED"),
    BLACK("BLACK");

    private String string;

    CarColorBmw(String string) {
        this.string = string;
    }

    @Override
    public String getColor() {
        return string;
    }
}
