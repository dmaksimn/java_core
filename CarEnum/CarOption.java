package com.Task.Task07.CarEnum;

import com.Task.Task07.CarInterface.CarOptionInterface;

public enum CarOption implements CarOptionInterface {

    Air_Condition("Air_Condition"),
    Cruise_Control("Cruise_Control"),
    All_Wheels_Drive("All_Wheels_Drive"),
    Herringbone_Stink("Herringbone_Stink"),
    ;

    private String option;

    CarOption(String option) {
        this.option = option;
    }

    public String getOption() {
        return option;
    }
    }