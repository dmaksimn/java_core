package com.raman.lis.task04.shafalovich;

public abstract class Army implements Runnable {

    private String ArmyName;
    protected int armySize = 0;
    protected int robotProgress = 0;
    private boolean isHead = false;
    private boolean isBody = false;
    private boolean isHands = false;
    private boolean isLegs = false;
    private boolean isGun = false;

    public void setArmyName(String armyName) {
        ArmyName = armyName;
    }

    public String getArmyName() {
        return ArmyName;
    }

    public void create() {
        if (Factory.checkDetail() == Details.HEAD && !isHead) {
            System.out.println("Army " + ArmyName + ": get " + Factory.checkDetail() + " detail");
            isHead = true;
            Factory.getDetail();
            robotProgress++;
        } else if (Factory.checkDetail() == Details.BODY && !isBody) {
            System.out.println("Army " + ArmyName + ": get " + Factory.checkDetail() + " detail");
            isBody = true;
            Factory.getDetail();
            robotProgress++;
        } else if (Factory.checkDetail() == Details.HANDS && !isHands) {
            System.out.println("Army " + ArmyName + ": get " + Factory.checkDetail() + " detail");
            isHands = true;
            Factory.getDetail();
            robotProgress++;
        } else if (Factory.checkDetail() == Details.LEGS && !isLegs) {
            System.out.println("Army " + ArmyName + ": get " + Factory.checkDetail() + " detail");
            isLegs = true;
            Factory.getDetail();
            robotProgress++;
        } else if (Factory.checkDetail() == Details.GUNS && !isGun) {
            System.out.println("Army " + ArmyName + ": get " + Factory.checkDetail() + " detail");
            isGun = true;
            Factory.getDetail();
            robotProgress++;
        }
    }

    public void zeroing() {
        robotProgress = 0;
        isHead = false;
        isBody = false;
        isHands = false;
        isLegs = false;
        isGun = false;
    }

}
