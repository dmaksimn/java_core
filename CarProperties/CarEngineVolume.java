package com.Task.Task07.CarProperties;

import com.Task.Task07.CarInterface.CarEngineVolumeInterface;

public enum CarEngineVolume implements CarEngineVolumeInterface {

    ZERO_DOT_EIGHTH("0.8"),
    ONE_DOT_THREE("1.3"),
    ONE_DOT_SIX("1.6"),
    TWO_DOT_ZERO("2.3"),
    TWO_DOT_FIVE("2.5"),
    THREE_DOT_FIVE("3.5"),
    SIX_DOT_SEVEN("6.7"),
    ;

    private final String volume;

    CarEngineVolume(String volume) {
        this.volume = volume;
    }

    public String getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "CarEngineVolume{" +
                "volume=" + volume +
                '}';
    }
}