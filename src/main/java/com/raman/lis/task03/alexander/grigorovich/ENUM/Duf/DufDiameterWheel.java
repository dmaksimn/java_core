package com.raman.lis.task03.alexander.grigorovich.ENUM.Duf;

public enum DufDiameterWheel {

    TWENTY_FIFTH(25),
    TWENTY_SIXTH(26);

    private int dufDiameterWheel;

    DufDiameterWheel(int dufDiameterWheel) {
        this.dufDiameterWheel = dufDiameterWheel;
    }

    public int getDufDiameterWheel() {
        return dufDiameterWheel;
    }

    @Override
    public String toString() {
        return "DufDiameterWheel{" +
                "dufDiameterWheel=" + dufDiameterWheel +
                '}';
    }
}