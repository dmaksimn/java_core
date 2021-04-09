package com.raman.lis.task03.me.service;

import com.raman.lis.task03.me.model.EngineVol;
import com.raman.lis.task03.me.model.WheelSize;

public interface CreateCar<T, M, D, C> {

    T createCar(C color,
                M model,
                EngineVol engineVol,
                WheelSize wheelSize,
                int year,
                D details);

}
