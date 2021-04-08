package com.raman.lis.task03.dubroushchyk.Enum;

public enum CarOptions {

    HEATERMIRROR ("Обогрев зеркал"),
    BIGSPOILER("Большой спойлер"),
    THREECHAIR("Три сиденья");

    private String options;

    CarOptions(String options) {
        this.options = options;
    }

    public String getOptions() {
        return options;
    }
}
