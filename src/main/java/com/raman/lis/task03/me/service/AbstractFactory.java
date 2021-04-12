package com.raman.lis.task03.me.service;

import com.raman.lis.task03.me.model.EngineVol;
import com.raman.lis.task03.me.model.WheelSize;
import com.raman.lis.task03.me.model.car.AbstractCar;
import com.raman.lis.task03.me.model.color.CarColor;
import com.raman.lis.task03.me.model.details.AbstractDetails;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public abstract class AbstractFactory<
        T extends AbstractCar,
        D extends AbstractDetails,
        C extends CarColor,
        M extends Enum<M>> implements CreateCar<T, M, D, C> {

    private final Class<M> modelClass;
    private final Class<C> colorClass;

    private final List<T> storage = new ArrayList<>();

    public AbstractFactory(Class<M> modelClass, Class<C> colorClass) {
        this.modelClass = modelClass;
        this.colorClass = colorClass;
    }

    public List<M> getModels() {
        return new ArrayList<>(Arrays.asList(modelClass.getEnumConstants()));
    }

    public List<C> getColors() {
        return new ArrayList<>(Arrays.asList(colorClass.getEnumConstants()));
    }

    public List<EngineVol> getEngines() {
        return new ArrayList<>(Arrays.asList((EngineVol.values())));
    }

    public List<WheelSize> getWheelSizes() {
        return new ArrayList<>(Arrays.asList(WheelSize.values()));
    }

    protected T getFromStorageByParams(M model, EngineVol engineVol, int year) {
        for (int i = 0; i < storage.size(); i++) {
            T car = storage.get(i);
            if (car.getModel().equals(model)
                    && car.getEngineVol().equals(engineVol)
                    && car.getYear() == year) {
                storage.remove(car);
                System.out.println("Get from storage");
                return car;
            }
        }
        return null;
    }

    public void addToStorage(T car) {
        this.storage.add(car);
    }

    public void setOptions(T car, D details) {
        HashSet<String> options = details.getOptions();
        if (options != null && !options.isEmpty()) {
            car.setOptions(options);
        }
    }

}
