package com.Task.Task07.CarProperties;

import com.Task.Task07.CarInterface.CarOptionInterface;

public enum CarOption implements CarOptionInterface {

    AIR_CONDITION("Air_Condition"),
    CRUISE_CONTROL("Cruise_Control"),
    ALL_WHEELS_DRIVE("All_Wheels_Drive"),
    HERRINGBONE_STINK("Herringbone_Stink"),
    ;

    private final String option;

    CarOption(String option) {
        this.option = option;
    }

    public String getOption() {
        return option;
    }
}