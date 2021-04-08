package com.raman.lis.task03.dubroushchyk.Enum.Audi;

import com.raman.lis.task03.dubroushchyk.ICarColor;

public enum CarColorAudi implements ICarColor {

    WHITE("WHITE"),
    PINK("PINK"),
    BLACK("BLACK");

    private String string;

    CarColorAudi(String string) {
        this.string = string;
    }

    @Override
    public String getColor() {
        return string;
    }
}
