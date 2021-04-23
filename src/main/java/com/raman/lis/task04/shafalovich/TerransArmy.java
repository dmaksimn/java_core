package com.raman.lis.task04.shafalovich;

public class TerransArmy extends Army {

    TerransArmy () {
        setArmyName("Terrans");
    }

    @Override
    public void run() {
        if (armySize != 20) {
            if (robotProgress < 5) {
                create();
            } else {
                armySize++;
                System.out.println(getArmyName() + " " + armySize);
                zeroing();
            }
        }
        if (armySize == 20) System.out.println(getArmyName() + " WIN!");
    }
}
