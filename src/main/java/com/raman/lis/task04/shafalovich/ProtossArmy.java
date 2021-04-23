package com.raman.lis.task04.shafalovich;

public class ProtossArmy extends Army{

    ProtossArmy () {
        setArmyName("Protoss");
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


