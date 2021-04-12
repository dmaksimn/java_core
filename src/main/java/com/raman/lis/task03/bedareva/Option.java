package com.raman.lis.task03.bedareva;

public enum Option {

    HEATEDSEATS("Подогрев сидений"),
    AUTOLOCKDOOR("автоблокировка дверей"),
    TIREPRESSURESENSORS("датчики давления в шинах");

    private String option;

    Option(String option) {
        this.option = option;
    }

    public String getOption() {
        return option;
    }
}
