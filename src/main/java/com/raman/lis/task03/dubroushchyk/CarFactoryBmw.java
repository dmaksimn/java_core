package com.raman.lis.task03.dubroushchyk;

//звёздочка потому-что мне все Enum константы из этих package надо
import com.raman.lis.task03.dubroushchyk.Enum.Bmw.*;
import java.util.Arrays;

public class CarFactoryBmw extends CarFactory {

    private int currentYear = 2021;
    private int minYearForCreateCar = currentYear -10;

    public CarFactoryBmw(ServiceColor serviceColor, ServiceWheels serviceWheels,
                         ServiceOptional serviceOptional) {
        super(serviceColor, serviceWheels, serviceOptional);

        addCarInStorage(new CarBmw(CarColorBmw.RED,CarModelBmw.M4, 2020,
                CarSizeWheelsBmw.Low, CarEngineVolumeBmw.LOW_VOLUME));
        addCarInStorage(new CarBmw(CarColorBmw.YELLOW,CarModelBmw.M5, 2005,
                CarSizeWheelsBmw.MIDDLE, CarEngineVolumeBmw.MIDDLE_VOLUME));
        addCarInStorage(new CarBmw(CarColorBmw.BLACK,CarModelBmw.X6, 2009,
                CarSizeWheelsBmw.HIGH, CarEngineVolumeBmw.HIGH_VOLUME));
    }

    public Car createCar(CarColorBmw color, CarModelBmw model, int yearProduction,
                         CarSizeWheelsBmw sizeWheels, CarEngineVolumeBmw engineVolume)
                         throws IllegalArgumentException {
        if (yearProduction > currentYear || yearProduction < minYearForCreateCar) {
            throw new IllegalArgumentException("Illegal value yearProduction for carFactoryBMW in" +
                    " class CarFactoryBmw");
        }
        Car car = compareCarInStorage(color, model, yearProduction, sizeWheels, engineVolume);
        if (car != null) {
            return car;
        } else {
            return new CarBmw(color, model, yearProduction, sizeWheels, engineVolume);
        }
    }

    @Override
    protected void stringAutoOnStorageFactory() {
        System.out.println("Авто на складе завода BMW");
    }

    @Override
    public void printPropertyCar() {
        StringBuilder builder = new StringBuilder();
        builder.append("Вывод списка возможных свойст авто завода BMW" + "\n");
        builder.append("Возможный цвет авто: " + Arrays.toString(CarColorBmw.values()) + "\n");
        builder.append("Возможный объём двигателя: " + Arrays.toString(CarEngineVolumeBmw.values()) + "\n");
        builder.append("Возможная модель авто: " + Arrays.toString(CarModelBmw.values()) + "\n");
        builder.append("Возможный размер дисков: " + Arrays.toString(CarSizeWheelsBmw.values()) + "\n");
        System.out.println(builder);
    }
}

