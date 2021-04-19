package com.raman.lis.task03.bedareva;

public enum Option {

    HEATED_SEATS("Подогрев сидений"),
    AUTO_LOCK_DOOR("автоблокировка дверей"),
    TIRE_PRESSURE_SENSORS("датчики давления в шинах");

    private String option;

    Option(String option) {
        this.option = option;
    }

    public String getOption() {
        return option;
    }
}
