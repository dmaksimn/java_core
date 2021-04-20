package com.Task.Task07.CarEnum;

import com.Task.Task07.CarInterface.CarEngineVolumeInterface;

public enum CarEngineVolume implements CarEngineVolumeInterface {

    Small("0.8"),
    Little("1.3"),
    Medium_Volume("1.6"),
    Big("2.0"),
    TrackCar("2.5"),
    RaceCar("3.5"),
    TrueAmericanMuscle("6.7"),
    ;

    private String volume;

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