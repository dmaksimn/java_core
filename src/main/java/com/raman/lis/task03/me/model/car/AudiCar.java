package com.raman.lis.task03.me.model.car;

import com.raman.lis.task03.me.exception.ColorException;
import com.raman.lis.task03.me.model.EngineVol;
import com.raman.lis.task03.me.model.WheelSize;
import com.raman.lis.task03.me.model.color.AudiColorsEnum;
import com.raman.lis.task03.me.model.color.CarColor;
import com.raman.lis.task03.me.model.model.AudiModelEnum;

import java.util.Arrays;
import java.util.HashSet;

@SuppressWarnings("unused")
public class AudiCar extends AbstractCar {

    private boolean quartoInstalled;

    public AudiCar(AudiColorsEnum color,
                   AudiModelEnum model,
                   int year,
                   WheelSize wheelSize,
                   EngineVol engineVol,
                   boolean quartoInstalled,
                   String... options) {
        super(color, model, year, wheelSize, engineVol);
        this.quartoInstalled = quartoInstalled;

        if (options.length > 0) {
            setOptions(new HashSet<>(Arrays.asList(options)));
        }
    }

    @Override
    public void changeColor(CarColor color) throws ColorException {
        if (!(color instanceof AudiColorsEnum)) {
            throw new ColorException("Passed color noty supported");
        }
        setColor(color);
    }

    @Override
    public StringBuilder getForPrint() {
        StringBuilder sb = super.getForPrint();
        sb.append("\tAudiCar [")
                .append("quartoInstalled: ").append(quartoInstalled)
                .append("]");
        return sb;
    }

    public boolean isQuartoInstalled() {
        return quartoInstalled;
    }

    public void setQuartoInstalled(boolean quartoInstalled) {
        this.quartoInstalled = quartoInstalled;
    }

}
