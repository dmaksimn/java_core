package com.raman.lis.task03.me.model.details;

public class FordDetails extends AbstractDetails {

    private final boolean offRoad;

    public FordDetails(boolean offRoad) {
        this.offRoad = offRoad;
    }

    public boolean isOffRoad() {
        return offRoad;
    }

}
