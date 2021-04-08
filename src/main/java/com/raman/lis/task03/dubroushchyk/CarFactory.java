package com.raman.lis.task03.dubroushchyk;

import com.raman.lis.task03.dubroushchyk.Enum.CarOptions;
import com.raman.lis.task03.dubroushchyk.Enum.EServiceColor;

import java.util.ArrayList;
import java.util.List;

public abstract class CarFactory implements ICarFactory {

    private final ServiceColor serviceColor;
    private final ServiceWheels serviceWheels;
    private final ServiceOptional serviceOptional;
    private final List<Car> carStorage = new ArrayList<>();;

    public CarFactory(ServiceColor serviceColor, ServiceWheels serviceWheels,
                      ServiceOptional serviceOptional) {
        this.serviceColor = serviceColor;
        this.serviceWheels = serviceWheels;
        this.serviceOptional = serviceOptional;
    }

    protected void addCarInStorage(Car car) {
        carStorage.add(car);
    }

    protected Car compareCarInStorage(ICarColor color, ICarModel model, int yearProduction,
                                      ICarSizeWheels sizeWheels, ICarEngine engineVolume) {
        for (int i = 0; i < carStorage.size(); i++) {
            if (carStorage.get(i).compareCar(color.getColor(), model.getModel(), yearProduction,
                    sizeWheels.getSizeWheels(), engineVolume.getVolume())) {
                Car car = carStorage.get(i);
                carStorage.remove(i);
                return car;
            }
        }
        return null;
    }

    protected void stringAutoOnStorageFactory() {
        System.out.println("\nАвто на складе завода");
    }

    @Override
    public void storageInfo() {
        stringAutoOnStorageFactory();
        if (carStorage.size() >= 1) {
            System.out.println(toString(carStorage.toArray()));
        } else {
            System.out.println("Склад пустой" + "\n");
        }
    }

    @Override
    public Car getCarFromStorageNumberAuto(int numberAutoOnStorage) {
        if (numberAutoOnStorage > carStorage.size() || numberAutoOnStorage <= 0) {
            System.out.println("Нет авто под таким номеров или склад пустой");
            return null;
        }
        Car car = carStorage.get(numberAutoOnStorage - 1);
        carStorage.remove(numberAutoOnStorage - 1);
        return car;
    }

    public abstract void printPropertyCar();

    public void changeServiceColor(Car car, EServiceColor color) {
        serviceColor.changeCarColorInCar(car, color);
    }

    public void changeServiceWheels(Car car, int wheels) throws IllegalArgumentException {
        serviceWheels.changeCarWheelsInCar(car, wheels);
    }

    public void addServiceOptional(Car car, CarOptions options) {
        serviceOptional.addOptionalInCar(car, options);
    }

    public void removeServiceOptional(Car car, CarOptions options) {
        serviceOptional.removeOptionalInCar(car, options);
    }

    private String toString(Object[] a) {
        if (a == null)
            return "null";

        int counter = 1;
        int iMax = a.length - 1;
        if (iMax == -1) {
            return "Нет авто на складе";
        }

        StringBuilder b = new StringBuilder();
        for (int i = 0; ; i++) {
            b.append("Номер авто на складе: " + counter + "\n");
            counter++;
            b.append(String.valueOf(a[i]));
            if (i == iMax) {
                return b.append(' ').toString();
            }
        }
    }
}







