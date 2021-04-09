package com.raman.lis.task03.me.model.car;

import com.raman.lis.task03.me.exception.ColorException;
import com.raman.lis.task03.me.model.EngineVol;
import com.raman.lis.task03.me.model.WheelSize;
import com.raman.lis.task03.me.model.color.BMWColorsEnum;
import com.raman.lis.task03.me.model.color.CarColor;
import com.raman.lis.task03.me.model.model.BMWModelEnum;

import java.util.Arrays;
import java.util.HashSet;

@SuppressWarnings("unused")
public class BMWCar extends AbstractCar {

    private boolean mVersion;

    public BMWCar(BMWColorsEnum color,
                  BMWModelEnum model,
                  int year,
                  WheelSize wheelSize,
                  EngineVol engineVol,
                  boolean mVersion,
                  String... options) {
        super(color, model, year, wheelSize, engineVol);
        this.mVersion = mVersion;

        if (options.length > 0) {
            setOptions(new HashSet<>(Arrays.asList(options)));
        }
    }

    @Override
    public void changeColor(CarColor color) throws ColorException {
        if (!(color instanceof BMWColorsEnum)) {
            throw new ColorException("Passed color noty supported");
        }
        setColor(color);
    }

    @Override
    public StringBuilder getForPrint() {
        StringBuilder sb = super.getForPrint();
        sb.append("\tBMWCar [").append("mVersion: ").append(mVersion).append("]");
        return sb;
    }

    public boolean ismVersion() {
        return mVersion;
    }

    public void setmVersion(boolean mVersion) {
        this.mVersion = mVersion;
    }

}
