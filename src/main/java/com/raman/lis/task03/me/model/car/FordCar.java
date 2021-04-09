package com.raman.lis.task03.me.model.car;

import com.raman.lis.task03.me.exception.ColorException;
import com.raman.lis.task03.me.model.EngineVol;
import com.raman.lis.task03.me.model.WheelSize;
import com.raman.lis.task03.me.model.color.CarColor;
import com.raman.lis.task03.me.model.color.FordColorsEnum;
import com.raman.lis.task03.me.model.model.FordModelEnum;

import java.util.Arrays;
import java.util.HashSet;

@SuppressWarnings("unused")
public class FordCar extends AbstractCar {

    private boolean offRoad;

    public FordCar(FordColorsEnum color,
                   FordModelEnum model,
                   int year,
                   WheelSize wheelSize,
                   EngineVol engineVol,
                   boolean offRoad,
                   String... options) {
        super(color, model, year, wheelSize, engineVol);
        this.offRoad = offRoad;

        if (options.length > 0) {
            setOptions(new HashSet<>(Arrays.asList(options)));
        }
    }

    @Override
    public void changeColor(CarColor color) throws ColorException {
        if (!(color instanceof FordColorsEnum)) {
            throw new ColorException("Passed color noty supported");
        }
        setColor(color);
    }

    @Override
    public StringBuilder getForPrint() {
        StringBuilder sb = super.getForPrint();
        sb.append("\tFordCar [").append("offRoad: ").append(offRoad).append("]");
        return sb;
    }

    public boolean isOffRoad() {
        return offRoad;
    }

    public void setOffRoad(boolean offRoad) {
        this.offRoad = offRoad;
    }

}
